package Streams;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

    //Write a method to return a list of even numbers from the list of integers below using the Stream API.

    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    //List<Integer> expectedOutput = Arrays.asList(-2, -4, -8, 12, 6, 10, 14);

    numbers.stream().filter(x -> x%2 == 0).forEach(System.out::println);

    }
}
