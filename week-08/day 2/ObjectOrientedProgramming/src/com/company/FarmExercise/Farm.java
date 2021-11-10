package com.company.FarmExercise;

import com.company.SharpieSetExercise.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    /*Reuse your Animal class
    Create a Farm class
    it has a list of Animals listOfAnimals
    it has a limit that defines how many animals can be kept in the Farm and can be set when the Farm is created
    it has two methods:
    breed() -> creates a new animal if there's place for it
    sell() -> removes the least hungry animal*/

    List<Animal> farmAnimals = new ArrayList<>(10);

    public Farm (List<Animal> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public void breed(Animal newAnimal){
        if(farmAnimals.size() < 10){
            farmAnimals.add(newAnimal);
        }else{
            System.out.println("Full capacity. No place for " + newAnimal.name);
        }
    }

    public void sell(){
        int indexOfLeastHungry = 0;

        for (int i = 0; i < farmAnimals.size(); i++) {
            if(farmAnimals.get(i).hunger < farmAnimals.get(indexOfLeastHungry).hunger){
                indexOfLeastHungry = i;
            }
        }

        System.out.println(farmAnimals.get(indexOfLeastHungry).name + " was sold.");
        farmAnimals.remove(indexOfLeastHungry);
    }
}
