package group_02.java_10;

public class Nderfaqet {
    public static void main(String[] args){
        Fly flyObject = new Bird();
        flyObject = new Airplane();

        flyObject.fly();

        System.out.println(flyObject instanceof Bird);
        System.out.println(flyObject instanceof Airplane);
        System.out.println(flyObject instanceof Fly);

    }
}

interface UserInterface{
    final static int NUM  = 5;
    public abstract void shtypDetajet();
}
abstract class AbstractUser implements UserInterface{

}
class User implements UserInterface{

    public void shtypDetajet(){
        System.out.println("Num: " + User.NUM);
    }
}


interface Fly{
    void fly();
    default void defaultMethod(){
        privateMethod();
    }
    private void privateMethod(){

    }
}
class Bird implements Fly
{
    public void fly(){

    }
}
class Airplane implements Fly{
    public void fly(){

    }
}