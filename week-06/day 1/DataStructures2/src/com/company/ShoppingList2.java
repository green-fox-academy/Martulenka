package com.company;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {
        /*Represent the following products with their prices:
        Product	Price
        Milk	1.07
        Rice	1.59
        Eggs	3.14
        Cheese	12.60
        Chicken Breasts	9.40
        Apples	2.31
        Tomato	2.58
        Potato	1.75
        Onion	1.10*/

        HashMap<String, Double> priceList = new HashMap<String, Double>();
        priceList.put("Milk",1.07);
        priceList.put("Rice",1.59);
        priceList.put("Eggs",3.14);
        priceList.put("Cheese",12.60);
        priceList.put("Chicken Breasts",9.40);
        priceList.put("Apples",2.31);
        priceList.put("Tomato",2.58);
        priceList.put("Potato",1.75);
        priceList.put("Onion",1.10);

        /*Represent Bob's shopping list:
        Product	Amount
        Milk	3
        Rice	2
        Eggs	2
        Cheese	1
        Chicken Breasts	4
        Apples	1
        Tomato	2
        Potato	1*/

        HashMap<String, Integer> bobsList = new HashMap<String, Integer>();
        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese",1);
        bobsList.put("Chicken Breasts", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);

        /*Represent Alice's shopping list:
        Product	Amount
        Rice	1
        Eggs	5
        Chicken Breasts	2
        Apples	1
        Tomato	10*/

        HashMap<String, Integer> alicesList = new HashMap<String, Integer>();
        alicesList.put("Rice", 1);
        alicesList.put("Eggs", 5);
        alicesList.put("Chicken Breasts", 2);
        alicesList.put("Apples", 1);
        alicesList.put("Tomato", 10);

        /*Create an application which prints out the answers to the following questions:
        How much does Bob pay?*/

        double bobsSum = 0;
        for (Map.Entry<String, Integer> entry : bobsList.entrySet()) {
            bobsSum += priceList.get(entry.getKey()) * entry.getValue();
        }
        System.out.println("How much does Bob pay? " + bobsSum);

        //How much does Alice pay?

        double  alicesSum = 0;
        for (Map.Entry<String, Integer> entry : alicesList.entrySet()) {
            alicesSum += priceList.get(entry.getKey()) * entry.getValue();
        }
        System.out.println("How much does Alice pay? " + alicesSum);

        //Who buys more Rice?

        String whoBuysMore;

        if(bobsList.containsKey("Rice") && alicesList.containsKey("Rice")) {
            if(bobsList.get("Rice") > alicesList.get("Rice")){
                whoBuysMore = "Bob";
            }else if (bobsList.get("Rice") < alicesList.get("Rice")){
                whoBuysMore = "Alice";
            }else{
                whoBuysMore = "They both buy the same amount.";
            }
        }else if(bobsList.containsKey("Potato")){
            whoBuysMore = "Bob";
        }else{whoBuysMore = "Alice";
        }

        System.out.println("Who buys more Rice? " + whoBuysMore);

        //Who buys more Potato?

        if(bobsList.containsKey("Potato") && alicesList.containsKey("Potato")) {
            if (bobsList.get("Potato") > alicesList.get("Potato")) {
                whoBuysMore = "Bob";
            } else if (bobsList.get("Potato") < alicesList.get("Potato")) {
                whoBuysMore = "Alice";
            } else {
                whoBuysMore = "They both buy the same amount.";
            }
        }else if(bobsList.containsKey("Potato")){
            whoBuysMore = "Bob";
        }else {
            whoBuysMore = "Alice";
        }

        System.out.println("Who buys more Potato? " + whoBuysMore);

        //Who buys more different products?

        int bobsDiffCount = bobsList.size();
        for (Map.Entry<String, Integer> entry : bobsList.entrySet()) {
            if(alicesList.containsKey(entry.getKey())){
                bobsDiffCount--;
            }
        }

        int alicesDiffCount = alicesList.size();
        for (Map.Entry<String, Integer> entry : alicesList.entrySet()) {
            if(bobsList.containsKey(entry.getKey())){
                alicesDiffCount--;
            }
        }

        System.out.print("Who buys more different products? ");
        if(bobsDiffCount > alicesDiffCount){
            System.out.println("Bob");
        }else if(bobsDiffCount < alicesDiffCount){
            System.out.println("Alice");
        }else{
            System.out.println("They buy the same amount of different products.");
        }

        //Who buys more products? (more pieces)*/

        int bobsCount = 0;
        for (Map.Entry<String, Integer> entry : bobsList.entrySet()) {
            bobsCount += entry.getValue();
        }

        int alicesCount = 0;
        for (Map.Entry<String, Integer> entry : alicesList.entrySet()) {
            alicesCount += entry.getValue();
        }

        System.out.print("Who buys more products? (more pieces) ");
        if(bobsCount > alicesCount){
            System.out.println("Bob");
        }else if(bobsCount < alicesCount){
            System.out.println("Alice");
        }else{
            System.out.println("They both buy the same count of items.");
        }
    }
}
