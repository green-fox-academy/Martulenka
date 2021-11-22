package com.company;

public class Strings {
    // Given a string, write a recursive (no loops) method which returns
    // a new string with the lowercase 'x' chars changed to 'y' chars

    public static void main(String[] args) {
        System.out.println(xToYString("xxxxxxx"));
    }

    public static String xToYString (String inputWord) {

        if (inputWord.length() == 0)
        {
            return inputWord;
        }

        char x = inputWord.charAt(0);

        if (inputWord.charAt(0) == 'x')
        {
            x = 'y';
            inputWord = 'y' + inputWord.substring(1);
        }

        return x + xToYString (inputWord.substring(1));

    }

}
