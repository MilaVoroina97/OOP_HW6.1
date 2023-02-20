package HW6.Interfaces.Creators;

import java.io.IOException;

import HW6.AnimalClasses.Dog;

public interface DogCreator {

    public Dog createDog() throws IOException;
    
}
