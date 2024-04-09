package edu.neu.mgen;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
 

/**
 *
 * @author Xijing Zhang
 * @version 1.0
 * @since 2024-04-09
 */
 
public class App {
    public static void main(String[] args) {
        // Specify the file path here
        String filePath = "/Users/zhangxijing/MasterNEU/INFO5100ApplicationEngineeringandDevelopment/Assignments/HWtoChapter12/java_projects/myproject/src/main/java/edu/neu/mgen/my_test_file.txt";
        
        // Reading and printing the file content
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            System.out.println("File content: " + content);
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Accepting input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phrase: ");
        String userInput = scanner.nextLine();

        // Writing input to the file
        try {
            Files.write(Paths.get(filePath), userInput.getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

 