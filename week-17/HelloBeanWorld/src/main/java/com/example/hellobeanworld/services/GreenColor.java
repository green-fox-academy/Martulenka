package com.example.hellobeanworld.services;

public class GreenColor implements MyColor{
    private String message;

    public GreenColor(){
        this.message = "It is green in color...";
    }

    public String printColor(){
        return message;
    }

}
