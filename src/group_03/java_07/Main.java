package group_03.java_07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Animal 1");
        Dog dog = new Dog("Dog 1", "Race 1");
        Cat cat = new Cat("Cat 1", 5);
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));
        System.out.println("cat instanceof Animal: " + (cat instanceof Animal));

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(dog);
        animals.add(cat);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(animal);
        objects.add("A String");



    }
}

class Animal{
    public String name;
    Animal(String name){
        this.name = name;
    }
    protected void sound(){
        System.out.println("No sound yet!");
    }
}
class Dog extends Animal{
    protected String race;
    Dog(String name, String race){
        super(name);
        this.race = race;
    }

    @Override
    protected void sound(){
        System.out.println("Bark...");
    }

    public void test(){
        super.sound();
        this.sound();
    }
}
class Cat extends Animal{
    private int age;
    protected Cat(String name, int age){
        super(name);
        this.age = age;
    }

    protected void sound(boolean isSick){
        if(isSick)
            System.out.println("Cat " + this.name + " is sick!");
        else
            super.sound();
    }
}

//class ClassA extends ClassB, ClassC, ClassD{
//
//}

//class ClassA extends ClassB{
//
//}
//class ClassB extends ClassC{
//
//}
//class ClassC extends ClassD{
//
//}
//









