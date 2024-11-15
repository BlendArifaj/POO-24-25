package group_03.java_08;

public class Detyra1 {
    public static void main(String[] args){
        ClassA objA = ClassA.getInstance(5);
        System.out.println(objA.numri);
    }
}

class ClassA{
    int numri;
    private ClassA(int numri){
        this.numri = numri;
    }
    public static ClassA getInstance(int numri){
        if(numri < 0){
            return null;
        }
        return new ClassA(numri);
    }
}