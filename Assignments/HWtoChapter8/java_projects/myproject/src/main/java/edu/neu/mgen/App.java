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
 * @since 2024-03-18
 */

public class App {

    public static String[] invertAndReverseStrings(String[] input) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            // Reverse the string and adjust the case
            String reversed = new StringBuilder(input[input.length - 1 - i]).reverse().toString();
            String capitalized = reversed.substring(0, 1).toUpperCase() + reversed.substring(1).toLowerCase();
            result[i] = capitalized;
        }
        return result;
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.println("\"" + element + "\",");
        }
        System.out.println("End of the array\n");
    }

    public static void main(String[] args) {
        String[] array1 = { "Anne", "John", "Alex", "Jessica" };
        String[] array2 = { "Sun", "Mercury", "Venis", "Earth", "Mars", "Jupiter" };

        System.out.println("Original array:");
        printArray(array1);
        String[] invertedArray1 = invertAndReverseStrings(array1);
        System.out.println("Resultant array:");
        printArray(invertedArray1);

        System.out.println("Original array:");
        printArray(array2);
        String[] invertedArray2 = invertAndReverseStrings(array2);
        System.out.println("Resultant array:");
        printArray(invertedArray2);
    }

}