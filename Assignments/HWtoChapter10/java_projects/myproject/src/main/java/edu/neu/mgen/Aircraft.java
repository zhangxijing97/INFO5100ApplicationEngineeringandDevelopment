package edu.neu.mgen;

public class Aircraft extends Vehicle {
    private int maxAltitude;
    private int maxSpeed;

    public Aircraft(String name, String model, int year, int maxAltitude, int maxSpeed) {
        super(name, model, year);
        this.maxAltitude = maxAltitude;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void displayDetails() {
        System.out.println("Aircraft Details: ");
        System.out.println("Name: " + name + ", Model: " + model + ", Year: " + year
                + ", Max Altitude: " + maxAltitude + " feet, Max Speed: " + maxSpeed + " km/h");
    }
}