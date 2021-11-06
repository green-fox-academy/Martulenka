package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function called countLines() that takes a filename as string as a parameter
        // and returns the number of lines the file contains.
        // It should return zero if it can't open the file
        // and should not raise any error.

        System.out.println(countLines(("my-file.txt")));
    }

    public static int countLines(String fileName){
        int linesCount;
        Path path = Paths.get("src/com/company/save_files/" + fileName);
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
            linesCount = lines.size();
        } catch (IOException exception){
            linesCount = 0;
        }

        return linesCount;
    }
}
