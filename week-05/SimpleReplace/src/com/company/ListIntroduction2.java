package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        /*Create a list ('List A') which contains the following values
                Apple, Avocado, Blueberries, Durian, Lychee*/
        List<String> listA = new ArrayList<>(Arrays.asList("Apple","Avocado","Blueberries","Durian","Lychee"));

        //Create a new list ('List B') with the values of List A
        List<String> listB = new ArrayList<>(listA);

        //Print out whether List A contains "Durian" or not
        System.out.println(listA.contains("Durian"));

        //Remove "Durian" from List B
        listB.remove("Durian");

        //Add "Kiwifruit" to List A after the 4th element
        listA.add(4,"Kiwifruit");

        //Compare the size of List A and List B
        if(listA.size() == listB.size()){
            System.out.println("List A and List B are the same size");
        }else if(listA.size() > listB.size()){
            System.out.println("List A has more elements than List B");
        }else{
            System.out.println("List A has less elements than List B");
        }

        System.out.println(listA.size() == listB.size());

        //Get the index of "Avocado" from List A
        System.out.println(listA.indexOf("Avocado"));

        //Get the index of "Durian" from List B
        System.out.println(listB.indexOf("Durian"));

        //Add "Passion Fruit" and "Pomelo" to List B in a single statement
        listB.addAll(Arrays.asList("Passion Fruit","Pomelo"));

        //Print out the 3rd element from List A
        System.out.println(listA.get(2));

        /*System.out.println("A: ");
        for (int i = 0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
        }

        System.out.println("B: ");
        for (int i = 0; i < listB.size(); i++) {
            System.out.println(listB.get(i));
        }*/
    }
}
