package com.example.bankofsimba.controllers;

import com.example.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> accountList = new ArrayList<>();

    public BankController() {
        accountList.add(new BankAccount("Simba", 2000, "lion"));
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String showBooks(Model model) {
        model.addAttribute("accounts", accountList);
        return "index";
    }

}
