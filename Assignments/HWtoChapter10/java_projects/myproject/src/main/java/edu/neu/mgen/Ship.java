package edu.neu.mgen;

public class Ship extends Vehicle {
    private int cargoCapacity;
    private String type;

    public Ship(String name, String model, int year, int cargoCapacity, String type) {
        super(name, model, year);
        this.cargoCapacity = cargoCapacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        System.out.println("Ship Details: ");
        System.out.println("Name: " + name + ", Model: " + model + ", Year: " + year
                + ", Cargo Capacity: " + cargoCapacity + " tonnes, Type: " + type);
    }
}