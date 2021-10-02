import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        int i, j, spaceCount = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lineNumber = scanner.nextInt();
        int middleLine;
        int evenLine; //in a case the number of lines is even, there will be two longest lines in the middle

        if(lineNumber%2 ==0){
            middleLine = lineNumber/2;
            evenLine = 0;
        }else{
            middleLine = (lineNumber+1)/2;
            evenLine = 1;
        }

        spaceCount = middleLine - 1;

        for (j = 1; j <= middleLine; j++) //cycle to write the first half of the diamond
        {
            for (i = 1; i <= spaceCount; i++)
            {
                System.out.print(" ");
            }
            spaceCount--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        spaceCount = 1;
        for (j = 1; j <= middleLine - evenLine; j++)//bottom half of the diamond, it will be different in a case the line number is even => extensive use of evenLine variable
        {
            for (i = 1; i < spaceCount + evenLine; i++) //evenLine is 1 when odd number of lines, there needs to be additional space
            {
                System.out.print(" ");
            }
            spaceCount++;
            for (i = 1; i <= 2 * (middleLine - j) + 1 - 2* evenLine; i++) //everLine is 0 when even number. The first line of the bottom half has to be the same length as the last line of the top half but this won't work for odd number of lines, so 2*evenLine removes two stars
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
