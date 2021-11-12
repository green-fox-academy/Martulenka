package com.company.Farm;

public class Animal {
    /*Create an Animal class
        Every animal has a hunger value, which is a whole number
        Every animal has a thirst value, which is a whole number
        When creating a new animal instance these values must be set to the default 50 value
    Every animal can eat() which decreases its hunger by one
    Every animal can drink() which decreases its thirst by one
    Every animal can play() which increases both its hunger and thirst by one*/

    int hunger = 50;
    int thirst = 50;
    String name;
    String type;

    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }


    public void eat() {
        this.hunger --;
    }

    public void drink() {
        this.thirst --;
    }

    public void play() {
        this.hunger ++;
        this.thirst ++;
    }
}
