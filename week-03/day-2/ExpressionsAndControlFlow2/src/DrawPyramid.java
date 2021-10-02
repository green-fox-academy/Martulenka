public class DrawPyramid {
    public static void main(String[] args) {
        int lineCount = 4;

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

        String stars;
        for(int i=1;i<=lineCount;i++){
            stars = "";
            for(int j=0;j< lineCount-i;j++){
                stars = stars + " ";
            }
            for(int k=0;k<2*i-1;k++){
                stars = stars + "*";
            }

            System.out.println(stars);
        }
    }
}
