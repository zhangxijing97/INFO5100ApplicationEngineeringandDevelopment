package edu.neu.mgen;

public abstract class Vehicle {
    protected String name;
    protected String model;
    protected int year;

    public Vehicle(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public abstract void displayDetails();
}