package edu.neu.mgen;

/**
 *
 * @author Xijing Zhang
 * @version 1.0
 * @since 2024-03-26
 */

public class App {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 5, 2.5);
        Motorbike motorbike = new Motorbike("Yamaha", "R1", 2021, 998);
        Aircraft aircraft = new Aircraft("Boeing", "747", 2018, 35000, 920);
        Ship ship = new Ship("Titanic", "Olympic-class", 1912, 35000, "Passenger");

        car.displayDetails();
        System.out.println("--------------------------------");
        motorbike.displayDetails();
        System.out.println("--------------------------------");
        aircraft.displayDetails();
        System.out.println("--------------------------------");
        ship.displayDetails();
    }
}