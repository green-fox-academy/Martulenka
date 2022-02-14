package com.gfa.programmerfoxclub.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Fox {
    private String name;
    private List<Trick> trickList;
    private foodTypes food;
    private drinkTypes drink;

    private enum foodTypes {apples, pizza, bread, rabbit, chocolate}
    private enum drinkTypes {water, bear, rum, juice, mead}

    public Fox(String name){
        this.name = name;
        this.trickList = new ArrayList<>();
        this.food = foodTypes.values()[0];
        this.drink = drinkTypes.values()[0];
    }
}
