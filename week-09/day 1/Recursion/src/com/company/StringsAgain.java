package com.company;

public class StringsAgain {
    // Given a string, write a recursive (no loops) method which returns
    // a new string with the lowercase 'x' chars removed.

    public static void main(String[] args) {
        System.out.println(removeX("xxddddxxxxxddff"));
    }

    public static String removeX (String inputWord) {

        if (inputWord.length() == 0)
        {
            return "";
        }

        if (inputWord.charAt(0) == 'x')
        {
            return removeX(inputWord.substring(1));
        }

        return inputWord.charAt(0) + removeX(inputWord.substring(1));
    }
}
