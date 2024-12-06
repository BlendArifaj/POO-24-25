package group_02.java_10;

public class Detyra1 {
    public static void main(String[] args){
        Animal raceDog = new RaceDog(5);
        printDetails(raceDog);

        Dog raceDog2 = new RaceDog(5);
        printDetails(raceDog2);

        RaceDog raceDog3 = new RaceDog(9);
        printDetails(raceDog3);

        // raceDog = new Dog(7); // X
        raceDog = new Cat(3, "Blue");
        printDetails(raceDog);
    }

    public static void printDetails(Animal animal){
        System.out.println("Age: " + animal.age);
        animal.makeSound();
//        animal.bark();
    }
}

class ClassB{

}
abstract class Animal extends ClassB{
    int age;
    public Animal(int age){
        this.age = age;
    }
    public abstract void makeSound();
}

abstract class Dog extends Animal{
    public Dog(int age){
        super(age);
    }
    public abstract void bark();
}
class RaceDog extends Dog{
    RaceDog(int age){
        super(age);
    }
    public void makeSound(){
        System.out.println("Race dog sound ...");
    }
    public void bark(){
        System.out.println("Race dog bark ...");
    }
}
class Cat extends Animal{
    String color;
    Cat(int age, String color){
        super(age);
        this.color = color;
    }
    public void makeSound(){
        System.out.println("Cat sound ...");
    }
}
