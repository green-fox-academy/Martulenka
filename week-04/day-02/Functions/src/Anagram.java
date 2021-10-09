import java.util.Arrays;

public class Anagram {
    //What the hell is an anagram?
    //An anagram is direct word switch or word play, the result of rearranging the letters of a word or phrase to produce a new word or phrase,
    // using all the original letters exactly once; for example, the word anagram can be rearranged into nag-a-ram. [for more detail check anagram on Wikipedia]
    //
    //Exercise
    //Create a function named isAnagram() following your current language's style guide.
    // It should take two strings and return a boolean value depending on whether it's an anagram or not.
    //
    //Examples
    //input 1	input 2	output
    //"dog"	"god"	true
    //"green"	"fox"	false

    public static void main(String[] args) {
        String word1 = "Tom Marvolo Riddle";
        String word2 = "I am Lord Voldemort";

        System.out.println("Are " +word1 + " and " + word2 + " anagrams? " + isAnagram(word1,word2));
    }

    static boolean isAnagram(String word1, String word2){

        char[] word1Array = word1.toLowerCase().toCharArray();

        Arrays.sort(word1Array);

        String sortedString1 = new String(word1Array).trim();

        char[] word2Array = word2.toLowerCase().toCharArray();

        Arrays.sort(word2Array);

        String sortedString2 = new String(word2Array).trim();

        return sortedString1.equals(sortedString2);
    }

}
