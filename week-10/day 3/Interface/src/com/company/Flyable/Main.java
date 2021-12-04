package com.company.Flyable;

public class Main {
    /*
    Create a Flyable interface
    it should have land, fly and takeOff methods (TakeOff in C#)
    Create an abstract Vehicle class
    it should have at least 3 fields
    Extend Helicopter class from Vehicle
    implement your Flyable interface
    Extend Bird from your abstract Animal class (zoo exercise)
    implement your Flyable interface
     */

    public static void main(String[] args) {

        Helicopter heli = new Helicopter("Heli", "Search and rescue", 5, 2);

        Bird robin = new Bird("Robin", 5, "F" );

        System.out.print(robin.getName());
        robin.takeOff();
        System.out.print(robin.getName());
        robin.fly();
        System.out.print(robin.getName());
        robin.land();

        System.out.print(heli.getName());
        heli.takeOff();
        System.out.print(heli.getName());
        heli.fly();
        System.out.print(heli.getName());
        heli.land();


    }
}
