package com.company.Flyable;

public class Bird extends Animal implements Flyable{
    /*
    Extend Bird from your abstract Animal class (zoo exercise)
    implement your Flyable interface
     */

    public Bird(String name, int age, String gender){
        super(name, age, gender);
    }

    public String breed(){
        return "laying eggs.";
    }


    @Override
    public void land() {
        System.out.println(" landing...");
    }

    @Override
    public void fly() {
        System.out.println(" flying...");
    }

    @Override
    public void takeOff() {
        System.out.println(" taking off...");
    }
}
