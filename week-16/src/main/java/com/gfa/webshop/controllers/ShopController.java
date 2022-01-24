package com.gfa.webshop.controllers;

import com.gfa.webshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ShopController {

    private List<ShopItem> shopInventory = new ArrayList<>();

    public ShopController() {
        shopInventory.add(new ShopItem("Running shoes", "Nike running shoes for everyday sport", 1000, 5));
        shopInventory.add(new ShopItem("Printer", "Some HP printer that will pring pages", 3000, 2));
        shopInventory.add(new ShopItem("Coca cola", "0.5l standard coke", 25, 0));
        shopInventory.add(new ShopItem("Wokin", "Chicken with fired rice and WOKIN sauce", 119, 100));
        shopInventory.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1));
    }


    @RequestMapping("/hello")
    public String greet(){
        return "Hello World!";
    }


    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("shopItems", shopInventory);
        return "index";
    }

    @RequestMapping("/only-available")
    public String onlyAvailable(Model model){
        model.addAttribute("shopItems", shopInventory.stream()
                .filter(shopItem -> shopItem.getQuantityInStock()>0)
                .collect(Collectors.toList()));
        return "index";
    }

    @RequestMapping("/cheapest-first")
    public String cheapestFirst(Model model){
        model.addAttribute("shopItems", shopInventory.stream()
                .sorted(Comparator.comparingInt(ShopItem::getPrice))
                .collect(Collectors.toList()));
        return "index";
    }

    @RequestMapping("/contains-nike")
    public String containsNike(Model model){
        model.addAttribute("shopItems", shopInventory.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains("nike") || shopItem.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList()));
        return "index";
    }


}
