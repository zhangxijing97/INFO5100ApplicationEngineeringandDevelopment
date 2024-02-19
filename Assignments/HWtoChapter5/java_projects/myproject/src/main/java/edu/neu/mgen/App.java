package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xijing Zhang
 * @version 1.0
 * @since 2024-02-12
 */

public class App {
    public static void main(String[] args) {

        String str = "Oakland";

        // Find the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Find a character with index 2 in the string.
        char charAtIndex2 = str.charAt(2);
        System.out.println("Character at index 2: " + charAtIndex2);

        // Extract a substring “land” from str
        String substring = str.substring(str.indexOf("land"));
        System.out.println("Extracted substring: " + substring);

        // Convert all letters in str to capital letters “OAKLAND”.
        String strToUpper = str.toUpperCase();
        System.out.println("String in uppercase: " + strToUpper);

        // Given int[] abc = {1,3,5,2,5}; Write a code to
        int[] abc = { 1, 3, 5, 2, 5 };

        // Find the length of the array
        int lengthOfArray = abc.length;
        System.out.println("Length of the array: " + lengthOfArray);

        // Find the last member of the array.
        int lastMember = abc[abc.length - 1];
        System.out.println("Last member of the array: " + lastMember);

        // Create an ArrayList that consists of the following strings: “Austin”,
        // “Houston”, “Oakland”, “Paris”, “San Francisco”, “Seattle”. Remove “Paris’
        // from the ArrayList.
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Austin");
        cities.add("Houston");
        cities.add("Oakland");
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Seattle");

        // Remove “Paris” from the ArrayList
        cities.remove("Paris");
        System.out.println("ArrayList after removing 'Paris': " + cities);

        int x = 5, y = 0;
        if (x > 10)  {y = 1;}
        else if (x > 2) {y = 2;}
        else {y=3;
        }
        System.out.println("y = "+ y);


    }
}