package com.company;

public class MaximumFinder {
    // Write a function which returns the largest element of an array using recursion.

    public static void main(String[] args) {

        int[] inputArray = {50, 10, 40, 13, 2, 99};

        System.out.println("The largest element is: " + largestNumber(inputArray, inputArray.length-1));

    }

    public static int largestNumber (int[] inputArray, int index){

        if (index == 0) {
            return inputArray[0];
        } else {
            return Math.max(inputArray[index], largestNumber(inputArray, index-1));
        }
    }

}
