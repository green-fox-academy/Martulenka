package com.company.CharSequence;

public class ShiftedCharSequence implements CharSequence {
    /*
    Create a ShiftedCharSequence class implementing this interface
    This CharSequence can be constructed using the following arguments:
    a String (that is to be shifted)
    a number (which defines how many characters to shift)
    Implement the methods so that the sequence is shifted by the defined number of characters
     */
    private String textToShift;
    private int charCount;

    public ShiftedCharSequence(String textToShift, int charCount){
        this.textToShift = (String)textToShift.subSequence(charCount,textToShift.length()) + (String) textToShift.subSequence(0,charCount);
        this.charCount = charCount;
    }


    @Override
    public int length(){

        return textToShift.length();
    }

    @Override
    public char charAt(int i){

        return textToShift.charAt(i);
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return this.textToShift.subSequence(start, end);
    }

}
