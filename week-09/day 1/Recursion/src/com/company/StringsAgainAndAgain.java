package com.company;

public class StringsAgainAndAgain {
    // Given a string, write a recursive (no loops) method which returns a new
    // string with all adjacent chars separated by an `*`. Please note that there
    // should be no trailing `*` at the end of the returned string. For example,
    // the string `word` should be changed to `w*o*r*d`.

    public static void main(String[] args) {
        System.out.println(addStars("word"));
    }

    public static String addStars(String inputWord) {

        if (inputWord.length() == 1)
        {
            return inputWord.substring(0);
        }

        return inputWord.charAt(0) + "*" + addStars(inputWord.substring(1));
    }

}
