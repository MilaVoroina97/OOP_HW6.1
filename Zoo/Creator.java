package HW6.Zoo;

import java.io.IOException;

import HW6.AbstractClasses.AbstractCreator;
import HW6.AbstractClasses.AbstractParams;
import HW6.AnimalClasses.Cat;
import HW6.AnimalClasses.Chicken;
import HW6.AnimalClasses.Dog;
import HW6.AnimalClasses.Stork;
import HW6.AnimalClasses.Tiger;
import HW6.AnimalClasses.Wolf;

public class Creator extends AbstractCreator{

    public Creator(AbstractParams params){

        this.params = params;

    }

    @Override
    public Cat createCat() throws IOException {
        Cat cat = new Cat(this.params.getHeight("cat"),
                this.params.getWeight("cat"),
                this.params.getEyesColor("cat"),
                this.params.getName("cat"),
                this.params.getBreed("cat"),
                this.params.getVactinated("cat"),
                this.params.getWoolCoor("cat"),
                this.params.getBirthDate("cat"),
                this.params.getWoolPresence("cat"));
        return cat;
    }

    @Override
    public Dog createDog() throws IOException {
        Dog dog = new Dog(this.params.getHeight("dog"),
                this.params.getWeight("dog"),
                this.params.getEyesColor("dog"),
                this.params.getName("dog"),
                this.params.getBreed("dog"),
                this.params.getVactinated("dog"),
                this.params.getWoolCoor("dog"),
                this.params.getBirthDate("dog"),
                this.params.getTrain("dog"));
        return dog;
    }

    @Override
    public Chicken createChicken() throws IOException {
        Chicken chicken = new Chicken(this.params.getHeight("chicken"),
        this.params.getWeight("chicken"),
        this.params.getEyesColor("chicken"));
        return chicken;
    }

    @Override
    public Stork createStork() throws IOException {
        Stork stork = new Stork(this.params.getHeight("stork"),
                this.params.getWeight("stork"),
                this.params.getEyesColor("stork"),
                this.params.getFlyHeight("stork"));
        return stork;
    }

    @Override
    public Tiger creatTiger() throws IOException {
        Tiger tiger = new Tiger(this.params.getHeight("tiger"),
                this.params.getWeight("tiger"),
                this.params.getEyesColor("tiger"),
                this.params.getHabitat("tiger"),
                this.params.getFindDate("tiger"));
        return tiger;
    }

    @Override
    public Wolf createWolf() throws IOException {
        Wolf wolf = new Wolf(this.params.getHeight("wolf"),
                this.params.getWeight("wolf"),
                this.params.getEyesColor("wolf"),
                this.params.getHabitat("wolf"),
                this.params.getFindDate("wolf"),
                this.params.getLeader("wolf"));
        return wolf;
    }
    
}
