import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        // Write a program that stores a number and the user has to figure it out
        // The user can input guesses
        // After each guess the program would tell one of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 100;
        int winNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
        int noOfTries = 1;

        System.out.print("Guess number between " + min +" and " + max +": ");
        int guessedNumber = scanner.nextInt();

        while(guessedNumber != winNumber){
            if(guessedNumber < winNumber){
                System.out.println("The stored number is higher");
            }else System.out.println("The stored number is lower");
            System.out.print("Guess again: ");
            guessedNumber = scanner.nextInt();
            noOfTries++;
        }
        System.out.println("You found the number: " + winNumber +" in " + noOfTries + " tries.");
    }
}
