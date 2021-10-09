public class Summing {
    // Create the usual class wrapper and main method on your own

    // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter

    public static void main(String[] args) {
        int sumCap = 20;

        System.out.println(sum(sumCap));
    }

    public static int sum(int sumCap) {
        int summary =0;
        for (int i = 0; i <= sumCap; i++) {
            summary +=i;
        }
        return summary;
    }

}
