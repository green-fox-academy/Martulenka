package com.gfa.programmerfoxclub.controllers;

import com.gfa.programmerfoxclub.models.DrinkType;
import com.gfa.programmerfoxclub.models.FoodType;
import com.gfa.programmerfoxclub.models.Fox;
import com.gfa.programmerfoxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }


    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("name", "no name");
        return "login";
    }

    @GetMapping("/login")
    public String addFox(){
        return "login";
    }

    @PostMapping("/login")
    public String addFox(@RequestParam String name){

        if(foxService.getFox(name) == null){
            foxService.addFox(new Fox(name));
        }
        return "redirect:/info/" + name;
    }

    @GetMapping("/info/{name}")
    public String getFox(Model model, @PathVariable String name){
        model.addAttribute("fox",  foxService.getFox(name));
        return "index";
    }

    @GetMapping("/nutritionStore/{name}")
    public String nutritionStore(Model model, @PathVariable String name){
        model.addAttribute("fox",  foxService.getFox(name));
        model.addAttribute("foodTypes", FoodType.values());
        model.addAttribute("drinkTypes", DrinkType.values());
        return "/nutrition-store";
    }

    @PostMapping("/nutritionStore/{name}")
    public String nutritionStore(@PathVariable String name, @RequestParam FoodType foodType, @RequestParam DrinkType drinkType){
        foxService.getAllFoxes().stream().filter(fox ->  name.equals(fox.getName())).findAny().orElse(null).setFood(foodType);
        foxService.getAllFoxes().stream().filter(fox ->  name.equals(fox.getName())).findAny().orElse(null).setDrink(drinkType);

        return "redirect:/info/" + name;
    }





}
