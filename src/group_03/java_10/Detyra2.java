package group_03.java_10;

// Cloneable and Comparable
// [1, 5, 2, 9]
// [1, 5, 2, 9]
// [1, 2, 5, 9]

// [std1, std2, std3, std4]

import java.util.ArrayList;
import java.util.Collections;

public class Detyra2 {
    public static void main(String[] args){
        Student std1 = new Student(1, 5.5);
        Student std2 = std1.clone();
        std2.notaMesatare = 7.9;
        Student std3 = new Student(3, 8.9);
        Student std4 = new Student(4, 7.2);
        Student std5 = new Student(5, 10.0);
        Student std6 = new Student(6, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        students.add(std5);
        students.add(std6);

        students.forEach( s ->{
            System.out.println(s.id +" - " + s.notaMesatare);
        });
        System.out.println("------");
        Collections.sort(students);
        students.forEach( s -> {
            System.out.println(s.id +" - " + s.notaMesatare);
        });
    }
}

class Student implements Cloneable, Comparable<Student>{
    int id;
    double notaMesatare;
    public Student(int id, double notaMesatare){
        this.id = id;
        this.notaMesatare = notaMesatare;
    }

    public Student clone(){
//        logic ...
        return new Student(this.id + 1, this.notaMesatare);
    }

    public int compareTo(Student compareTo){
        if(this.notaMesatare > compareTo.notaMesatare){
            return -1;
        }
        return 1;
    }

}