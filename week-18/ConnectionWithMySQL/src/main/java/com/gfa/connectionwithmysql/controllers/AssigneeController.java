package com.gfa.connectionwithmysql.controllers;

import com.gfa.connectionwithmysql.models.Assignee;
import com.gfa.connectionwithmysql.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AssigneeController {

    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @RequestMapping(value="/assignees", method= RequestMethod.GET)
    public String listAssignees (Model model) {
        List<Assignee> assigneeList = assigneeService.getAllAssignees();
        model.addAttribute("assigneeList", assigneeList);
        return "assignees";
    }

    @GetMapping("/add-assignee")
    public String addToAssignee() {
        return "add-assignee";
    }

    @PostMapping("/add-assignee")
    public String addToAssignee(@ModelAttribute Assignee assignee) {
        assigneeService.save(assignee);
        return "redirect:/assignees";
    }

    @GetMapping("/remove-assignee/{id}")
    public String removeAssignee(@PathVariable Long id) {
        assigneeService.removeAssignee(id);
        return "redirect:/assignees";
    }

    @GetMapping("/{id}/edit-assignee")
    public String editAssignee(@PathVariable Long id, Model model) {

        Assignee assigneeById = null;
        for(Assignee assignee : assigneeService.getAllAssignees()){
            if (assignee.getId() == id) {
                assigneeById = assignee;
            }
        }
        model.addAttribute("assignee", assigneeById);

        return "edit-assignee";
    }

    @PostMapping("/{id}/edit-assignee")
    public String editAssignee(@PathVariable long id, Assignee assignee) {

        assigneeService.save(assignee);

        return "redirect:/assignees";
    }
}

