package com.gfa.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {

    @RequestMapping("/hello")
    public String greet(){
        return "Hello World!";
    }


    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("insertText","<b>Hello World!</b>");
        return "index";
    }


}
