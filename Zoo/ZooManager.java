package HW6.Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import HW6.AbstractClasses.AbstractCreator;
import HW6.AbstractClasses.AbstractZoo;
import HW6.AbstractClasses.Animal;
import HW6.AbstractClasses.AstractZooManager;

public class ZooManager extends AstractZooManager{

    public ZooManager(AbstractCreator creator, AbstractZoo zoo){

        this.creator = creator;
        this.zoo = zoo;
        this.reader = new BufferedReader(new InputStreamReader(System.in));

    }

    @Override
    public void addAnimal(String type) throws IOException {
        switch (type){
            case ("Cat") -> this.zoo.addAnimal(getIndex(type), creator.createCat());
            case ("Dog") -> this.zoo.addAnimal(getIndex(type), creator.createDog());
            case ("Chicken") -> this.zoo.addAnimal(getIndex(type), creator.createChicken());
            case ("Stork") -> this.zoo.addAnimal(getIndex(type), creator.createStork());
            case ("Tiger") -> this.zoo.addAnimal(getIndex(type), creator.creatTiger());
            case ("Wolf") -> this.zoo.addAnimal(getIndex(type), creator.createWolf());
        }
    }

    @Override
    public void delAnimal() throws IOException {
        System.out.println("Enter the animal's index to delete");
        this.zoo.deleteAnimal(Integer.parseInt(reader.readLine()));
    }

    @Override
    public void makeAllAnimalsNoise() {
        System.out.println("All animals make noises");
        Animal[] animals = this.zoo.getAllZoo();
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] != null) {
                animals[i].makeAllNoises();
                System.out.println();
            }
        }
        System.out.println();
    }

    @Override
    public void makeNoise() throws IOException {
        System.out.println("Enter animal index to play cry");
        this.zoo.getAllZoo()[Integer.parseInt(reader.readLine())].makeAllNoises();
    }

    @Override
    public void printAllInfo() {
        System.out.println("Show info about all animals in the zoo");
        Animal[] animals = this.zoo.getAllZoo();
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] != null) {
                animals[i].printAllAnimalInfo();
                System.out.println();
            }
        }
        System.out.println();
    }

    @Override
    public void printAnimalInfo() throws IOException {
        System.out.println("Enter animal index to get info");
        this.zoo.getAllZoo()[Integer.parseInt(reader.readLine())].printAllAnimalInfo();
    }

    @Override
    public int getIndex(String type) throws IOException {
        System.out.printf("Enter %s place in zoo.\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue){
            result = Integer.parseInt(this.reader.readLine());
            if(result >= 0) isTrue = true;
            else
                System.out.printf("The place in zoo must be equals or more than zero.\nEnter %s place in zoo.\n", type);
        }
        return result;
    }
    
}
