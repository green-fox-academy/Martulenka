package com.gfa.backendapi.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class SithServiceImpl implements SithService{

    private List<String> randomThings= Arrays.asList("Arrgh. Uhmm.", "Err..err.err.","Arrgh.", "Uhmm.", "Err..");

    public String reverserOfSith(String sithText){

        String reversedText = "";
        String reversedSentence = "";
        Random rand = new Random();

        String[] sentences = sithText.split("\\.");

        for (int i = 0; i < sentences.length; i++) {

            String[] words = sentences[i].trim().toLowerCase().split("\\s+");
            for (int k = 0; k < words.length; k++) {
                words[k] = words[k].replaceAll("[^\\w]", "");
            }

            for (int j = 0; j < words.length-1; j+=2) {
                reversedSentence = reversedSentence + words[j+1] + " " + words[j] + " " ;

                if(j == words.length-3){
                    reversedSentence = reversedSentence + words[j+2];
                }
            }

            reversedSentence = reversedSentence.trim().substring(0, 1).toUpperCase() + reversedSentence.substring(1) + ". ";
            reversedText = reversedText + reversedSentence + randomThings.get(rand.nextInt(randomThings.size()-1)) + " ";
            reversedSentence = "";
        }

        return reversedText;
    }
}
