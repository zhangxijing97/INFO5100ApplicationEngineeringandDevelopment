package edu.neu.mgen;

public class LandAnimal extends Animal {
    private int numberOfLegs;

    public LandAnimal(String name, double typicalSize, double typicalWeight, boolean isPredator, String diet, int numberOfLegs) {
        super(name, typicalSize, typicalWeight, isPredator, diet);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Land Animal Name: " + getName() + ", Number of Legs: " + numberOfLegs);
    }
}