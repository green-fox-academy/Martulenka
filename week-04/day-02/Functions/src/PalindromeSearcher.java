import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeSearcher {
    //Exercise
    //Create a function named searchPalindrome() following your current language's style guide.
    // It should take a string, search for palindromes that is at least 3 characters long and return a list with the found palindromes.
    //
    //Examples
    //input	output
    //"dog goat dad duck doodle never"	["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
    //"apple"	[]
    //"racecar"	["racecar", "aceca", "cec"]
    //""	[]
    public static void main(String[] args) {
        String palindromeToBe = "racecar";

        System.out.println(Arrays.toString(searchPalindrome(palindromeToBe)));
    }

    public static String[] searchPalindrome(String inputString) {
        String reverseString;

        List<String> palindromesList = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i; j <= inputString.length(); j++) {
                reverseString = (new StringBuilder(inputString.substring(i,j)).reverse()).toString();
                if(inputString.substring(i,j).equals(reverseString) && reverseString.length()>2){
                    palindromesList.add(inputString.substring(i,j));
                }
            }
        }

        String[] palindromesArray = new String[palindromesList.size()];

        palindromesArray = palindromesList.toArray(palindromesArray);

        return palindromesArray;
    }
}
