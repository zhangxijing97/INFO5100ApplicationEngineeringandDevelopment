package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
// import java.time.LocalDate;
import java.time.Duration;

/**
 *
 * @author Xijing Zhang
 * @version 1.0
 * @since 2024-02-19
 */

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any word:");
        LocalDateTime startTime = LocalDateTime.now(); 
        String inputWord = scanner.nextLine().trim();

        if (inputWord.isEmpty()) {
            System.out.println("You did not enter any word");
        } else {
            int wordLength = inputWord.length();
            String wordCategory;

            if (wordLength <= 5) {
                wordCategory = "short";
            } else if (wordLength <= 10) {
                wordCategory = "medium";
            } else {
                wordCategory = "long";
            }

            LocalDateTime endTime = LocalDateTime.now(); 

            Duration duration = Duration.between(startTime, endTime);
            double reactionTime = duration.getSeconds(); // converting to seconds

            System.out.println("Your word is " + inputWord);
            System.out.println("The length of the word is " + wordLength);
            System.out.println("It is a " + wordCategory + " word");
            System.out.println("Your reaction time is " + reactionTime + " seconds");
        }

        scanner.close();

    }
}