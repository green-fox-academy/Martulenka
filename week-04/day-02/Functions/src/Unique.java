import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as a parameter
        //  and returns an array of integers where every integer is unique (occurs only once)

        //  Example
        //System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

        int[] notSoUniqueArray = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(Arrays.toString(findUniqueItems(notSoUniqueArray)));
    }

    public static int[]findUniqueItems(int[] inputArray){
        return Arrays.stream(inputArray).distinct().toArray();
    }
}