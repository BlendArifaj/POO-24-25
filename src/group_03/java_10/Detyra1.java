package group_03.java_10;

public class Detyra1 {
    public static void main(String[] args){
        Animal animal1 = new RaceDog(8);
        Dog dog1 = new RaceDog(7);
        RaceDog raceDog1 = new RaceDog(6);

        animal1 = new Cat(10);
        Cat cat1 = new Cat(9);

        feedAnimal(animal1);
        feedAnimal(dog1);
        feedAnimal(raceDog1);
        feedAnimal(cat1);
    }

    public static void feedAnimal(Animal animal){
        animal.eat();
        animal.makeSound();
//        if(animal instanceof RaceDog){
//            ((RaceDog) animal).bark();
//        }
    }
}

abstract class Animal{
    int age;
    public Animal(int age) {
        this.age = age;
    }
    abstract void makeSound();
    abstract void eat();
}

abstract class Dog extends Animal{
    public Dog(int age){
        super(age);
    }
    abstract void bark();
}

class RaceDog extends Dog{
    public RaceDog(int age){
        super(age);
    }
    public void makeSound(){
        System.out.println("Race dog sound ...");
    }
    public void eat(){
        System.out.println("Race dog eating ...");
    }
    public void bark(){
        System.out.println("Race dog: ....");
    }
}

class Cat extends Animal{
    public Cat(int age){
        super(age);
    }
    public void makeSound(){
        System.out.println("Cat sound ...");
    }
    public void eat(){
        System.out.println("Cat eating ...");
    }
}
