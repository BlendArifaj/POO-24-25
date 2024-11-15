package group_01.java_08;

public class Detyra1 {
    public static void main(String[] args){
        ClassA obj = ClassA.getInstance(5);

    }
}

class ClassA{
    public int numri;

    private ClassA(int numri){
        this.numri = numri;
    }
    public static ClassA getInstance(int numri){
        return new ClassA(numri);
    }
}