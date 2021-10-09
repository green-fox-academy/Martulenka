public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers`
        // - Print the elements of the reversed `numbers`

        int[] numbers = {3, 4, 5, 6, 7};

        int numbersPlaceholder;

        for (int i = 0; i < numbers.length; i++) {
            if(i<numbers.length-1-i){
                numbersPlaceholder = numbers[i];
                numbers[i] = numbers[numbers.length-1-i];
                numbers[numbers.length-1-i] = numbersPlaceholder;
            }

            System.out.println(numbers[i]);
        }
    }
}
