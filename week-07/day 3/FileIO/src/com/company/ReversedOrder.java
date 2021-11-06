package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        System.out.println(decryptReversed("reversed-order.txt"));
    }

    public static String decryptReversed(String fileName) {
        List<String> fileContent = new ArrayList<>();
        List<String> outputContent = new ArrayList<>();

        Path sourcePath = Paths.get("src/com/company/ReversedOrder/" + fileName);
        Path targetPath = Paths.get("src/com/company/ReversedOrder/output.txt");

        String outputMessage;

        try {
            fileContent = Files.readAllLines(sourcePath);

            for (int i = 0; i < fileContent.size(); i++) {
                outputContent.add(fileContent.get(fileContent.size()-1-i));
            }

            Files.write(targetPath, outputContent);
            outputMessage = "File decrypted.";

        } catch (IOException exception) {
            outputMessage = "File not found";
        }

        return outputMessage;
    }
}