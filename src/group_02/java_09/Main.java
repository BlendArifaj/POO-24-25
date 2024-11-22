package group_02.java_09;

public class Main {
    public static void main(String[] args){
        Math math = new Math();
        math.sum(5, 6);
        math.sum(5.5, 6.7);

        Animal animal = new Animal("Undefined");
        animal.makeSound();
        System.out.println("Name: " + animal.name);
        System.out.println("Gender: " + animal.gender);

        animal = new Dog("Male");
        animal.makeSound();
        System.out.println("Name: " + animal.name);
        System.out.println("Gender: " + animal.gender);

        animal = new Cat("Female");
        animal.makeSound();
        System.out.println("Name: " + animal.name);
        System.out.println("Gender: " + animal.gender);
//        Dog dog = new Dog();
//        dog = new Animal();
//        dog = new Cat();

    }
}

class Math{
    public int sum(int n1, int n2){
        return n1 + n2;
    }
    public double sum(double n1, double n2){
        return n1 + n2;
    }
}

class Animal{
    public String name = "Animal name";
    public String gender;
    Animal(String gender){
        this.gender = gender;
    }
    public void makeSound(){
        System.out.println("No sound! There is no animal defined!");
    }
}
class Dog extends Animal{
    public String name = "Dog name";
    Dog(String gender){
        super(gender);
    }
    public void makeSound(){
        System.out.println("Woof! Woof!");
    }
}
class Cat extends Animal{
    public String name = "Cat name";
    Cat(String gender){
        super(gender);
    }
    public void makeSound(){
        System.out.println("Meow! Meow!");
    }
}
