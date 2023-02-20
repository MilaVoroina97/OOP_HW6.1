package HW6.AbstractClasses;

import HW6.Interfaces.MakeAllNoises;
import HW6.Interfaces.PrintAllInfo;

public abstract class Animal implements MakeAllNoises,PrintAllInfo{
    protected int height;
    protected int weight;
    protected String eyesColor;

    public Animal(int height,int weight,String eyesColor){

        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;

    }
    
    @Override 
    public abstract void makeAllNoises();

    @Override 
    public abstract void printAllAnimalInfo();
}
