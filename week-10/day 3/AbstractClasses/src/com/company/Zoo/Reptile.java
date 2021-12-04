package com.company.Zoo;

public class Reptile extends Animal {

    public Reptile (String name, int age, String gender){
        super(name, age, gender);
    }

    public String breed(){
        return "laying eggs.";
    }

}
