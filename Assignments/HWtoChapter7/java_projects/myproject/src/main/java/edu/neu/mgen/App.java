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
 * @since 2024-02-26
 */

public class App {

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length; // Same as rowsB
        int colsB = B[0].length;

        // Initialize the result matrix with zeros
        int[][] result = new int[rowsA][colsB];

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Define matrices A and B
        int[][] A = { { 2, 3, 4 }, { 3, 4, 5 } }; // 2 rows 3 columns
        int[][] B = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 3 rows 2 columns

        // System.out.println(A[0]);
        // for (int i = 0; i < A[0].length; i++) {
        // System.out.println(A[0][i] + " ");
        // }

        // [I@1dbd16a6
        // [: This indicates that the object is an array.
        // I: This denotes the type of the array.
        // @: This is simply a separator in the representation.
        // 1dbd16a6: This is the hashcode of the array object, doesn't convey anything
        // meaningful contents of the array.

        // Check if multiplication is possible
        if (A[0].length != B.length) {
            System.out.println("The matrices cannot be multiplied.");
        } else {
            // Perform multiplication
            int[][] result = multiplyMatrices(A, B);
            // Display the result
            printMatrix(result);
        }

    }

}