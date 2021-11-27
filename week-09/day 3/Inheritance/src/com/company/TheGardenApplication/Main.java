package com.company.TheGardenApplication;

import com.company.GFInheritanceExercise.Mentor;
import com.company.GFInheritanceExercise.Person;
import com.company.GFInheritanceExercise.Sponsor;
import com.company.GFInheritanceExercise.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();

        Plant yellowFlower = new Flower("yellow");
        plants.add(yellowFlower);
        Plant blueFlower = new Flower("blue");
        plants.add(blueFlower);
        Plant purpleTree = new Tree("purple");
        plants.add(purpleTree);
        Plant orangeTree = new Tree("orange");
        plants.add(orangeTree);

        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).info();
        }

        System.out.println("Watering with 40");
        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).water(40/plants.size());
        }

        System.out.println("Watering with 70");
        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).water(70/plants.size());
        }

    }
}
