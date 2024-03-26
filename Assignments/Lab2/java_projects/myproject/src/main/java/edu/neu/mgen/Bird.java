package edu.neu.mgen;

public class Bird extends Animal {
    private double wingspan; // In meters or centimeters

    public Bird(String name, double typicalSize, double typicalWeight, boolean isPredator, String diet, double wingspan) {
        super(name, typicalSize, typicalWeight, isPredator, diet);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bird Name: " + getName() + ", Wingspan: " + wingspan + " meters.");
    }
}