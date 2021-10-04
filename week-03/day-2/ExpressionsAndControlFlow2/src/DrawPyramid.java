public class DrawPyramid {
    public static void main(String[] args) {
        int lineCount = 5;

        // Write a program that draws a pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        drawPyramid(lineCount);
    }

    public static void drawPyramid(int lineCount) {
        // write your code here for Gradescope testing

        for(int i=0;i<lineCount;i++){
            for(int j=0;j< lineCount-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*(i+1)-1;k++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
