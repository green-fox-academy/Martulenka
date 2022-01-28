package Streams;

import java.util.Arrays;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {
        //Write a method to return the average of odd numbers in the list of integers below using the Stream API. Implement this without calculating the sum first!

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        //double expectedOutput = 22.0/6.0;

        System.out.println(averageOdds(numbers));
    }

    public static double averageOdds(List<Integer> numbers){

        return  numbers.stream()
                .filter(x -> x%2 != 0)
                .mapToDouble(a -> a)
                .average()
                .orElse(Double.NaN);
    }
}
