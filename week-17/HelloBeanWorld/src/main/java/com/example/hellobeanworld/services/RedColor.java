package com.example.hellobeanworld.services;

import org.springframework.stereotype.Service;

public class RedColor implements MyColor {
    private String message;

    public RedColor(){
        this.message = "It is red in color...";
    }

    public String printColor(){
        return message;
    }
}
