package com.company;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that divides number 10
        // by a number that's passed as a paramater and prints the result.
        // It should print "fail" if the parameter is 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the divisor");
        int divisor = scanner.nextInt();

        try{
            System.out.println("The result is: " + divideTen(divisor));
        }catch (ArithmeticException exception) {
            System.out.println("fail");
        }
    }

    public static int divideTen(int divisor) throws ArithmeticException{
        int resultOfDivision;

        resultOfDivision = 10/divisor;

        return resultOfDivision;
    }
}
