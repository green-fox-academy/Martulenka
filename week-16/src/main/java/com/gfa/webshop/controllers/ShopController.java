package com.gfa.webshop.controllers;

import com.gfa.webshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Controller
public class ShopController {

    private List<ShopItem> shopInventory = new ArrayList<>();

    public ShopController() {
        shopInventory.add(new ShopItem("Running shoes", "Nike running shoes for everyday sport", 1000, 5,"Clothes and Shoes"));
        shopInventory.add(new ShopItem("Printer", "Some HP printer that will pring pages", 3000, 2,"Electronics"));
        shopInventory.add(new ShopItem("Coca cola", "0.5l standard coke", 25, 0,"Beverages and Snacks"));
        shopInventory.add(new ShopItem("Wokin", "Chicken with fired rice and WOKIN sauce", 119, 100,"Beverages and Snacks"));
        shopInventory.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1,"Clothes and Shoes"));
    }


    @RequestMapping("/hello")
    public String greet(){
        return "Hello World!";
    }


    @RequestMapping("/webshop")
    public String home(Model model){
        model.addAttribute("shopItems", shopInventory);
        return "index";
    }

    @RequestMapping("/only-available")
    public String onlyAvailable(Model model){
        model.addAttribute("shopItems", shopInventory.stream()
                .filter(shopItem -> shopItem.getStockQuantity()>0)
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

    @RequestMapping("/average-stock")
    public String averageStock(Model model){
        model.addAttribute("stockDetails", "Average stock: <B>" + shopInventory.stream()
                .mapToInt(shopItem -> shopItem.getStockQuantity())
                .average()
                .orElse(Double.NaN) + "</B>") ;
        return "stock-details";
    }

    @RequestMapping("/most-expensive")
    public String mostExpensive(Model model){
        model.addAttribute("stockDetails", "The most expensive item: <B>" + shopInventory.stream()
                .filter(shopItem -> shopItem.getStockQuantity() > 0)
                .max(Comparator.comparing(ShopItem::getPrice))
                .orElseThrow(NoSuchElementException::new).getName() + "</B>");
        return "stock-details";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam (value = "searchedText", required = false) String searchedText){
        model.addAttribute("shopItems", shopInventory.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains(searchedText) || shopItem.getDescription().toLowerCase().contains(searchedText))
                .collect(Collectors.toList()));
        return "index";
    }

    @RequestMapping("/filter-by-type")
    public String moreFilters(Model model){
        model.addAttribute("shopItems", shopInventory);
        return "filter-by-type";
    }

    @RequestMapping("/filter-by-type-{type}")
    public String filterByType(Model model, @PathVariable String type){
        model.addAttribute("shopItems", shopInventory.stream()
                .filter(shopItem -> shopItem.getType().toLowerCase().contains(type))
                .collect(Collectors.toList()));
        return "filter-by-type";
    }

}
