package com.example.hellobeanworld.services;

public class RedColor implements MyColor {
    private String message;

    public RedColor(){
        this.message = "It is red in color...";
    }

    public String printColor(){
        return message;
    }
}
