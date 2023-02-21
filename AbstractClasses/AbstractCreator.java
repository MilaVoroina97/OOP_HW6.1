package HW6.AbstractClasses;

import HW6.Interfaces.Creators.CatCreator;
import HW6.Interfaces.Creators.ChickenCreator;
import HW6.Interfaces.Creators.DogCreator;
import HW6.Interfaces.Creators.StorkCreator;
import HW6.Interfaces.Creators.TigerCreator;
import HW6.Interfaces.Creators.WolfCreator;

public abstract class AbstractCreator implements CatCreator,DogCreator,ChickenCreator,StorkCreator,TigerCreator,WolfCreator{

    protected AbstractParams params;
    
}
