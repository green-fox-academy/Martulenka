package com.company.Flyable;

public class Helicopter extends Vehicle implements Flyable{
    /*
    Extend Helicopter class from Vehicle
    implement your Flyable interface
     */

    String type;

    public Helicopter(String name, String type, int passengers, int age){
        super(name,passengers,age);
        this.type = type;
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

    public void hover() {
        System.out.println(" hovering...");
    }

}
