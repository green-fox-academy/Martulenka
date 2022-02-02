package com.example.hellobeanworld.services;

import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
    private String message;

    public BlueColor(){
        this.message = "It is blue in color...";
    }

    public String printColor(){
        return message;
    }

}
