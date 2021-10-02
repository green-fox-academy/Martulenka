public class DrawSquare {
    public static void main(String[] args) {

        int lineCount = 6;
        // Write a program that draws a square like this:
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as lineCount is

        drawSquare(lineCount);
    }

    public static void drawSquare(int lineCount) {
        // write your code here for Gradescope testing

        int spaceCount = lineCount-2;

        for(int i = 1;i<=lineCount;i++){
            System.out.print("%");
            for(int j=1; j<=spaceCount;j++){
                if(i==1 || i==lineCount){
                    System.out.print("%");
                }else{
                System.out.print(" ");
                }
            }
            System.out.print("%");
            System.out.println("");
        }
    }
}
