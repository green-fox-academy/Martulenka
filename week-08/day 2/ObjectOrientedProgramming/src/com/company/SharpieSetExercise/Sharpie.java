package com.company.SharpieSetExercise;

public class Sharpie {
    /*Create a Sharpie class
    We should know the followings about each sharpie:
        color (which should be a string),
        width (which will be a number) and the
        inkAmount (another number)
    We need to specify the color and the width at creation
    Every sharpie is created with a default inkAmount value: 100
    We can use() the sharpie objects: using it decreases inkAmount by 10*/

    String sharpieColor;
    double sharpieWidth;
    int inkAmount = 100;

    public Sharpie(String sharpieColor, double sharpieWidth){
        this.sharpieColor = sharpieColor;
        this.sharpieWidth = sharpieWidth;
    }

    public void useSharpie() {
        this.inkAmount -=10;
    }
}
