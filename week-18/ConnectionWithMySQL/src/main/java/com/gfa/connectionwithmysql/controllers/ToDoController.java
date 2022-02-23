package com.gfa.connectionwithmysql.controllers;

import com.gfa.connectionwithmysql.models.ToDo;
import com.gfa.connectionwithmysql.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ToDoController {

    private ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @RequestMapping(value="/list", method= RequestMethod.GET)
    public String list(Model model) {
        List<ToDo> toDoList = toDoService.getAllToDos().stream()
                .filter(toDo -> !toDo.isDone())
                .collect(Collectors.toList());
        model.addAttribute("toDoList", toDoList);
        return "todo";
    }

    @GetMapping("/add-todo")
    public String renderAddToDo() {
        return "add-todo";
    }

    @PostMapping("/add-todo")
    public String addToDo(@ModelAttribute ToDo toDo) {
        toDoService.save(toDo);
        return "redirect:/list";
    }

    @GetMapping("/remove/{id}")
    public String removeToDo(@PathVariable Long id) {
        toDoService.removeToDo(id);
        return "redirect:/list";
    }

    @GetMapping("/{id}/edit")
    public String editToDo(@PathVariable Long id, Model model) {

        ToDo todoById = null;
        for(ToDo todo : toDoService.getAllToDos()){
            if (todo.getId() == id) {
                todoById = todo;
            }
        }
        //Optional todoById = toDoService.getAllToDos().stream().filter(toDo -> toDo.getId()==id).findFirst();

        model.addAttribute("todo", todoById);

        return "edit-todo";
    }

    @PostMapping("/{id}/edit")
    public String editToDo(@PathVariable long id, ToDo todo) {

        toDoService.save(todo);

        return "redirect:/list";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam (value = "searchedText", required = false) String searchedText){
        model.addAttribute("toDoList", toDoService.getAllToDos().stream()
                .filter(todo -> todo.getTitle().toLowerCase().contains(searchedText) )
                .collect(Collectors.toList()));
        return "todo";
    }
}
