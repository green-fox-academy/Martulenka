package com.company.Farm;

import java.util.ArrayList;
import java.util.List;

public class ManageFarm {
    public static void main(String[] args) {

        List<Animal> listOfAnimals = new ArrayList<>();

        Farm myFarm = new Farm(listOfAnimals);

        myFarm.breed(new Animal("Bessie","cow"));
        myFarm.breed(new Animal("Buttercup", "cow"));
        myFarm.breed(new Animal("Duke", "bull"));
        myFarm.breed(new Animal("Cupcake", "sheep"));
        myFarm.breed(new Animal("Cottonball", "sheep"));
        myFarm.breed(new Animal("Snowflake", "sheep"));
        myFarm.breed(new Animal("Ramsey", "ram"));

        listOfAnimals.get(0).play();
        listOfAnimals.get(1).play();
        listOfAnimals.get(3).play();
        listOfAnimals.get(4).play();
        listOfAnimals.get(5).play();
        listOfAnimals.get(6).play();
        listOfAnimals.get(3).play();
        listOfAnimals.get(5).play();

        for (int i = 0; i < listOfAnimals.size(); i++) {
            listOfAnimals.get(i).eat();
            listOfAnimals.get(i).drink();
        }

        myFarm.breed(new Animal("Curry", "goat"));
        myFarm.breed(new Animal("Capricorn", "goat"));
        myFarm.breed(new Animal("Lamby", "sheep"));
        myFarm.breed(new Animal("Mittens", "sheep"));

        myFarm.sell();
    }
}
