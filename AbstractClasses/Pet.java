package HW6.AbstractClasses;

import HW6.Interfaces.ShowAffection;

public abstract class Pet extends Animal implements ShowAffection{

    protected String name;
    protected String breed;
    protected boolean isVactinated;
    protected String woolColor;
    protected String birthDate;


    public Pet(int height,int weight,String eyesColor,String name, String breed,boolean isVactinated,String woolColor,String birthDate){
        super(height, weight, eyesColor);
        this.name = name;
        this.breed = breed;
        this.isVactinated = isVactinated;
        this.woolColor = woolColor;
        this.birthDate = birthDate;

    }

    // public String getName(){
    //     return this.name;
    // }

    // public String getBreed(){
    //     return this.breed;
    // }

    // public boolean getIsVactinated(){
    //     return this.isVactinated;
    // }

    // public String getWoolColor(){
    //     return this.woolColor;
    // }

    // public String getBirthdate(){
    //     return this.birthDate;
    // }
    @Override 
    public abstract void showAffection();

    // @Override
    // public String toString() {
    //     return String.format(
    //         "%s, Name: %s, Breed: %s, Vaccinations: %s, Fur color: %s, Birth date: %s",
    //         super.toString(), this.getName(), this.getBreed(), this.getIsVactinated(), this.getWoolColor(), this.getBirthdate()
    //     );
    // }
    
}