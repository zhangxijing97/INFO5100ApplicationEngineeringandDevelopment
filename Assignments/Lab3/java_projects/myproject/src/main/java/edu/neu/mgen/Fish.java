package edu.neu.mgen;

public class Fish extends Animal {
    private int numberOfFins;

    public Fish(String name, double typicalSize, double typicalWeight, boolean isPredator, String diet, int numberOfFins) {
        super(name, typicalSize, typicalWeight, isPredator, diet);
        this.numberOfFins = numberOfFins;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fish Name: " + getName() + ", Number of Fins: " + numberOfFins);
    }
}