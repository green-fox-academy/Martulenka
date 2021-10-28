package com.company;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    public static void main(String[] args) {


    /*Write a function that receives a sentence (string) as a parameter and returns the most frequent word of that sentence. If there is more than one such word return any one of them.
    Test the method with the sentence from John Updike’s 'Rabbit, Run':
    But then they were married (she felt awful about being pregnant before but
    Harry had been talking about marriage for a while and anyway laughed when
    she told him in early February about missing her period and said Great she
    was terribly frightened and he said Great and lifted her put his arms around
    under her bottom and lifted her like you would a child he could be so
    wonderful when you didn’t expect it in a way it seemed important that you
    didn’t expect it there was so much nice in him she couldn’t explain to
    anybody she had been so frightened about being pregnant and he made her
    be proud) they were married after her missing her second period in March
    and she was still little clumsy dark-complected Janice Springer and her
    husband was a conceited lunk who wasn’t good for anything in the world Daddy
    said and the feeling of being alone would melt a little with a little drink.

    Expected result: said or little

    Bonus: Using a simple split(" ") may produce some incorrect words, e.g. "(she" instead of "she" or "drink." instead of "drink". Can you fix that?
    a (a) a, b b c
    Expected result: a*/

        System.out.println(GetMostUsedWord("But then they were married (she felt awful about being pregnant before but Harry had been talking about marriage for a while and anyway laughed when she told him in early February about missing her period and said Great she was terribly frightened and he said Great and lifted her put his arms around under her bottom and lifted her like you would a child he could be so wonderful when you didn’t expect it in a way it seemed important that you didn’t expect it there was so much nice in him she couldn’t explain to anybody she had been so frightened about being pregnant and he made her be proud) they were married after her missing her second period in March and she was still little clumsy dark-complected Janice Springer and her husband was a conceited lunk who wasn’t good for anything in the world Daddy said and the feeling of being alone would melt a little with a little drink."));
        System.out.println(GetMostUsedWord("a (a) a, b b c"));
    }

    public static String GetMostUsedWord(String inputSentence) {

        String[] separateWords = inputSentence.split("\\s+");

        HashMap<String, Integer> wordLengthCounter = new HashMap<String, Integer>();

        for (int i = 0; i < separateWords.length; i++) {
            separateWords[i] = separateWords[i].replaceAll("[^\\w]", "");

            if(wordLengthCounter.containsKey(separateWords[i])){
                wordLengthCounter.put(separateWords[i],wordLengthCounter.get(separateWords[i])+1);
            }else{
                wordLengthCounter.put(separateWords[i],1);
            }
        }

        String mostFrequentWord = "";
        int previousMax = 0;

        for (Map.Entry<String, Integer> entry : wordLengthCounter.entrySet()) {
            if(previousMax < entry.getValue()){
                mostFrequentWord = entry.getKey();
                previousMax = entry.getValue();
            }
        }

        return mostFrequentWord;
    }
}
