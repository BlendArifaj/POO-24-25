package group_01.java_08;

public class Main {
    public static void main(String[] args){
        Student std = new Student(1,"Filan", "filan@uni-pr.edu");
        System.out.println("ID: " + std.getId());
        std.setEmri("Emri i ri");
        System.out.println("Emri: " + std.getEmri());
    }
}

class Student{
    private int id;
    private String emri;
    private String email;
    Student(int id, String emri, String email){
        this.id = id;
        this.emri = emri;
        this.email = email;
    }
    public int getId(){
        return this.id;
    }
    public String getEmail(){
        return this.email;
    }
    public String getEmri(){
        return this.emri;
    }
    public void setEmri(String emri){
        this.emri = emri;
    }
}
