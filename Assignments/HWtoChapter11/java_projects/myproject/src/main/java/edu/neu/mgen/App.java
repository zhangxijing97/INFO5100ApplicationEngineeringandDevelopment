package edu.neu.mgen;

import java.util.Scanner;

/**
 *
 * @author Xijing Zhang
 * @version 1.0
 * @since 2024-03-26
 */

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");

            System.out.println("Enter your age:");
            int age = scanner.nextInt();
            System.out.println("You are " + age + " years old.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}