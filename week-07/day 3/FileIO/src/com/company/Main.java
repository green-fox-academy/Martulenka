package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        HashMap<String,String> gameState = new HashMap<>();
        boolean isAbleToProceed;

        do {
            System.out.println("Load a game or start a new one (load/new)");
            String answer = scanner.next();

            if(answer.equals("load")){
                System.out.println("Which file?");
                String fileName = scanner.next();
                System.out.println("Loading...");
                gameState = loadGame(fileName);
                isAbleToProceed = true;
            } else if(answer.equals("new")){
                System.out.println("Creating new game...");
                gameState = new HashMap<>();
                gameState.put("resolution","1080_720");
                gameState.put("name","Tina");
                gameState.put("hp","200");
                gameState.put("xp","0");
                isAbleToProceed = true;
            }else{
                System.out.println("Invalid command!");
                isAbleToProceed = false;
            }
        }while(!isAbleToProceed);

        printGameState(gameState);

        saveGame(gameState);
    }

    private static void saveGame(HashMap<String, String> gameState) {
        Path path = Paths.get("src/com/company/save_files/save1.txt");

        List<String> lines = new ArrayList<>();

        for(Entry<String, String> entry : gameState.entrySet()){
            lines.add(entry.getKey().toUpperCase() + "=" + entry.getValue());
        }

        try{
            Files.write(path, lines);
            //throw new FileNotFoundException("File was not found!");
        } catch (IOException exception){
            System.out.println("Ooops something went wrong! " + exception.getMessage());
        } catch (Exception exception){
            System.out.println("Ooops something went wrong! " + exception.getMessage());
        } /*finally {
            System.out.println("No matter what!");
        }*/
    }

    private static HashMap<String, String> loadGame(String fileName) {
        Path path = Paths.get("src/com/company/save_files/" + fileName + ".txt");
        List<String> lines = new ArrayList<>();

        try{
            lines = Files.readAllLines(path);
        } catch (FileNotFoundException exception){
            System.out.println("Ooops something went wrong! " + fileName);
        } catch (IOException exception){
            System.out.println("Ooops something went wrong! " + exception.getMessage());
        }

        HashMap<String, String> gameState = new HashMap<>();

        for (String line : lines) {
            String[] lineElements = line.split("=");
            gameState.put(lineElements[0], lineElements[1]);
        }

        return gameState;
    }

    private static void printGameState(HashMap<String, String> gameState) {

        System.out.println("Game State");
        for(Entry<String, String> entry : gameState.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
