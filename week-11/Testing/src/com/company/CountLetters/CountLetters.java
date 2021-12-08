package com.company.CountLetters;

import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;

public class CountLetters {
    /*
    Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
    Create a test for that.
     */

    public HashMap<Character, Integer> getOccurrence(String inputString){
        HashMap<Character, Integer> myMap  = new HashMap<Character, Integer>();

        for (int i = 0; i < inputString.length() ; i++) {
            if(myMap.containsKey(inputString.charAt(i))){
                myMap.put(inputString.charAt(i),myMap.get(inputString.charAt(i))+1);
            }else {
                myMap.put(inputString.charAt(i),1);
            }
        }

        return myMap;
    }

}
