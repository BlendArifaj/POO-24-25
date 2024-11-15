package group_04.java_08;

public class Main {
    public static void main(String[] args){
        Student std1 = new Student(1, "Filan");
        System.out.println("Id: " + std1.getId());
        std1.setEmri("");
        System.out.println("Emri: " + std1.getEmri());
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
        return this.id;
    }
    public String getEmri(){
        return this.emri;
    }
    public void setEmri(String emri){
        if(emri.equals("")){
            return;
        }
        this.emri = emri;
    }
}