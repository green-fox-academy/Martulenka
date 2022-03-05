package com.gfa.backendapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping(value="/")
    public String home() {
        return "index";
    }

}
