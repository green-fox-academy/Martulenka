import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");

        int number = scanner.nextInt();
        String stars = "*";

        for(int i=0;i<number;i++){
            System.out.println(stars);
            stars = stars + "*";
        }
    }
}
