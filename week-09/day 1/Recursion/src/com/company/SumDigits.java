package com.company;

public class SumDigits {
    // Given a non-negative integer n, return the sum of its digits recursively
    // (without loops).
    //
    // Hint
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    public static void main(String[] args) {

        System.out.println(SumDigits(5853965));
    }

    public static int SumDigits(int n){

        if (n/10 == 0){
            return n;
        }else {
            return n%10 + SumDigits(n/10);
        }

    }

}
