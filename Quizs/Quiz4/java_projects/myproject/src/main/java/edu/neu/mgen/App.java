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

// public class App {
// public static void main(String[] args) {
// System.out.println("Main start");
// TestClass testClass = new TestClass();
// testClass.protectedMethod();
// testClass.privateMethod(); // Why does this cause error?
// System.out.println("Main end");
// }
// }

// class TestClass {
// private void privateMethod() {
// System.out.println("private method run successfully!");
// }

// protected void protectedMethod() {
// System.out.println("protected method run successully!");
// }
// }

// Define the Shape interface
interface Shape {
    void draw();
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Square class implementing the Shape interface
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

// Triangle class implementing the Shape interface
class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

// Main class to demonstrate polymorphism
public class App {
    public static void main(String[] args) {
        // Create an array of different shapes
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        // Draw all shapes using a single loop
        for (Shape shape : shapes) {
            shape.draw(); // Polymorphism: calling draw() method on different shape objects
        }
    }
}