package Streams.Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {
        /*Create a Fox class with 3 properties: name, color and age. Create a list of foxes and add at least 8 instances to it. Then, using the Stream API
        write a method to return a list of foxes of green color
            [Fox[4, GREEN, Skuld], Fox[9, GREEN, Hildr]]
        write a method to return a list of foxes of green color younger than 5
             [Fox[4, GREEN, Skuld]]
        write a method to return a map specifying the frequency of foxes by color
            {GREEN=2, WHITE=1, BLACK=1, GRAY=1, RED=3}*/

        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Skuld","GREEN",4));
        foxes.add(new Fox("Hildr","GREEN",9));
        foxes.add(new Fox("Sif","WHITE",5));
        foxes.add(new Fox("Revna","BLACK",7));
        foxes.add(new Fox("Njal","GRAY",7));
        foxes.add(new Fox("Gro","RED",6));
        foxes.add(new Fox("Tove","RED",8));
        foxes.add(new Fox("Liv","RED",6));
        
        System.out.println(foxColorFrequency(foxes));

    }

    public static List<Fox> greenFoxes(List<Fox> foxes){
        return foxes.stream()
                .filter(fox -> fox.getColor() == "GREEN")
                .collect(Collectors.toList());
    }

    public static List<Fox> greenYoungFoxes(List<Fox> foxes){
        return foxes.stream()
                .filter(fox -> fox.getColor() == "GREEN")
                .filter(fox -> fox.getAge() < 5)
                .collect(Collectors.toList());
    }

    public static Map<String, Long> foxColorFrequency(List<Fox> foxes){
        return foxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor,Collectors.counting()));
    }
}
