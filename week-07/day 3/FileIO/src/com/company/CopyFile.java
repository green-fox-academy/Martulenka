package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another file
        // It should take two filenames (string) as parameters:
        //  - path and name of the source file
        //  - path and name of the target file
        // It should return a boolean that shows if the copy was successful

        if (WriteNameToFile("src/com/company/CopyFile/sourceFile.txt","src/com/company/CopyFile/targetFile.txt")){
            System.out.println("File copied successfully.");
        }else {
            System.out.println("File not copied.");
        }
    }

    public static boolean WriteNameToFile(String sourceFilePath, String targetFilePath){
        boolean isFileCopied;
        List<String> fileContent = new ArrayList<>();

        Path sourcePath = Paths.get (sourceFilePath);

        Path targetPath = Paths.get (targetFilePath);

        try {
            fileContent = Files.readAllLines(sourcePath);
            Files.write(targetPath, fileContent);
            isFileCopied = true;
        } catch (IOException exception){
            isFileCopied = false;
        }

        return isFileCopied;
    }
}
