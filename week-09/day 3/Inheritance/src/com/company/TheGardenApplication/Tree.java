package com.company.TheGardenApplication;

public class Tree extends Plant{
    /*
    The Tree
    needs water if its current water amount is less than 10
    when watered the tree can only absorb the 40% of the water
    eg. watering with 10 the tree's amount of water should only increase by 4
     */

    private String color;

    Tree(String color){
        super(color + " Tree", 40, 10);
    }

}
