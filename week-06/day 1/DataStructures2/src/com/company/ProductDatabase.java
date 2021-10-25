package com.company;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
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

        HashMap<String, Integer> productsMap = new HashMap<String, Integer>();
        productsMap.put("Eggs",200);
        productsMap.put("Milk",200);
        productsMap.put("Fish",400);
        productsMap.put("Apples",150);
        productsMap.put("Bread",50);
        productsMap.put("Chicken",550);

        /*Create an application which prints out the answers to the following questions:
        How much is the fish?*/

        System.out.println("How much is the fish? " + productsMap.get("Fish"));

        //What is the most expensive product?

        String maxProduct = "";
        int previousAmount = 0;
        for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
            if(previousAmount < entry.getValue()){
                maxProduct = entry.getKey();
            }
            previousAmount = entry.getValue();
        }

        System.out.println("What is the most expensive product? " + maxProduct);

        //What is the average price?

        double priceSum = 0;
        for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
            priceSum += entry.getValue();
        }

        System.out.println("What is the average price? " + priceSum/productsMap.size());


        //How many products' price is below 300?

        int below300Count = 0;
        for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
            if(entry.getValue()<300){
                below300Count++;
            }
        }

        System.out.println("How many products' price is below 300? " + below300Count);

        //Is there anything we can buy for exactly 125?

        System.out.print("Is there anything we can buy for exactly 125? ");
        if(productsMap.containsValue(125)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        //What is the cheapest product?
        String minProduct = "";
        previousAmount = 0;
        for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
            if(previousAmount > entry.getValue()){
                minProduct = entry.getKey();
            }
            previousAmount = entry.getValue();
        }

        System.out.println("What is the cheapest product? " + minProduct);

    }
}
