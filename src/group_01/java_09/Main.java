package group_01.java_09;

public class Main {
    public static void main(String[] args){
        Math math = new Math();
        math.sum(5, 6);

        math.sum(5.1f, 6.4f);

        Animal animal = new Animal("Undefined");
        animal.makeSound();
        System.out.println("Name: " + animal.name);
        System.out.println("Gender: " + animal.gender);

        animal = new Dog("Female");
        animal.makeSound();
        System.out.println("Name: " + animal.name);
        System.out.println("Gender: " + animal.gender);

        animal = new Cat("Male");
        animal.makeSound();
        System.out.println("Name: " + animal.name);
        System.out.println("Gender: " + animal.gender);
//        Dog dog = new Dog();
//        dog = new Animal();
    }
}

class Math{
    public int sum(int n1, int n2){
        return n1 + n2;
    }
    public float sum(float n1, float n2){
        return n1 + n2;
    }
}

class Animal{
    public String name = "Animal name";
    public String gender;

    public Animal(String gender){
        this.gender = gender;
    }

    public void makeSound(){
        System.out.println("No animal defined yet!");
    }
}
class Dog extends Animal{
    public String name = "Dog name";
    public Dog(String gender){
        super(gender);
    }
    @Override
    public void makeSound(){
        System.out.println("Woff! Woff! Woff!");
    }
}
class Cat extends Animal{
    public String name = "Cat name";
    public Cat(String gender){
        super(gender);
    }
    public void makeSound(){
        System.out.println("Meow! Meow! Meow!");
    }
}
