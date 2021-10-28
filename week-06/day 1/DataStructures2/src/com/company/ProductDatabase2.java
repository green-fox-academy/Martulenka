package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        /*We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
        Create a map with the following key-value pairs:
        Product name (key)	Price (value)
        Eggs	200
        Milk	200
        Fish	400
        Apples	150
        Bread	50
        Chicken	550*/

        HashMap<String, Integer> productsMap = new HashMap<String, Integer>(){{
            put("Eggs", 200);
            put("Milk", 200);
            put("Fish", 400);
            put("Apples", 150);
            put("Bread", 50);
            put("Chicken", 550);
        }};

        /*Create an application which prints out the answers to the following questions:
        Which products cost less than 201? (just the name)*/

        System.out.print("Which products cost less than 201? (just the name) ");

        boolean firstNoComma = false;
        for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
            if(entry.getValue() < 201){
                if(firstNoComma){
                    System.out.print(", ");
                }
                System.out.print(entry.getKey());
                firstNoComma = true;
            }
        }

        //Which products cost more than 150? (name + price)

        System.out.println("Which products cost more than 150? (name + price) ");

        firstNoComma = false;
        for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
            if (entry.getValue() > 150) {
                if (firstNoComma) {
                    System.out.print(", ");
                }
                System.out.print(entry.getKey() + " (" + entry.getValue() + ")");
                firstNoComma = true;
            }
        }
    }
}
