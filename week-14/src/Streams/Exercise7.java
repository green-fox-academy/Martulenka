package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        //Write a method to return a list of strings which start with the specified character (method parameter) using the Stream API.

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        //List<String> expectedOutput;
        //expectedOutput = Arrays.asList("ROME"); // for 'R'
        //expectedOutput = Arrays.asList("NAIROBI", "NEW DELHI"); // for 'N'

        System.out.println(getCityStartWithChar(cities,'R'));
        System.out.println(getCityStartWithChar(cities,'N'));

    }

    public static List<String> getCityStartWithChar(List<String> cities, Character c){

        return  cities.stream()
                .filter(city -> city.startsWith(String.valueOf(c)))
                .collect(Collectors.toList());
    }
}
