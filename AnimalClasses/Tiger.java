package HW6.AnimalClasses;

import HW6.AbstractClasses.Wild;

public class Tiger extends Wild{

    public Tiger(int height, int weight, String eyesColor, String habitat, String findDate) {
        super(height, weight, eyesColor, habitat, findDate);
    }

    public Tiger(){
        super(100, 60, "Yellow", "Africa", "05.06.2022");
    }

    @Override
    public void makeAllNoises() {
        System.out.println("Rrrrrrr!!!!");
        
    }

    @Override
    public void printAllAnimalInfo() {
        System.out.println("\nTiger");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %d\n", this.weight);
        System.out.printf("Habitat: %s\n", this.habitat);
        System.out.printf("Date of finding: %s\n", this.findDate);
        
    }
    
}