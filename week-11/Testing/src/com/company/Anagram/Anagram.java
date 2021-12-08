package com.company.Anagram;

import java.util.Arrays;

public class Anagram {
    /*
    Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
    Create a test for that.
     */

    private String word1;
    private String word2;

    public Anagram(String word1, String word2){
        this.word1 = word1;
        this.word2 = word2;
    }

    public boolean isAnagram(){

        char[] word1Array = word1.toLowerCase().toCharArray();

        Arrays.sort(word1Array);

        String sortedString1 = new String(word1Array).trim();

        char[] word2Array = word2.toLowerCase().toCharArray();

        Arrays.sort(word2Array);

        String sortedString2 = new String(word2Array).trim();

        return sortedString1.equals(sortedString2);
    }

}
