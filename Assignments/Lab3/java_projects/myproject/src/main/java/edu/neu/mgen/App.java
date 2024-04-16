package edu.neu.mgen;

/**
 *
 * @author Xijing Zhang
 * @version 1.0
 * @since 2024-03-26
 */

public class App {
    public static void main(String[] args) {
        Bird eagle = new Bird("Eagle", 0.9, 6.5, true, "Carnivore", 2.3);
        LandAnimal lion = new LandAnimal("Lion", 1.2, 190, true, "Carnivore", 4);
        Fish salmon = new Fish("Salmon", 0.5, 1.4, false, "Omnivore", 8);

        eagle.displayInfo();
        lion.displayInfo();
        salmon.displayInfo();
    }
}