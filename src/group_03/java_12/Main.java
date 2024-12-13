package group_03.java_12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        FileWriter - Scanner
        String fileName = "src/group_03/java_12/grupi_03.txt";
        File file = new File(fileName);
        try{
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(fileName, true);
            fw.write("Programimi i Orientuar ne Objekte!\n");
            fw.close();

            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println("Gabim: " + e.getMessage());
        }

    }
}
