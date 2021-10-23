package com.company;

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
        // Use pieces of the quote variable (instead of just redefining the string)!

        StringBuilder quoteSB = new StringBuilder();

        quoteSB.append(quote, 0, quote.indexOf(" you expect"));
        quoteSB.append(" always takes longer than");
        quoteSB.append(quote, quote.indexOf(" you expect"),quote.length());

        quote = quoteSB.toString();

        System.out.println(quote);
    }
}
