package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {

    //Write a method to return a list of squares of positive numbers from the list of integers below using the Stream API.

    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    //List<Integer> expectedOutput = Arrays.asList(1, 9, 144, 361, 36, 81, 100, 196);

        List<Integer> positiveNumbers = numbers.stream()
                .filter(x -> x>0)
                .collect(Collectors.toList());

        positiveNumbers.forEach(x -> System.out.println(x*x));

    }
}
