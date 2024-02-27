package edu.neu.mgen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
// import java.time.LocalDate;
import java.time.Duration;

/**
 *
 * @author Xijing Zhang
 * @version 1.0
 * @since 2024-02-26
 */

public class App {

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("{ ");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" }");
        return sb.toString();
    }

    private static List<String> switchFirstLastLetters(List<String> names) {
        List<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            if (name.length() > 1) {
                // Switch the letters and adjust the capitalization
                String switched = name.substring(name.length() - 1).toUpperCase() +
                        name.substring(1, name.length() - 1) +
                        name.substring(0, 1).toLowerCase();
                switchedNames.add(switched);
            } else {
                // Handle single-letter names or empty strings, if any
                switchedNames.add(name.toUpperCase()); // Assuming we want to capitalize single letters
            }
        }
        return switchedNames;
    }

    private static String namesToString(List<String> names) {
        return "{ " + String.join(", ", names) + " }";
    }

    public static void main(String[] args) {

        // Lab 1 part 1 - Array
        int[] x = { 1, 3, 5, 7, 9 };
        int[] y = { 2, 4, 6, 8, 10 };

        // Initialize array z of length 5
        int[] z = new int[5];

        // Populate array z with the max of x and y at each index
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Print the arrays
        System.out.println("Array x = " + arrayToString(x));
        System.out.println("Array y = " + arrayToString(y));
        System.out.println("Array z = x + y = " + arrayToString(z));

        // Lab 1 part 2 - ArrayList
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");
        names.add("Dave");
        names.add("Eve");

        // Print the original list of names
        System.out.println("Names = " + namesToString(names));

        // Switch the first and last letters of each name and maintain the
        // capitalization
        List<String> switchedNames = switchFirstLastLetters(names);

        // Print the modified list of names
        System.out.println("Names (switched) = " + namesToString(switchedNames));
    }

}