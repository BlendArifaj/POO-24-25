package group_01.java_07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Animal 1");
        Dog dog = new Dog("Dog 1", "Race 1");
        Cat cat = new Cat("Cat 1", 5);

        animal.eat();
        dog.eat();
        cat.eat("Food 1");

        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Object> objects = new ArrayList<>();

        animals.add(dog);
        animals.add(cat);
        animals.forEach(
                (a) ->{
                   if(a instanceof Dog){
//                       Logic ...
                   }else if(a instanceof Cat){
//                       logic ...
                   }
                }
        );

        System.out.println("Dog instanceof Animal: " + (dog instanceof Animal));


    }
}

class Animal{
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal{
    private String race;
    public Dog(String emri, String race){
        super(emri);
        this.race = race;
    }
    public void eat(){
        System.out.println(this.name + " is eating...");
    }
}

class Cat extends Animal{
    int age;
    protected Cat(String name, int age){
        super(name);
        this.age = age;
    }
    public void eat(String food){
        super.eat();
        System.out.println("Food: " + food);
    }
}

//class ClassA extends ClassB, ClassC, ClassD{
//
//}
//class ClassA extends ClassB{
//
//}
//
//class classC extends classA{
//
//}
