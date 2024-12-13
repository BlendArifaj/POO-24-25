package group_02.java_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 40 pike
// Te krijohet klasa Student me: id, emri, notaMesatare
// Te krijohet klasa StudentManager me metodat:
//    - void ruajStudentNeFile(Student student)
//    - ArrayList<Student> lexoStudentetNgaFile()
public class Detyra2 {
    public static void main(String[] args){
        Student student1 = new Student(1, "Filan Fisteku", 5.5);
        Student student2 = new Student(2, "Fistek Filani", 9.9);

        StudentManager.ruajStudentNeFile(student1);
        StudentManager.ruajStudentNeFile(student2);

        ArrayList<Student> students = StudentManager.lexoStudentetNgaFile();
        students.forEach(
                s -> System.out.println(s.id + " " + s.emri + " " + s.notaMesatare)
        );
    }
}

interface WriteToFileInterface{
    String DELIMITER = ";";

    static Object fromFile(String fileRow) {
        throw new NullPointerException("Method is not implemented!");
    }

    String toFile();
}

class Student implements WriteToFileInterface{
    int id;
    String emri;
    double notaMesatare;
    public Student(int id, String emri, double notaMesatare){
        this.id = id;
        this.emri = emri;
        this.notaMesatare = notaMesatare;
    }

    public static Student fromFile(String fileRow){
        String[] items = fileRow.split(DELIMITER);
        int id = Integer.parseInt(items[0]);
        String emri = items[1];
        double notaMesatare = Double.parseDouble(items[2]);

        return new Student(id, emri, notaMesatare);
    }

    public String toFile(){
        return this.id + DELIMITER + this.emri + DELIMITER + this.notaMesatare + "\n";
    }
}

//class Professor implements WriteToFileInterface{}

class StudentManager{
    private static final String FILE_NAME = "students.txt";
    private StudentManager(){}

    public static void ruajStudentNeFile(Student student){
        try{
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(student.toFile());
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static ArrayList<Student> lexoStudentetNgaFile(){
        ArrayList<Student> students = new ArrayList<>();
        try{
            File file = new File(FILE_NAME);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                String className = row.split(";")[0];
                if(className.equals("Student")){
                    Student newStudent = Student.fromFile(row);
                    students.add(newStudent);
                }else if(className.equals("Professor")){

                }

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return students;
    }
}











