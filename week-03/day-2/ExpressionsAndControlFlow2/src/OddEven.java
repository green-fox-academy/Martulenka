import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        String oddOrEven;

        if(number%2 == 0){
            oddOrEven = "Even";
        }else{
            oddOrEven = "Odd";
        }

        System.out.println("The number " + number + " is " + oddOrEven + ".");
    }
}