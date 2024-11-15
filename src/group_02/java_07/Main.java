package group_02.java_07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("animal 1");
        Dog dog = new Dog("Dog 1", "Race 1");
        Cat cat = new Cat("Cat 1", 5);
        System.out.println("animal instanceof Dog "+ (animal instanceof Dog));
        System.out.println("dog instanceof Animal " + (dog instanceof Animal) );
//        System.out.println("cat instanceof Dog" + (cat instanceof Dog));
        animal.eat();
        dog.eat();
        cat.eat();
        cat.eat("Food 1");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(animal);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(cat);
        objects.add(dog);
        objects.add(animal);

    }
}
class Animal {
    public String name;
    public Animal(String name){
        this.name = name;
    }
    protected void eat(){
        System.out.println("Animal is eating...");
    }
}
class Dog extends Animal{
    protected String race;
    public Dog(String name, String race){
        super(name);
        this.race = race;
    }
    protected void eat(){
        System.out.println(this.name + " is eating...");
    }
    public void test(){
        this.eat();
        super.eat();
    }
}
class Cat extends Animal{
    public int age;
    public Cat(String name, int age){
        super(name);
        this.age = age;
    }
    protected void eat(String food){
        this.eat();
//        this.eat("Food1");
    }
}


//class ClassA extends ClassB, ClassC, ClassD{
//super(ClassB).eat();
//}

class ClassA extends ClassB{}

class ClassB extends ClassC{}

class ClassC extends Object{}