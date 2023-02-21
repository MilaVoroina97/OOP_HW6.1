package HW6.AbstractClasses;

import HW6.Interfaces.Params.GetIndex;
import HW6.Interfaces.ZooManager.AddAnimalManager;
import HW6.Interfaces.ZooManager.DelAnimalManager;
import HW6.Interfaces.ZooManager.MakeAllNoisesManager;
import HW6.Interfaces.ZooManager.MakeNoiseManager;
import HW6.Interfaces.ZooManager.PrintAllInfoManager;
import HW6.Interfaces.ZooManager.PrintInfoManager;

import java.io.BufferedReader;

public abstract class AstractZooManager implements AddAnimalManager,DelAnimalManager,MakeAllNoisesManager,MakeNoiseManager,
PrintAllInfoManager,PrintInfoManager,GetIndex{

    protected AbstractCreator creator;
    protected AbstractZoo zoo;
    protected BufferedReader reader;
    
}
