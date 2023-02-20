package HW6.AnimalClasses;

import HW6.AbstractClasses.Pet;
import HW6.Interfaces.CanTrain;

public class Dog extends Pet implements CanTrain{

    private static int nameCounter;
    private boolean train;

    static{
        nameCounter = 1;
    }


    public Dog(int height, int weight, String eyesColor, String name, String breed, boolean isVactinated,
            String woolColor, String birthDate,boolean train) {
        super(height, weight, eyesColor, name, breed, isVactinated, woolColor, birthDate);
        this.train = train;
    }

    public Dog() {
        super(70,
                5,
                "black",
                String.format("Dog %d", nameCounter++),
                "Labrador",
                false,
                "dirty",
                "no info");
        this.train = false;
    }

    @Override
    public void showAffection() {
        System.out.println("I am a friendly dog, I can be your friend");
        
    }

    @Override
    public void makeAllNoises() {
        System.out.println("Woof wooof!");
        
    }

    @Override
    public void printAllAnimalInfo() {
        System.out.println("\nDog");
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Breed: %s\n", this.breed);
        System.out.printf("Birthday: %s\n", this.birthDate);
        System.out.printf("Wool color: %s\n", this.woolColor);
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Weight: %d\n", this.weight);
        System.out.printf("Vaccinations: %b\n", this.isVactinated);
        System.out.printf("Training: %b\n", this.train);
        
    }

    public boolean isTrain(){
        return this.train;
    }
    @Override
    public final void canBeTrained(boolean isTrained) {

        if(this.train) System.out.println("This dog can be trained");
        else this.train = isTrained;

    }
    
}
