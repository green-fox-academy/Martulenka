package com.company;

import java.util.Scanner;

public class Bunnies {
    // We have a number of bunnies and each bunny has two big floppy ears. Write
    // a recursive method (no loops or multiplication) which takes the number of
    // bunnies as its sole parameter and returns the total number of ears
    // the bunnies have. The method should be able to handle invalid input
    // (e.g. negative numbers)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bunnyCount = 0;


        System.out.println("How many bunnies? ");

        do {
            if(bunnyCount < 0){
                System.out.println("Please enter a positive number!");
            }

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number!");
                scanner.next();
            }

            bunnyCount = scanner.nextInt();
        } while (bunnyCount < 0);

        System.out.println(earsCount(bunnyCount));
    }

    public static int earsCount(int countOfBunnies) {

        if (countOfBunnies == 1){
            return 2;
        }else {
            return earsCount(countOfBunnies - 1) + 2;
        }

    }

}
