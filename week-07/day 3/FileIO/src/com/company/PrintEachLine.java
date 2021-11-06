package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt" and prints each
        // line from the file.
        // If the program is unable to read the file (for example the file does not exist),
        // it should print the following error message: "Unable to read file: my-file.txt".

        List<String> lines = openFile("my-file.txt");

        for (String line : lines){
            System.out.println(line);
        }
    }

    private static List<String> openFile(String fileName) {
        Path path = Paths.get("src/com/company/save_files/" + fileName);
        List<String> lines = new ArrayList<>();

        try{
            lines = Files.readAllLines(path);
        } catch (IOException exception){
            System.out.println("Unable to read file: " + fileName);
        }

        return lines;
    }
}