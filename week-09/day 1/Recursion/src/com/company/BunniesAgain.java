package com.company;

import java.util.Scanner;

public class BunniesAgain {
    // We have bunnies standing in a line numbered as 1, 2, ... The "odd" bunnies
    // (1, 3, ...) have the usual number of ears = 2. However, the even bunnies
    // (2, 4, ...) have 3 ears each (because they have a raised foot). Write
    // a recursive method which accepts the number of bunnies as a parameter
    // and returns the total number of "ears" in the bunny line. The method should be
    // able to handle invalid input (e.g. negative numbers).
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
        }else if ((countOfBunnies - 1)%2 == 0) {
            return earsCount(countOfBunnies - 1) + 2;
        }else {
            return earsCount(countOfBunnies - 1) + 3;
        }

    }

}
