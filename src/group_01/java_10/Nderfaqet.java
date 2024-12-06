package group_01.java_10;

public class Nderfaqet {
    public static void main(String[] args){
        Bird flyBird = new Bird();
        Airplane flyAirplane = new Airplane();
        System.out.println(Bird.NUM);
        System.out.println("flyBird instanceof Fly: " + (flyBird instanceof Fly));
    }
}

interface Interface1{
    final static int NUM = 1;
    final static int NUM2 = 5;
    public abstract void shtypDetajet();
    public abstract void abstractMethod();
    default void method1(){
        System.out.println("Default method!");
        method2();
    }
    private void method2(){
        System.out.println("Private method!");
    }
}

interface Fly{ // extends Interface1
    int NUM = 5;
    void fly();
}

class Bird implements Fly{
    public void fly(){
        System.out.println("Bird fly");
        System.out.println(NUM);
    }
}

class Airplane implements Fly{
    public void fly(){
        System.out.println("Airplane fly");
    }
}

class ClassC implements Interface1{
    public void shtypDetajet(){

    }
    public void abstractMethod(){

    }
}