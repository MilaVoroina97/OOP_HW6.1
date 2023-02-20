package HW6.AnimalClasses;

import HW6.AbstractClasses.Pet;
import HW6.Interfaces.WoolPresence;

public class Cat extends Pet implements WoolPresence{

    
    private static int nameCounter;
    private final boolean isWoolPresence;
    static{
        nameCounter = 1;
    }

    public Cat(int height, int weight, String eyesColor, String name, String breed, boolean isVactinated,
            String woolColor, String birthDate,boolean isWoolPresence) {
        super(height, weight, eyesColor, name, breed, isVactinated, woolColor, birthDate);
        this.isWoolPresence = isWoolPresence;
    }

    public Cat() {
        super(50,
                2,
                "Yellow",
                String.format("Cat %d", nameCounter++),
                "Siam",
                false,
                "black",
                "22.03.2021");
        this.isWoolPresence = true;
    }

    @Override
    public void showAffection() {
        System.out.println("Mur Mur, meow:))))");
        
    }

    @Override
    public void makeAllNoises() {
        System.out.println("Meow Meow");
        
    }

    @Override
    public void printAllAnimalInfo() {
        System.out.println("\nCat");
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Breed: %s\n", this.breed);
        System.out.printf("Birthday: %s\n", this.birthDate);
        System.out.printf("Wool color: %s\n", this.woolColor);
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Weight: %d\n", this.weight);
        System.out.printf("Vaccinations: %b\n", this.isVactinated);
        System.out.printf("Wool presence: %b\n", this.isWoolPresence);
        
    }

    @Override
    public boolean woolPresence() {
        return this.isWoolPresence;
    }
    
}