package edu.neu.mgen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.time.LocalDateTime;
import java.time.Duration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.function.Consumer;

/**
 *
 * @author Xijing Zhang
 * @version 1.0
 * @since 2024-03-26
 */

public class App {

    // Throw
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Age set to: " + age);
    }

    public static void main(String[] args) {

        // Try and Catch
        String numberString = "abc"; // This is not a valid number
        try {
            // Attempt to parse the string as an integer
            int number = Integer.parseInt(numberString);
            System.out.println("The parsed number is: " + number);
        } catch (NumberFormatException e) {
            // This block is executed if a NumberFormatException is thrown above
            System.out.println("NumberFormatException occurred: " + e.getMessage());
            System.out.println("The string does not contain a valid integer.");
        } finally {
            // This block is always executed regardless of an exception being thrown or not
            System.out.println("Execution of try-catch block is complete.");
        }

        // Throw
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // // Define the email pattern
        // String emailPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        
        // // Compile the pattern
        // Pattern pattern = Pattern.compile(emailPattern);
        
        // // Emails to validate
        // String[] emails = {"username@example.com", "user.name@example.com", "user-name@sub.example.org",
        //                    "username@example", "user@.com.my", "user@%*.com", "user..1234@yahoo.com"};

        // for (String email : emails) {
        //     Matcher matcher = pattern.matcher(email);
        //     boolean matchFound = matcher.matches();
            
        //     if (matchFound) {
        //         System.out.println(email + " is a valid email address.");
        //     } else {
        //         System.out.println(email + " is not a valid email address.");
        //     }
        // }

        // Pattern pattern = Pattern.compile(" Northeastern", 
        //                                       Pattern.CASE_INSENSITIVE);
        // Matcher matcher = pattern.matcher("Visit Northeastern");
        // boolean matchFound = matcher.find();
        // if (matchFound) {
        //     System.out.println("Match found");
        // } else {
        //     System.out.println("Match not found");
        // }

        Pattern pattern = Pattern.compile("[^abc]");
        Matcher matcher = pattern.matcher("d");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        // Thread
        long startTime = System.currentTimeMillis();
        
        // Creating threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Running threads
        thread1.run();
        thread2.run();

        long endTime = System.currentTimeMillis();

        // Print execution time
        System.out.println("Total execution time: " + (endTime - startTime) + " milliseconds");
        
        // Comparing execution time of threads
        System.out.println(thread1.getName() + " execution time: " + thread1.getExecutionTime() + " milliseconds");
        System.out.println(thread2.getName() + " execution time: " + thread2.getExecutionTime() + " milliseconds");

        // Lambda expression to implement the functional interface
        MyFunctionalInterface myLambda = (int a, int b) -> a + b;

        // Using the lambda expression to add two numbers
        int result = myLambda.operation(5, 3);
        System.out.println("Result: " + result);
        names.forEach(printName);
    }

    interface MyFunctionalInterface {
        int operation(int a, int b);
    }

}