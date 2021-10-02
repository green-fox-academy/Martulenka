import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lineCount = scanner.nextInt();

        int spaceCount = lineCount-2;

        for(int i = 1;i<=lineCount;i++){
            System.out.print("%"); //first column
            for(int j=1; j<=spaceCount;j++){ //sandwiched columns
                if(i==1 || i==lineCount || j==i-1){ //top and bottom "lines", diagonal "lines" - j starts in the second column so it is i-1
                    System.out.print("%");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("%"); //last column
            System.out.println("");
        }

    }
}
