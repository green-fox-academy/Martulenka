public class SumAllElements {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements of `numbers`

        int[] numbers = {3, 4, 5, 6, 7};

        //System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    }
}
