package com.company.TheGardenApplication;

public class Flower extends Plant {
    /*
    The Flower
    needs water if its current water amount is less than 5
    when watered the flower can only absorb 75% of the water
    eg. watering with 10 the flower's amount of water should only increase by 7.5
     */

    Flower(String color){
        super(color + " Flower",75, 5);
    }

}
