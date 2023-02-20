package HW6.AnimalClasses;

import HW6.AbstractClasses.NotFlyingBird;

public class Chicken extends NotFlyingBird{

    public Chicken(int height, int weight, String eyesColor) {
        super(height, weight, eyesColor);
    }

    public Chicken() {
        super(30, 3, "Yellow");
    }

    @Override
    public void makeAllNoises() {
        System.out.println("Co co co co");
        
    }

    @Override
    public void printAllAnimalInfo() {
        System.out.println("\nChicken");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %d\n", this.weight);
        
    }
    
}