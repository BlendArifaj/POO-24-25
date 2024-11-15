package group_02.java_08;

public class Detyra1 {
    public static void main(String[] args ){
//        ClassA objA = new ClassA(5); X
        ClassA objA = ClassA.getInstance(5);
        System.out.println("Numri: " + objA.numri);
    }
}

class ClassA{
    int numri;

    private ClassA(int numri){
        this.numri = numri;
    }
    public static ClassA getInstance(int numri){
//        logic...
        return new ClassA(numri);
    }
}