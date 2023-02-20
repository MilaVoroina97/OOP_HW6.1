package HW6.AnimalClasses;

import HW6.AbstractClasses.FlyingBird;

public class Stork extends FlyingBird{

    public Stork(int height, int weight, String eyesColor, int flyHeight) {
        super(height, weight, eyesColor, flyHeight);
    }

    public Stork() {
        super(70, 7, "Yellow", 200);
    }


    @Override
    public void makeAllNoises() {
        System.out.println("Glack glack!!");
        
    }

    @Override
    public void printAllAnimalInfo() {
        System.out.println("\nStork");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %d\n", this.weight);
        System.out.printf("Flight's height: %d\n", this.flyHeight);
        
    }


}
