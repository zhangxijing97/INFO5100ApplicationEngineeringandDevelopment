package com.neu.edu;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Final exam
 *
 */

public class App {
    public static void main(String[] args) {
        // Specify the file path here
        String filePath = "/Users/zhangxijing/MasterNEU/INFO5100ApplicationEngineeringandDevelopment/Quizs/finalExam/sourceCode/myFile.txt";

        // Reading and printing the file content
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            System.out.println("Print this text from “myFile.txt” in the Visual Studio Code terminal");
            System.out.println(content);
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Writing string to the files
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            String newString = "A new string";
            String result = content + "\n" + newString;
            Files.write(Paths.get(filePath), result.getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}