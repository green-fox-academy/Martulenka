package com.company.FarmExercise;

import com.company.SharpieSetExercise.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class ManageFarm {
    public static void main(String[] args) {

        List<Animal> listOfAnimals = new ArrayList<>();

        Farm.breed(new Animal("Bessie","cow"),listOfAnimals);
        Farm.breed(new Animal("Buttercup", "cow"),listOfAnimals);
        Farm.breed(new Animal("Duke", "bull"),listOfAnimals);
        Farm.breed(new Animal("Cupcake", "sheep"),listOfAnimals);
        Farm.breed(new Animal("Cottonball", "sheep"),listOfAnimals);
        Farm.breed(new Animal("Snowflake", "sheep"),listOfAnimals);
        Farm.breed(new Animal("Ramsey", "ram"),listOfAnimals);

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

        Farm.breed(new Animal("Curry", "goat"),listOfAnimals);
        Farm.breed(new Animal("Capricorn", "goat"),listOfAnimals);
        Farm.breed(new Animal("Lamby", "sheep"),listOfAnimals);
        Farm.breed(new Animal("Mittens", "sheep"),listOfAnimals);

        Farm.sell(listOfAnimals);
    }
}
