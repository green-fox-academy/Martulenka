package Streams;

import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        //Write a method to return the sum of odd numbers in the list of integers below using the Stream API.

        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        //int expectedOutput = 61;

        System.out.println(sumOdds(numbers));
    }

    public static int sumOdds(List<Integer> numbers){

        return  numbers.stream()
                .filter(x -> x%2 != 0)
                .mapToInt(a -> a)
                .sum();
    }

}
