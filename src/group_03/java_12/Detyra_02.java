package group_03.java_12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
// 40 pike
// Te krijohet klasa Student me: id, emri, notaMesatare
// Te krijohet klasa StudentManager me metodat:
//    - void ruajStudentNeFile(Student student)
//    - ArrayList<Student> lexoStudentetNgaFile()
public class Detyra_02 {
}

interface RuajNeFajllInterface{
    String DELIMITER = ";";
    String toFile();
    static Object fromFileRow(String row){
        throw new RuntimeException("Metoda nuk eshte implementuar");
    }
}

class Student implements RuajNeFajllInterface{
    int id;
    String emri;
    double notaMesatare;
    public Student(int id, String emri, double notaMesatare){
        this.id = id;
        this.emri = emri;
        this.notaMesatare = notaMesatare;
    }

    public String toFile(){
        return this.id + DELIMITER + this.emri + DELIMITER + this.notaMesatare + "\n";
    }
    public static Student fromFileRow(String row){
        String[] rowItems = row.split(DELIMITER);
        int id = Integer.parseInt(rowItems[0]);
        String emri = rowItems[1];
        double notaMesatare = Double.parseDouble(rowItems[2]);
        return new Student(id, emri, notaMesatare);
    }
}
//class Professor implements RuajNeFajllInterface{
//
//}

class StudentManager{
    private StudentManager(){}
    private static final String FILE_NAME = "studentet.txt";

    public static void ruajStudentNeFile(RuajNeFajllInterface object){
        try{
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(object.toFile());
            fw.close();
        }catch (IOException e){
            System.out.println("Gabim: " + e.getMessage());
        }
    }
    public ArrayList<RuajNeFajllInterface> lexoStudentetNgaFile(){
        ArrayList<RuajNeFajllInterface> studentet = new ArrayList<>();
        try{
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                String className = row.split(";")[0];
                if(className.equals("Student")){
                    Student student = Student.fromFileRow(row);
                    studentet.add(student);
                }else if(className.equals("Professor")){

                }
            }
        }catch (IOException e){
            System.out.println("Gabim: " + e.getMessage());
        }
        return studentet;
    }
}
