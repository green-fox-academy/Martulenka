import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int no1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int no2 = scanner.nextInt();

        if(no1 > no2){
            System.out.println(no1 + " is bigger.");
        }else if(no1  < no2){
            System.out.println(no2 + " is bigger.");
        }else{
            System.out.println("Both numbers are equal.");
        }
    }
}