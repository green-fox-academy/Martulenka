package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    private AtomicLong count;

    public HelloRESTController(){
        this.count = new AtomicLong(0);
    }

    @GetMapping("/greeting")
    public String greet(@RequestParam String name){
        return "greetCount: " + count.incrementAndGet() + ", content: Hello, " + name + "!";
    }
}