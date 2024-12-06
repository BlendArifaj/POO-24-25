package group_02.java_10;
//Klasat Abstrakte dhe Nderfaqet
public class Main {
    public static void main(String[] args){
//        AbstractClass objA = new AbstractClass();
    }
}

abstract class AbstractClass{
    private int numri;
    public AbstractClass(int numri){
        this.numri = numri;
    }
    public void shtypNumrin(){
        System.out.println(this.numri);
    }
    public abstract void abstractMethod();
}
class ClassA extends AbstractClass{
    public ClassA(int numri){
        super(numri);
    }
    public void abstractMethod(){
        this.shtypNumrin();
    }
}
