package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        /*We are going to represent a shopping list in a list containing strings.
        Create a list with the following items:
        ˇ"eggs", "milk", "fish", "apples", "bread" and "chicken"*/

        List<String> shoppingList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread","chicken"));

        /*Create an application which prints out the answers to the following questions:
            Do we have milk on the list?
            Do we have bananas on the list?*/

        System.out.println("Do we have milk on the list? " + isOnShoppingList("milk",shoppingList));
        System.out.println("Do we have bananas on the list? " + isOnShoppingList("bananas",shoppingList));
    }

    public static String isOnShoppingList(String listItem, List<String>shoppingList) {
        String isOnList = "No";

        if(shoppingList.contains(listItem)){
            isOnList = "Yes";
        }

        return isOnList;
    }
}
