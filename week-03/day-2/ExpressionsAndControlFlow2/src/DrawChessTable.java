public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        int boardSize = 8;

        for(int i = 0;i<boardSize;i++){
            for(int j=0; j<boardSize;j++){
                System.out.print("|"); //looks cooler with the lines
                if((i%2 ==0 && j%2 ==0) || (i%2 !=0 && j%2 !=0)){
                    System.out.print("%");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("|");

            System.out.println("");
        }
    }
}
