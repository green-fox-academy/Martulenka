package com.company.FarmExercise;

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

    public static void main(String[] args) {

        Animal dog = new Animal();

        dog.play();
        dog.eat();
        dog.drink();
        dog.eat();
        dog.play();

        System.out.println("Hunger: " + dog.hunger + "\nThirst: " + dog.thirst);

    }
}
