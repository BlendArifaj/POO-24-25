package group_01.java_10;

public class Main {
    public static void main(String[] args){
//        AbstractClass objAbstractClass = new AbstractClass();
    }
}

abstract class AbstractClass {
    private int numri;
    public AbstractClass(int numri){
        this.numri = numri;
    }
    public void shtypDetajet(){
        System.out.println("Numri: " + this.numri);
    }
    abstract void abstractMethod();
    public int getNumri(){
        return this.numri;
    }
}
class ClassA extends AbstractClass{
    ClassA(int numri){
        super(numri);
    }
    void abstractMethod(){
        System.out.println(this.getNumri());
    }
}
