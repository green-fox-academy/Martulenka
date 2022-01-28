package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {

    public static void main(String[] args) {
        //Write a method to return a list of uppercase characters from a given string using the Stream API.

        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";

        //List<Character> expectedOutput = Arrays.asList('L', 'I', 'D', 'S', 'A', 'C', 'A', 'E', 'M');

        System.out.println(getUppercaseChars(s));
    }

    public static List<Character> getUppercaseChars(String s){

        return  s.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isUpperCase)
                .collect(Collectors.toList());
    }

}
