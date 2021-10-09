public class Factorial {
    //  Create the usual class wrapper and main method on your own

    // - Create a function called `calculateFactorial()`
    //   that returns the factorial of its input

    public static void main(String[] args) {
        int n = 9;
        System.out.println(calculateFactorial(n));
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;

        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
