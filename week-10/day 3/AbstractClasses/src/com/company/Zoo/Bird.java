package com.company.Zoo;

public class Bird extends Animal {

    public Bird(String name, int age, String gender){
        super(name, age, gender);
    }

    public String breed(){
        return "laying eggs.";
    }

}
