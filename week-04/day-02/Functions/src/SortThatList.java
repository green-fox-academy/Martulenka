import java.util.Arrays;

public class SortThatList {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as parameter
        //  and returns an array where the elements are sorted in ascending numerical order
        //  When you are done, add a second boolean parameter to the function
        //  If it is `true` sort the array descending, otherwise ascending

        //  Example:
        System.out.println(Arrays.toString(bubble(new int[]{34, 12, 24, 9, 5})));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(advancedBubble(new int[]{34, 12, 24, 9, 5}, true)));
        //  should print [34, 24, 12, 9, 5]
    }

    static int[] bubble(int[] inputArray) {
        int temp;

        for (int j = 0; j < inputArray.length - 1; j++) {
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                }
            }
        }

        return inputArray;
    }

    static int[] advancedBubble(int[] inputArray, boolean sortOrderDesc) {
        int temp;
        if (sortOrderDesc) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                for (int i = 0; i < inputArray.length - 1; i++) {
                    if (inputArray[i] < inputArray[i + 1]) {
                        temp = inputArray[i];
                        inputArray[i] = inputArray[i + 1];
                        inputArray[i + 1] = temp;
                    }
                }
            }
        } else {
            for (int j = 0; j < inputArray.length - 1; j++) {
                for (int i = 0; i < inputArray.length - 1; i++) {
                    if (inputArray[i] > inputArray[i + 1]) {
                        temp = inputArray[i];
                        inputArray[i] = inputArray[i + 1];
                        inputArray[i + 1] = temp;
                    }
                }
            }
        }
        return inputArray;
    }
}
