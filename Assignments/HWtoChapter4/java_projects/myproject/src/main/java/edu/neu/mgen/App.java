package edu.neu.mgen;

import java.util.Scanner;

/**
 * This is a simple Java program to demonstrate the basic structure.
 * The program prints a message to the console as the output.
 *
 * @author Xijing Zhang
 * @version 1.0
 * @since 2024-02-06
 */

// It is my first Java program
public class App {
    public static void main(String[] args) {

        // Declare and initialize variables of types "int", "long", "double", "boolean",
        // and "char" - two variables for each type
        int intVar1 = 10;
        int intVar2 = 20;
        long longVar1 = 30000L;
        long longVar2 = 40000L;
        double doubleVar1 = 1.5;
        double doubleVar2 = 2.5;
        boolean booleanVar1 = true;
        boolean booleanVar2 = false;
        char charVar1 = 'A';
        char charVar2 = 'B';

        // onvert initialized variables of type "int" to "long"
        long intToLong1 = intVar1;
        long intToLong2 = intVar2;
        int longToInt1 = (int) longVar1;
        int longToInt2 = (int) longVar2;

        // Enter values for variables from the terminal
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter a new value for intVar1: ");
        intVar1 = scanner.nextInt();
        System.out.println(intVar1);

        // Write the code and run the program for various arithmetic and logical
        // operation with the variables
        // Arithmetic operations for int
        int sumInt = intVar1 + intVar2;
        int diffInt = intVar1 - intVar2;
        int prodInt = intVar1 * intVar2;
        int divInt = intVar1 / intVar2;
        int modInt = intVar1 % intVar2;

        // Arithmetic operations for long
        long sumLong = longVar1 + longVar2;
        long diffLong = longVar1 - longVar2;
        long prodLong = longVar1 * longVar2;
        long divLong = longVar1 / longVar2;
        long modLong = longVar1 % longVar2;

        // Arithmetic operations for double
        double sumDouble = doubleVar1 + doubleVar2;
        double diffDouble = doubleVar1 - doubleVar2;
        double prodDouble = doubleVar1 * doubleVar2;
        double divDouble = doubleVar1 / doubleVar2;
        double modDouble = doubleVar1 % doubleVar2;

        // Print results for int
        System.out.println("\nArithmetic operations with integers:");
        System.out.println("Sum: " + sumInt);
        System.out.println("Difference: " + diffInt);
        System.out.println("Product: " + prodInt);
        System.out.println("Division: " + divInt);
        System.out.println("Modulo: " + modInt);

        // Print results for long
        System.out.println("\nArithmetic operations with longs:");
        System.out.println("Sum: " + sumLong);
        System.out.println("Difference: " + diffLong);
        System.out.println("Product: " + prodLong);
        System.out.println("Division: " + divLong);
        System.out.println("Modulo: " + modLong);

        // Print results for double
        System.out.println("\nArithmetic operations with doubles:");
        System.out.println("Sum: " + sumDouble);
        System.out.println("Difference: " + diffDouble);
        System.out.println("Product: " + prodDouble);
        System.out.println("Division: " + divDouble);
        System.out.println("Modulo: " + modDouble);

        // Logical operation
        boolean logicalResult = booleanVar1 && booleanVar2; // AND operation

        // Print results
        System.out.println("Result of logical AND operation between booleanVar1 and booleanVar2: " + logicalResult);
    }
}