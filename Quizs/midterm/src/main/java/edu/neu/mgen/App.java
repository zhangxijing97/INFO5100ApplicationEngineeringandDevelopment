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
 * @since 2024-02-27
 */

public class App {

    public static int calculateSum(int[][] matrix) {
        int sum = 0; // Variable to store the sum

        // Iterate over each row
        for (int i = 0; i < matrix.length; i++) {
            // Iterate over each column in the row
            for (int j = 0; j < matrix[i].length; j++) {
                // Add the element to the sum
                sum += matrix[i][j];
            }
        }

        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        // Call the method to calculate the sum
        int sum = calculateSum(matrix);

        // Print the sum
        System.out.println("The sum of all elements in the matrix is: " + sum);
    }
}