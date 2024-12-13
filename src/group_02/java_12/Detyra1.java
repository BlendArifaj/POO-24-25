package group_02.java_12;

import java.io.FileWriter;
import java.io.IOException;

// Te krijohet gabimi CustomException - ashtu qe kur te shkaktohet ky gabim
// mesazhi do te ruhet ne fajllin gabimet.txt
public class Detyra1 {
    public static void main(String[] args){
        try{
            throw new CustomException("Test 1");
        }catch (CustomException e){

        }


        try{
            throw new CustomException("Test 2");
        }catch (CustomException e){

        }
    }
}

class CustomException extends Exception{
    private final static String FILE_NAME = "gabimet.txt";
    CustomException(String message){
        super(message);
        this.handle();
    }
    private void handle(){
        try{
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(this.getMessage() + "\n");
            fw.close();
        }catch (IOException e){
            System.out.println("Gabim gjate ruajtes ne file " + e.getMessage());
        }
    }
}

