package group_04.java_10;

// [5, 2, 6, 1, 9]
// [2, 5, 6, 1, 9]
// [2, 5, 1, 6, 9]
// [2, 1, 5, 6, 9]
// [1, 2, 5, 6, 9]

// [std1, std2, std3, std4]
//std1.compareTo(std2);

import java.util.ArrayList;
import java.util.Collections;

public class Detyra2 {
    public static void main(String[] args){
        Student std1 = new Student(1, 9.5);
        Student std2 = std1.clone();
        std2.notaMesatare = 6.8;
        Student std3 = new Student(3, 10.0);
        Student std4 = std3.clone();
        std4.notaMesatare = 8.2;

        ArrayList<Student> students = new ArrayList<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);

        students.forEach(
                s -> System.out.println(s.id + " - " + s.notaMesatare)
        );
        System.out.println("----");
        Collections.sort(students);
        students.forEach(
                s -> System.out.println(s.id + " - " + s.notaMesatare)
        );
    }
}

class Student implements Cloneable, Comparable<Student>{
    int id;
    double notaMesatare;
    int numriIProvimeveTePerfunduara;
    public Student(int id, double notaMesatare) {
        this.id = id;
        this.notaMesatare = notaMesatare;
    }
    public Student clone(){
//        logic ...
        return new Student(this.id + 1, this.notaMesatare);
    }

    public int compareTo(Student objToCompare){
        if(this.notaMesatare > objToCompare.notaMesatare){
            return -1;
        }
        return 1;
    }
}
