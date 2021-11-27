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
    private List<Flower> flowers;
    private List<Tree> trees;

    public Garden(String name) {
        this.name = name;
        this.flowers = new ArrayList<>();
        this.trees = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addTree(Tree tree) {
        trees.add(tree);
    }

}
