package com.company.SharpieSetExercise;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> listOfSharpies = new ArrayList<>();

    public SharpieSet (List<Sharpie> listOfSharpies) {
        this.listOfSharpies = listOfSharpies;
    }

    public static void add (Sharpie sharpie, List<Sharpie> listOfSharpies){
        listOfSharpies.add(sharpie);
    }

    public static int countUsable (List<Sharpie> listOfSharpies) {
        int countUsableSharpies = 0;

        for (int i = 0; i < listOfSharpies.size(); i++) {
            if (listOfSharpies.get(i).inkAmount > 0){
                countUsableSharpies++;
            }
        }

        return countUsableSharpies;
    }

    public static void removeTrash (List<Sharpie> listOfSharpies) {
        for (int i = 0; i < listOfSharpies.size(); i++) {
            if (listOfSharpies.get(i).inkAmount == 0){
                listOfSharpies.remove(i);
            }
        }
    }
}
