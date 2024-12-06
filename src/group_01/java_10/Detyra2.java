package group_01.java_10;

import java.util.ArrayList;
import java.util.Collections;

public class Detyra2 {
    public static void main(String[] args){
        Studenti std1 = new Studenti(1, 6.2);
        Studenti std2 = new Studenti(2, 9.0);
        Studenti std3 = new Studenti(3, 7.2);
        Studenti std4 = new Studenti(4, 10.0);
        ArrayList<Studenti> students = new ArrayList<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        Studenti std5 = std4.clone();

        students.forEach(s -> {
            System.out.println(s.id + " - " + s.notaMesatare);
        });
        System.out.println("------------");
        Collections.sort(students);
        students.forEach(s -> {
            System.out.println(s.id + " - " + s.notaMesatare);
        });
    }
}

class Studenti implements Cloneable, Comparable<Studenti>{
    int id;
    double notaMesatare;
    public Studenti(int id, double notaMesatare) {
        this.id = id;
        this.notaMesatare = notaMesatare;
    }
//    [Studenti 1 ,Studenti 2, Student 3]
//    [Studenti 2, Studenti 1 ,Student 3]
//    [Studenti 2, Student 3, Studenti 1]
//    [Student 3, Studenti 2, Studenti 1]
    public int compareTo(Studenti obj){
        return (int)(obj.notaMesatare - this.notaMesatare);
    }
    public Studenti clone(){
//        logic ...
        return new Studenti(this.id, this.notaMesatare);
    }
}
