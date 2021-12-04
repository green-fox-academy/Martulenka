package com.company.CharSequence;

public class Gnirts implements CharSequence {
    /*
    Create a Gnirts class implementing this interface
    It should have one String field that can be set via the constructor
    Your solution should be a class that represents a reversed String. Implement its methods accordingly. E.g. if the Gnirts is constructed with the String "example" then the character at the 2nd index is 'p'
    In a main method try out all the methods
    */

    private String inputString;

    public Gnirts (String inputString){
        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();
        this.inputString = sb.toString();
    }

    @Override
    public int length(){
        return this.inputString.length();
    }

    @Override
    public char charAt(int i){
        return this.inputString.charAt(i);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.inputString.subSequence(start, end);
    }
}
