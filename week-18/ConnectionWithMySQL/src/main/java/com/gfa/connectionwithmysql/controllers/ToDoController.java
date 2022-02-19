package com.gfa.connectionwithmysql.controllers;

import com.gfa.connectionwithmysql.models.ToDo;
import com.gfa.connectionwithmysql.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collectors;

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
        List<ToDo> toDoList = toDoService.getAllToDos().stream()
                .filter(toDo -> !toDo.isDone())
                .collect(Collectors.toList());
        model.addAttribute("toDoList", toDoList);
        return "todo";
    }

}
