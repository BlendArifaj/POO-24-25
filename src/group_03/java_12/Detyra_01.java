package group_03.java_12;

import java.io.FileWriter;
import java.io.IOException;

public class Detyra_01 {
}

class CustomException extends Exception{
    private static final String FILE_NAME = "gabimet.txt";
    public CustomException(String message){
        super(message);
        this.handle();
    }
    private void handle(){
        try{
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(this.getMessage() + "\n");
            fw.close();
        }catch (IOException e){
            System.out.println("Gabim: " + e.getMessage());
        }
    }
}
