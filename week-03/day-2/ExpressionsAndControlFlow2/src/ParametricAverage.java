import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of integers you want to process: ");
        double countOfNumber = scanner.nextDouble();

        int sum = 0;
        double average;

        for(int i=0;i<countOfNumber;i++){
            System.out.print("Enter integer you want to process: ");
            sum = sum + scanner.nextInt();
        }
        average = sum/countOfNumber;
        System.out.println("Sum: " + sum + " , Average: " + average);
    }
}
