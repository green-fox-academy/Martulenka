package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        //Write a method to return a string concatenated from a given list of characters using the Stream API.

        List<Character> characters = Arrays.asList('L', 'o', 'r', 'e', 'm', ' ', 'i', 'p', 's', 'u', 'm');

        //String expectedOutput = "Lorem ipsum";

        System.out.println(concatenateCharList(characters));
    }

    public static String concatenateCharList(List<Character> charList){

        return  charList.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
