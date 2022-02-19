package com.example.listingtodoswithh2.controllers;

import com.example.listingtodoswithh2.models.ToDo;
import com.example.listingtodoswithh2.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ToDoController {

    private ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    /*
    @RequestMapping(value="/list", method= RequestMethod.GET)
    @ResponseBody
    public String list() {
        return "This is my first Todo";
    }
    */

    @RequestMapping(value="/list", method= RequestMethod.GET)
    public String list(Model model) {
        List<ToDo> toDoList = toDoService.getAllToDos();
        model.addAttribute("toDoList", toDoList);
        return "todo";
    }

}
