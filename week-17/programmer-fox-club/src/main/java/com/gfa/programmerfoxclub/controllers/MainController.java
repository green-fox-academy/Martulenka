package com.gfa.programmerfoxclub.controllers;

import com.gfa.programmerfoxclub.models.Fox;
import com.gfa.programmerfoxclub.service.FoxServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    private FoxServiceImpl foxService;

    public MainController() {
        this.foxService = new FoxServiceImpl();
    }

    /*@GetMapping("/")
    public String home(Model model){
        model.addAttribute("name", "no name");
        return "index";
    }*/

    @GetMapping("/login")
    public String addFox(){
        return "login";
    }

    @PostMapping("/login")
    public String addFox(@RequestParam String name){
        foxService.addFox(new Fox(name));
        return "redirect:/" + name;
    }

    @GetMapping("/{name}")
    public String getFox(Model model, @PathVariable String name){
        model.addAttribute("fox",  foxService.getFox(name));
        return "index";
    }

}
