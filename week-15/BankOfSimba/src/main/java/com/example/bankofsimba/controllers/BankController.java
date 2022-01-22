package com.example.bankofsimba.controllers;

import com.example.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> accountList = new ArrayList<>();
    BankAccount simbasAccount;

    public BankController() {
        simbasAccount = new BankAccount("Simba", 2000, "lion");
        accountList.add(simbasAccount);

        accountList.add(new BankAccount("Nala", 3000, "lion"));
        accountList.add(new BankAccount("Timon", 500, "meerkat"));
        accountList.add(new BankAccount("Pumbaa", 2000, "warthog"));
        accountList.add(new BankAccount("Scar", 4000, "lion"));
        accountList.add(new BankAccount("Rafiki", 8000, "mandrill"));

    }

    @RequestMapping("/show")
    public String showAccount(Model model) {
        model.addAttribute("account", simbasAccount);
        return "one-account";
    }

    @RequestMapping("/HTMLception")
    public String writeHTMLception(Model model) {
        model.addAttribute("insertText","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "HTMLception";
    }

    @RequestMapping("/show-list")
    public String showAccounts(Model model) {
        model.addAttribute("accounts", accountList);
        return "account-list";
    }


}
