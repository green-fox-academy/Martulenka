package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        //We are going to represent our expenses in a list containing integers.

        /*Create a list with the following items:
        500, 1000, 1250, 175, 800 and 120*/

        List<Integer> expensesList = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        /*Create an application which prints out the answers to the following questions:
        How much did we spend?
        Which was our greatest expense?
        Which was our cheapest spending?
        What was the average amount of our spendings?*/

        int expenseSum = expensesList.stream().mapToInt(Integer::intValue).sum();
        int expenseMax = 0;
        int expenseMin = expenseSum;
        int expenseAvg = expenseSum/expensesList.size();

        for (int i = 0; i < expensesList.size(); i++) {
            if(expensesList.get(i) > expenseMax){
                expenseMax = expensesList.get(i);
            }
            if(expensesList.get(i) < expenseMin){
                expenseMin = expensesList.get(i);
            }
        }

        System.out.println("How much did we spend? " + expenseSum);

        System.out.println("Which was our greatest expense? " + expenseMax);

        System.out.println("Which was our cheapest spending? " + expenseMin);

        System.out.println("What was the average amount of our spendings? " + expenseAvg);
    }
}
