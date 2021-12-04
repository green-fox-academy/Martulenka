package com.company.CharSequence;

public class Main {
    /*
    Check out the CharSequence interface
    Create a Gnirts class implementing this interface
    It should have one String field that can be set via the constructor
    Your solution should be a class that represents a reversed String. Implement its methods accordingly. E.g. if the Gnirts is constructed with the String "example" then the character at the 2nd index is 'p'
    In a main method try out all the methods
    Create a ShiftedCharSequence class implementing this interface
    This CharSequence can be constructed using the following arguments:
    a String (that is to be shifted)
    a number (which defines how many characters to shift)
    Implement the methods so that the sequence is shifted by the defined number of characters
     */

    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("example");
        System.out.println(gnirts.charAt(1));
        // should print out: l

        System.out.println("length: " + gnirts.length());
        System.out.println("subsequence: " + gnirts.subSequence(2,gnirts.length()));


        ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
        System.out.println(shifter.charAt(0));
        // should print out: a

    }

}
