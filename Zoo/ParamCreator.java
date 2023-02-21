package HW6.Zoo;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import HW6.AbstractClasses.AbstractParams;

public class ParamCreator extends AbstractParams{

    private final BufferedReader reader;

    public ParamCreator(BufferedReader reader){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getBirthDate(String type) throws IOException {
        System.out.printf("Enter %s birthday.\n", type);
        return reader.readLine();
    }

    @Override
    public String getBreed(String type) throws IOException {
        System.out.printf("Enter %s breed.\n", type);
        return reader.readLine();
    }

    @Override
    public String getEyesColor(String type) throws IOException {
        System.out.printf("Enter %s eyes color.\n", type);
        return reader.readLine();
    }

    @Override
    public String getFindDate(String type) throws IOException {
        System.out.printf("Enter %s date of finding.\n", type);
        return reader.readLine();
    }

    @Override
    public int getFlyHeight(String type) throws IOException {
        System.out.printf("Enter %s flight's height.\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue){
            result = Integer.parseInt(reader.readLine());
            if(result > 0) isTrue = true;
            else
                System.out.printf("The flight's height must be more than zero.\nEnter %s place in zoo.\n", type);
        }
        return result;
    }

    @Override
    public String getHabitat(String type) throws IOException {
        System.out.printf("Enter %s habitat.\n", type);
        return reader.readLine();
    }

    @Override
    public int getHeight(String type) throws IOException {
        System.out.printf("Enter %s height.\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue){
            result = Integer.parseInt(reader.readLine());
            if(result > 0) isTrue = true;
            else
                System.out.printf("The height must be more than zero.\nEnter %s height.\n", type);
        }
        return result;
    }

    @Override
    public boolean getLeader(String type) throws IOException {
        System.out.printf("The %s is the leader.\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue){
            tmp = reader.readLine();
            if(tmp.equals("true") || tmp.equals("false")){
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            }
            else
                System.out.printf("The leader status must be true or false.\nEnter %s leader status.\n", type);
        }
        return result;
    }

    @Override
    public String getName(String type) throws IOException {
        System.out.printf("Enter %s name.\n", type);
        return reader.readLine();
    }

    @Override
    public boolean getTrain(String type) throws IOException {
        System.out.printf("The %s is trained?\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue){
            tmp = reader.readLine();
            if(tmp.equals("true") || tmp.equals("false")){
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            }
            else
                System.out.printf("The trained status must be true or false.\nEnter %s trained status.\n", type);
        }
        return result;
    }

    @Override
    public boolean getVactinated(String type) throws IOException {
        System.out.printf("The %s is vaccinated?\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue){
            tmp = reader.readLine();
            if(tmp.equals("true") || tmp.equals("false")){
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            }
            else
                System.out.printf("The vaccination status must be true or false.\nEnter %s vaccination status.\n", type);
        }
        return result;
    }

    @Override
    public int getWeight(String type) throws IOException {
        System.out.printf("Enter %s weight.\n", type);
        boolean isTrue = false;
        int result = 0;
        while (!isTrue){
            result = Integer.parseInt(reader.readLine());
            if(result > 0) isTrue = true;
            else
                System.out.printf("The weight must be more than zero.\nEnter %s height.\n", type);
        }
        return result;
    }

    @Override
    public String getWoolCoor(String type) throws IOException {
        System.out.printf("Enter %s wool color.\n", type);
        return reader.readLine();
    }

    @Override
    public boolean getWoolPresence(String type) throws IOException {
        System.out.printf("Enter %s wool presence.\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue){
            tmp = reader.readLine();
            if(tmp.equals("true") || tmp.equals("false")){
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            }
            else
                System.out.printf("The wool presence status must be true or false.\nEnter %s wool presence status.\n", type);
        }
        return result;
    }
    
}
