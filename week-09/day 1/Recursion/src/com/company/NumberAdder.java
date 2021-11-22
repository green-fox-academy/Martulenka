package com.company;

public class NumberAdder {
    // Write a recursive function that takes one parameter: n and returns
    // the sum of numbers (integers) from 1 to n. The function should
    // return 0 for inputs less than 1.

    public static void main(String[] args) {

        System.out.println (AddNumber(-10));
    }

    public static int AddNumber (int n) {

        if (n <= 1) {
            return 1;
        } else {
            return n + AddNumber(n - 1);
        }

    }
}
