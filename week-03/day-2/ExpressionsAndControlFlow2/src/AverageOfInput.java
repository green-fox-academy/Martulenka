import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        int n1 = scanner.nextInt();

        System.out.println("Enter the second number: ");

        int n2 = scanner.nextInt();

        System.out.println("Enter the third number: ");

        int n3 = scanner.nextInt();

        System.out.println("Enter the fourth number: ");

        int n4 = scanner.nextInt();

        System.out.println("Enter the fifth number: ");

        int n5 = scanner.nextInt();

        int sum = n1+n2+n3+n4+n5;

        double average = sum/5.;

        System.out.println("Sum: " + sum + " , Average: " + average);
    }
}