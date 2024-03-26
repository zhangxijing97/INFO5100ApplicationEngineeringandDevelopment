package edu.neu.mgen;

public class Motorbike extends Vehicle {
    private double engineCapacity;

    public Motorbike(String name, String model, int year, double engineCapacity) {
        super(name, model, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Motorbike Details: ");
        System.out.println("Name: " + name + ", Model: " + model + ", Year: " + year
                + ", Engine Capacity: " + engineCapacity + " CC");
    }
}