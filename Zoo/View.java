package HW6.Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import HW6.AbstractClasses.AstractZooManager;

public class View {

    private static final AstractZooManager manager = new ZooManager(new Creator(new ParamCreator(null)), new Zoo());
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static boolean working = true;

    public static void getAnimalInfo() throws IOException{

        System.out.println("For show info about an animal press 1");
        System.out.println("For show info about all animals press 2");
        System.out.println("For play animal's cry press 3");
        System.out.println("For play all animals' cries press 4");

        switch (Integer.parseInt(reader.readLine())){
            case (1) -> manager.printAnimalInfo();
            case (2) -> manager.printAllInfo();
            case (3) -> manager.makeNoise();
            case (4) -> manager.makeAllAnimalsNoise();
        }
    }

    private static int menu() throws IOException{
        System.out.println("Choose operation:");
        System.out.println("Add an animal to the zoo, press 1");
        System.out.println("Delete the animal from the zoo, press 2");
        System.out.println("Get info from the zoo, press 3");
        System.out.println("Exit from the zoo, press 0");

        return Integer.parseInt(reader.readLine());
    }

    private static void addAnimal() throws IOException{
        System.out.println("For adding a cat press 1");
        System.out.println("For adding a dog press 2");
        System.out.println("For adding a chicken press 3");
        System.out.println("For adding a stork press 4");
        System.out.println("For adding a tiger press 5");
        System.out.println("For adding a wolf press 6");

        switch (Integer.parseInt(reader.readLine())){
            case (1) -> manager.addAnimal("Cat");
            case (2) -> manager.addAnimal("Dog");
            case (3) -> manager.addAnimal("Chicken");
            case (4) -> manager.addAnimal("Stork");
            case (5) -> manager.addAnimal("Tiger");
            case (6) -> manager.addAnimal("Wolf");
        }
    }

    public static void start() throws IOException {
        System.out.println("Welcome to our zoo!!!\n");
        while (working){
            int operation = menu();
            switch (operation){
                case (1) -> addAnimal();
                case (2) -> manager.delAnimal();
                case (3) -> getAnimalInfo();
                case (0) -> working = false;
            }
        }
    }
    
}
