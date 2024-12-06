package group_01.java_10;

public class Detyra1 {
    public static void main(String[] args){
        Animal animal = new RaceDog(5, "Black");
        printAnimalDetails(animal);

        RaceDog raceDog = new RaceDog(6, "White");
        printAnimalDetails(raceDog);

        Dog dog = new RaceDog(3, "Brown");
        printAnimalDetails(dog);

        animal = new Cat(5);
        printAnimalDetails(animal);
    }

    public static void printAnimalDetails(Animal animal){
        System.out.println("Age: " + animal.age);
        animal.makeSound();
    }

}


abstract class Animal{
    int age;
    public Animal(int age){
        this.age = age;
    }
    abstract void makeSound();
}
abstract class Dog extends Animal{
    public Dog(int age){
        super(age);
    }
    abstract void dogMethod();
}
class RaceDog extends Dog{
    String color;
    public RaceDog(int age, String color){
        super(age);
        this.color = color;
    }
    void dogMethod(){
        System.out.println("Random dog method!");
    }
    void makeSound(){
        System.out.println("Race dog sound ...");
    }
}

class Cat extends Animal{
    public Cat(int age){
        super(age);
    }

    void makeSound(){
        System.out.println("Cat sound ...");
    }
}
