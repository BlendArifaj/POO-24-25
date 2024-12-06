package group_04.java_10;


public class Nderfaqet {
    public static void main(String[] args){
        FlyInterface flyObject = new Bird();
        flyObject.fly();

        flyObject = new Airplane();
        flyObject.fly();
    }
}

interface UserInterface{
    final static int NUM = 10;
    public abstract void shtypDetajet();
    default void defaultMethod(){
        System.out.println("Default method");
        privateMethod();
    }
    private void privateMethod(){
        System.out.println("Private method");
    }
}

class User implements UserInterface{
    public void shtypDetajet(){
        System.out.println(NUM);
    }
}

interface FlyInterface{
    void fly();
}
class Bird implements FlyInterface{
    public void fly(){
        System.out.println("Bird flying ...");
    }
}

class Airplane implements FlyInterface{
    public void fly(){
        System.out.println("Airplane flying ...");
    }
}








