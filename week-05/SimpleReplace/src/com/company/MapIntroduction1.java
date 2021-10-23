package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String[] args) {
        //We are going to play with maps. Feel free to use the built-in methods where possible.

        //Create an empty map where the keys are integers and the values are characters
            Map<Integer, Character> numberMap = new HashMap();

        //Print out whether the map is empty or not
            System.out.println(numberMap.isEmpty());

        /*Add the following key-value pairs to the map
        Key	Value
        97	a
        98	b
        99	c
        65	A
        66	B
        67	C*/

            numberMap.put(97,'a');
            numberMap.put(98,'b');
            numberMap.put(99,'c');
            numberMap.put(65,'A');
            numberMap.put(66,'B');
            numberMap.put(67,'C');

        //Print all the keys
            System.out.println(numberMap.keySet());

        //Print all the values
            System.out.println(numberMap.values());

        //Add value D with the key 68
            numberMap.put(68,'D');

        //Print how many key-value pairs are in the map
            System.out.println(numberMap.size());

        //Print the value that is associated with key 99
            System.out.println(numberMap.get(99));

        //Remove the key-value pair where with key 97
            numberMap.remove(97);

        //Print whether there is an associated value with key 100 or not
            if(numberMap.containsKey(100)){
                System.out.println("HashMap contains value with the key 100");
            }else{
                System.out.println("HashMap does not contain value with the key 100");
            }

        //Remove all the key-value pairs
            numberMap.clear();
    }
}
