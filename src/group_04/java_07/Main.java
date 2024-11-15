package group_04.java_07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Animal 1");
        Dog dog = new Dog("Dog 1", "Race 1");
        Cat cat = new Cat("Cat 1", "Red");
        animal.sound();
        dog.sound();
        cat.sound();
        cat.sound(5);
//        instanceof
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);
        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(dog);
        animals.add(cat);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(animal);
        objects.add("String");
        Integer n = 5;
        objects.add(n);
    }
}

class Animal{
    protected String name;
    protected Animal(String name){
        this.name = name;
    }
    public void sound(){
        System.out.println("No sound yet!");
    }
}
class Dog extends Animal{
    private String race;
    Dog(String name, String race){
        super(name);
        this.race = race;
    }
    public void sound(){
        System.out.println("Dog sound!");
    }
}
class Cat extends Animal{
    public String color;
    Cat(String name, String color){
        super(name);
        this.color = color;
    }
    Cat(String name){
        super(name);
        this.color = "Black";
    }
    public void sound(int volume){
        super.sound();
        System.out.println("Volume: " + volume);
    }
}

class Cow extends Animal{
    Cow(String name){
        super(name);
    }
}

//class ClassA extends ClassB, ClassC, ClassD{
//
//}

//class ClassA extends ClassB{}
//
//class ClassB extends ClassC{}
//
//class ClassC extends ClassD{ }

//class ClassA extends ClassB{}
//class ClassB extends ClassA{}












