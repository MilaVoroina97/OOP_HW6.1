package HW6.AnimalClasses;

import HW6.AbstractClasses.Wild;
import HW6.Interfaces.CanBeLeader;

public class Wolf extends Wild implements CanBeLeader{

    private boolean leader;

    public Wolf(int height, int weight, String eyesColor, String habitat, String findDate,boolean leader) {
        super(height, weight, eyesColor, habitat, findDate);
        this.leader = leader;
    }

    public Wolf() {
        super(80, 20, "green", "russia", "20.08.2022");
        this.leader = false;
    }

    @Override
    public void makeAllNoises() {
        System.out.println("Awwwuuu!!!");
        
    }

    @Override
    public void printAllAnimalInfo() {
        System.out.println("\nWolf");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Habitat: %s\n", this.habitat);
        System.out.printf("Date of finding: %s\n", this.findDate);
        System.out.printf("Leader: %s\n", this.leader);
        
    }

    @Override
    public boolean IsLeader() {
        return this.leader;
    }
    
}
