package com.company;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".

        List<String> myName = new ArrayList<>();

        myName.add(0,"Martina");

        if(WriteNameToFile("my-file.txt", myName)){
            System.out.println("File my-file.txt amended");
        }else{
            System.out.println("Unable to write file: my-file.txt");
        }

    }

    public static boolean WriteNameToFile(String fileName, List<String> myName){
        boolean isFileAmended;
        Path path = Paths.get ("src/com/company/save_files/" + fileName);

        try {
            Files.write(path, myName);
            isFileAmended = true;
        }catch (IOException exception){
            isFileAmended = false;
        }

        return isFileAmended;
    }
}