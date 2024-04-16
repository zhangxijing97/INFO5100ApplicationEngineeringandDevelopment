package edu.neu.mgen;

public abstract class Animal {
    private String name;
    private double typicalSize; // In kilograms
    private double typicalWeight; // In meters or centimeters
    private boolean isPredator;
    private String diet; // Vegetarian, Omnivore, Carnivore

    public Animal(String name, double typicalSize, double typicalWeight, boolean isPredator, String diet) {
        this.name = name;
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.isPredator = isPredator;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public double getTypicalSize() {
        return typicalSize;
    }

    public double getTypicalWeight() {
        return typicalWeight;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public String getDiet() {
        return diet;
    }

    public abstract void displayInfo();
}