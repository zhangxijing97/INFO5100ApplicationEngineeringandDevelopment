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

    public static void main(String[] args) {
        EngClass engClass = new EngClass();

        // Adding students
        engClass.addStudent(new Student(1, "John", "Doe"));
        engClass.addStudent(new Student(2, "Jane", "Doe"));
        engClass.addStudent(new Student(3, "Jim", "Beam"));

        System.out.println("After adding students:");
        engClass.listStudents();

        // Deleting a student
        engClass.deleteStudent(2);

        System.out.println("\nAfter deleting a student:");
        engClass.listStudents();

    }

}