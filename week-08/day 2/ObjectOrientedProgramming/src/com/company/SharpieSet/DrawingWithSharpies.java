package com.company.SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class DrawingWithSharpies {
    public static void main(String[] args) {
        /*Reuse your Sharpie class
        Create SharpieSet class
        it contains a list of Sharpie, named listOfSharpies
        it has a method that adds a new Sharpie to the set: add(sharpie)
        it has a method that returns the number of usable Sharpies: countUsable() -> sharpie is usable if it contains ink
        it has a method that removes all unusable Sharpies: removeTrash()*/

        List<Sharpie> sharpiesList = new ArrayList<>();

        SharpieSet.add(new Sharpie("black", 0.3),sharpiesList);
        SharpieSet.add(new Sharpie("black", 1),sharpiesList);
        SharpieSet.add(new Sharpie("green", 0.3),sharpiesList);
        SharpieSet.add(new Sharpie("red", 0.8),sharpiesList);

        System.out.println(SharpieSet.countUsable(sharpiesList));

        sharpiesList.get(0).useSharpie();
        sharpiesList.get(1).useSharpie();
        sharpiesList.get(0).useSharpie();
        sharpiesList.get(3).useSharpie();
        sharpiesList.get(0).useSharpie();
        sharpiesList.get(0).useSharpie();
        sharpiesList.get(2).useSharpie();
        sharpiesList.get(0).useSharpie();
        sharpiesList.get(0).useSharpie();
        sharpiesList.get(2).useSharpie();
        sharpiesList.get(0).useSharpie();
        sharpiesList.get(3).useSharpie();
        sharpiesList.get(1).useSharpie();
        sharpiesList.get(0).useSharpie();
        sharpiesList.get(3).useSharpie();
        sharpiesList.get(0).useSharpie();
        sharpiesList.get(0).useSharpie();

        System.out.println(SharpieSet.countUsable(sharpiesList));

        SharpieSet.removeTrash(sharpiesList);
    }
}
