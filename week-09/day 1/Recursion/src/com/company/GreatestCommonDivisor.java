package com.company;

public class GreatestCommonDivisor {
    // Write a recursive method which returns the greatest common divisor (GCD)
    // of two numbers. The method should be able to handle negative numbers!

    public static void main(String[] args) {
        System.out.println(getGCD(1584,64));
    }

    public static int getGCD(int x, int y) {

        if (y == 0) {
            return x;
        }

        return getGCD (y, x % y);
    }


}
