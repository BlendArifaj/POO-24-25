package group_02.java_10;

import java.util.ArrayList;
import java.util.Collections;

public class Detyra2 {
    public static void main(String[] args){
//        [5, 7, 2, 1, 0, 12]
//        [5, 7, 2, 1, 0, 12]
//        [2, 7, 5, 1, 0, 12]
//        [2, 7, 1, 0, 5, 12]

//        [std1, std2, std3, std4]
        Studenti std1 = new Studenti(1, 7.9);
        Studenti std2 = new Studenti(2, 9.9);
        Studenti std3 = new Studenti(3, 6.5);
        Studenti std4 = new Studenti(4, 8.8);
        Studenti std5 = new Studenti(5, 10.0);
        ArrayList<Studenti> students = new ArrayList<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        students.add(std5);

        students.forEach( s -> {
            System.out.println(s.id + " - " + s.notaMesatare);
        });
        System.out.println("-----");
        Collections.sort(students);
        students.forEach( s -> {
            System.out.println(s.id + " - " + s.notaMesatare);
        });


    }
}
class Studenti implements Cloneable, Comparable<Studenti>{
    public int id;
    public double notaMesatare;
    public int numProvimeve;

    public Studenti(int id, double notaMesatare) {
        this.id = id;
        this.notaMesatare = notaMesatare;
    }

    public Studenti clone(){
//        logic ...
        return new Studenti(this.id, this.notaMesatare);
    }

//    public int compareTo(Studenti compareTo){
//        if(this.notaMesatare > compareTo.notaMesatare){
//            return -1;
//        }
//        return 1;
//    }

    public int compareTo(Studenti compareTo){
//        60% | 40%
        int result = 0;
        if(this.notaMesatare > compareTo.notaMesatare){
            result += 60 ;
        }else{
            result += -60;
        }

        if(this.numProvimeve > compareTo.numProvimeve){
            result += 40;
        }else{
            result += -40;
        }

        return result;

    }
}

