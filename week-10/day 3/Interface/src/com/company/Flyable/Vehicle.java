package com.company.Flyable;

public abstract class Vehicle {
    /*
    Create an abstract Vehicle class
    it should have at least 3 fields
     */

    String name;
    int passengers;
    int age;

    public String getName(){
        return this.name;
    }

    public Vehicle(String name, int passengers, int age){
        this.name = name;
        this.passengers = passengers;
        this.age = age;
    }


}
