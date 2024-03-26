package edu.neu.mgen;

public class Car extends Vehicle {
    private int seatingCapacity;
    private double engineCapacity;

    public Car(String name, String model, int year, int seatingCapacity, double engineCapacity) {
        super(name, model, year);
        this.seatingCapacity = seatingCapacity;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details: ");
        System.out.println("Name: " + name + ", Model: " + model + ", Year: " + year
                + ", Seating Capacity: " + seatingCapacity + ", Engine Capacity: " + engineCapacity + " liters");
    }
}