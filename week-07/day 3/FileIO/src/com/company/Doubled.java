package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method called decryptDoubled() that takes a filename as string as a parameter
        // and it can decrypt the duplicated-chars.txt file
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should return this message: File not found
        // The result should be saved in the output.txt file

        System.out.println(decryptDoubled("duplicated-chars.txt"));
    }

    public static String decryptDoubled(String fileName) {
        List<String> fileContent = new ArrayList<>();
        List<String> outputContent = new ArrayList<>();

        Path sourcePath = Paths.get ("src/com/company/Doubled/" + fileName);
        Path targetPath = Paths.get ("src/com/company/Doubled/output.txt");

        String outputMessage;
        String outputLine = "";

        try {
            fileContent = Files.readAllLines(sourcePath);

            for (int i = 0; i < fileContent.size(); i++) {
                for (int j = 0; j < fileContent.get(i).length(); j+=2) {
                    outputLine = outputLine + fileContent.get(i).charAt(j);
                }
                outputContent.add(outputLine);
                outputLine = "";
            }
            Files.write(targetPath, outputContent);
            outputMessage = "File encrypted.";
        } catch (IOException exception){
            outputMessage = "File not found";
        }
        
        return outputMessage;
    }
}