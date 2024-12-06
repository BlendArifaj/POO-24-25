package group_04.java_10;

public class Detyra1 {
    public static void main(String[] args){
        Animal animal = new RaceDog(10);
        feedAnimal(animal);

        animal = new Cat(6);
        feedAnimal(animal);

        Dog dog = new RaceDog(5);
        feedAnimal(dog);
        RaceDog raceDog = new RaceDog(5);
        feedAnimal(raceDog);
    }

    public static void feedAnimal(Animal animal){
        animal.eat();
        animal.makeSound();
    }
}
abstract class Animal{
    int age;
    public Animal(int age){
        this.age = age;
    }
    abstract void makeSound();
    abstract void eat();
}

abstract class Dog extends Animal{
    Dog(int age){
        super(age);
    }
    abstract void bark();
    public void eat(){
        System.out.println("Dog is eating ...");
    }
}
class RaceDog extends Dog{
    RaceDog(int age){
        super(age);
    }
    public void makeSound(){
        System.out.println("Race dog making sounds ...");
    }
    public void bark(){
        System.out.println("Race dog barking ...");
    }
}
class Cat extends Animal{
    Cat(int age){
        super(age);
    }
    public void eat(){
        System.out.println("Cat is eating ...");
    }
    public void makeSound(){
        System.out.println("Cat is making sounds ...");
    }
}
