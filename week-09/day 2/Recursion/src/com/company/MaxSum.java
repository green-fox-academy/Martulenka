package com.company;

public class MaxSum {
    // Create a function called `maxSum` which
    // expects an array of five integers as an input parameter and
    // returns the maximum values that can be
    // calculated by summing exactly four of the five integers.
    //
    // Examples
    //
    // [1 2 3 4 5] -> 14
    //
    // We can calculate the following sums using four of the five integers:
    //
    // 1 + 2 + 3 + 4 = 10
    // 1 + 2 + 3 + 5 = 11
    // 1 + 2 + 4 + 5 = 12
    // 1 + 3 + 4 + 5 = 13
    // 2 + 3 + 4 + 5 = 14

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};

        System.out.println("Max sum is:  " + maxSum(inputArray, inputArray.length-1));

    }

    public static int maxSum (int[] inputArray, int index){

        if (index == 0){
            return inputArray[0] - smallestNumber(inputArray, inputArray.length-1);
        } else {
            return inputArray[index] + maxSum(inputArray, index-1);
        }

    }

    public static int smallestNumber (int[] inputArray, int index){

        if (index == 0) {
            return inputArray[0];
        } else {
            return Math.min(inputArray[index], smallestNumber(inputArray, index-1));
        }
    }
}
