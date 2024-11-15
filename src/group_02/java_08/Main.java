package group_02.java_08;

public class Main {
    public static void main(String[] args){
        Student std = new Student(1, "Filan");
        System.out.println("Id: " + std.getId());
        System.out.println("Emri: " + std.getEmri());
        std.setEmri("Emri i ri");
    }
}

class Student{
    private int id;
    private String emri;
    Student(int id, String emri){
        this.id = id;
        this.emri = emri;
    }
    public int getId(){
//        logic ...
        return this.id;
    }
    public String getEmri(){
        return this.emri;
    }
    public void setEmri(String emri){
//        logic ...
        this.emri = emri;
    }
}
