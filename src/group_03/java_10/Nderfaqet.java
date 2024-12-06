package group_03.java_10;


public class Nderfaqet {
    public static void main(String[] args){
        Fly object = new Bird();
        fly(object);

        object = new Airplane();
        fly(object);
    }

    public static void fly(Fly object){
        object.fly();
    }
}

interface UserInterface{
    int NUM = 150;

    public abstract void details();
}

class User implements UserInterface{
    public void details(){
        System.out.println("User details");
    }
}

interface Fly{
    void fly();
}
class Bird implements Fly{
    public void fly(){
        System.out.println("Bird flying ...");
    }
}

class Airplane implements Fly{
    public void fly(){
        System.out.println("Airplane flying ...");
    }
}