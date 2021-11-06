package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt

        System.out.println(decryptReversed("reversed-lines.txt"));
    }

    public static String decryptReversed(String fileName) {
        List<String> fileContent = new ArrayList<>();
        List<String> outputContent = new ArrayList<>();

        Path sourcePath = Paths.get("src/com/company/ReversedLines/" + fileName);
        Path targetPath = Paths.get("src/com/company/ReversedLines/output.txt");

        String outputMessage;

        StringBuilder toBeReversedSB = new StringBuilder();

        try {
            fileContent = Files.readAllLines(sourcePath);

            for (int i = 0; i < fileContent.size(); i++) {
                toBeReversedSB.append(fileContent.get(i));
                outputContent.add(toBeReversedSB.reverse().toString());
                toBeReversedSB.setLength(0);
            }

            Files.write(targetPath, outputContent);
            outputMessage = "File decrypted.";

        } catch (IOException exception) {
            outputMessage = "File not found";
        }

        return outputMessage;
    }
}