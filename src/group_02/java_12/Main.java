package group_02.java_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String filename = "src/group_01/java_12/ushtrimet_poo.txt";
        File file = new File(filename);
        System.out.println(file.exists());
        try{
            if(file.createNewFile()){
                System.out.println("Keni krijuar fajll-in");
            }else{
                System.out.println("Fajll-i ekziston!");
            }
        }catch (IOException e){
            System.out.println("Ka ndodhur nje gabim: " + e.getMessage());
        }
//        Scanner
//        FileWriter
        try{
            filename = "src/group_01/Java_12/random.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write("Writing text in a file!\n");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            file = new File(filename);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
