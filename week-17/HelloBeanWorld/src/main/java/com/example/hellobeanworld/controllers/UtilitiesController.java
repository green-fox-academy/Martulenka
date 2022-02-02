package com.example.hellobeanworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilitiesController {

    @RequestMapping("/useful")
    public String home(Model model){
        model.addAttribute("name", " World");
        return "index";
    }

    @RequestMapping("/useful/colored")
    public String colored(Model model){
        model.addAttribute("name", " World");
        return "colored";
    }

}
