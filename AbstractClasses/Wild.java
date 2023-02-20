package HW6.AbstractClasses;

public abstract class Wild extends Animal{


    protected String habitat;
    protected String findDate;

    public Wild(int height, int weight, String eyesColor, String habitat, String findDate){
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.findDate = findDate;
    }


    // public String getHabitat(){
    //     return this.habitat;
    // }

    // public String getFindDate(){
    //     return this.findDate;
    // }

    // @Override
    // public String toString() {
    //     return String.format(
    //         "%s, Habitat: %s, Found date: %s",
    //         super.toString(), this.getHabitat(), this.getFindDate()
    //     );
    // }

}