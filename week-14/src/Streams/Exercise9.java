package Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
    public static void main(String[] args) {
        //Write a method to return a map specifying the frequency of characters in a given string using the Stream API

        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.";
        //{ =12, a=2, c=4, d=7, e=8, g=1, i=10, l=2, ,=2, L=1, m=5, n=4, .=1, o=7, p=3, r=4, s=6, t=7, u=4}

        System.out.println(charFrequency(s));

    }

    public static Map<String, Long> charFrequency(String s){
        Map<String, Long> freq = Stream.of(s.toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        return  freq;
    }
}
