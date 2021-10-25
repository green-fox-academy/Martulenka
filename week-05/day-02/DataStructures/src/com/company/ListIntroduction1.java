package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {
    //We are going to play with lists. Feel free to use the built-in methods where possible.

    //Create an empty list which will contain names (strings)
        List<String> nameList = new ArrayList();

    //Print out the number of elements in the list
        System.out.println("Number of elements: " + nameList.size());

    //Add "William" to the list
        nameList.add("William");

    //Print out whether the list is empty or not
        System.out.println("Is list empty? " + nameList.isEmpty());

    //Add "John" to the list
        nameList.add("John");

    //Add "Amanda" to the list
        nameList.add("Amanda");

    //Print out the number of elements in the list
        System.out.println("Number of elements: " + nameList.size());

    //Print out the 3rd element
        System.out.println("3rd element: " + nameList.get(2));

    /*Iterate through the list and print out each name
            William
            John
            Amanda*/

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

    /*Iterate through the list and print
        1. William
        2. John
        3. Amanda*/

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(i+1 + ". " + nameList.get(i));
        }

    //Remove the 2nd element
        nameList.remove(1);

    /*Iterate through the list in a reversed order and print out each name
            Amanda
            William*/

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(nameList.size()-1-i));
        }

    //Remove all elements
        nameList.clear();
    }
}
