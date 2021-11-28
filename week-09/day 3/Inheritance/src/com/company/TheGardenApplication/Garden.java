package com.company.TheGardenApplication;

import com.company.GFInheritanceExercise.Mentor;
import com.company.GFInheritanceExercise.Student;

import java.util.ArrayList;
import java.util.List;

public class Garden {
        /*
    The Garden
    is able to hold unlimited amount of flowers and trees
    when watering it should only water those plants that need water with equally divided amount amongst them
    eg. watering with 40 and 4 of them need water then each gets watered with 10
     */

    String name;
    private List<Plant> plants;

    public Garden(String name) {
        this.name = name;
        this.plants = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        plants.add(flower);
    }

    public void addTree(Tree tree) {
        plants.add(tree);
    }

    public void info(){
        for (int i = 0; i < plants.size(); i++) {
            if(plants.get(i).waterLevel < plants.get(i).waterNeedLevel){
                System.out.println("The " + plants.get(i).plantName + " needs water");
            }else{
                System.out.println("The " + plants.get(i).plantName  + " doesnt need water");
            }
        }
    }

    public void waterGarden(int waterAmount){
        System.out.println("Watering with " + waterAmount);
        for (int i = 0; i < plants.size(); i++) {
        plants.get(i).water(waterAmount/plants.size());
        }
        info();
    }

}
