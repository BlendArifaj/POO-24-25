package group_03.java_09;

public class Main {
    public static void main(String[] args){
        Math math = new Math();
        System.out.println(math.sum(5, 6));
        System.out.println(math.sum(5, 6, 7));
        System.out.println(math.sum(5.6, 7.8));

        Animal animal;
        animal = new Animal("Undefined!");
        animal.makeSound();
        System.out.println("Name: " + animal.name);
        System.out.println("Gender: " + animal.gender);

        animal = new Dog("Male");
        animal.makeSound();
        System.out.println("Name: " + animal.name);
        System.out.println("Gender: " + animal.gender);

        animal = new SpecialDog("Female");
        animal.makeSound();
        System.out.println("Name: " + animal.name);
        System.out.println("Gender: " + animal.gender);

        animal = new Cat("Female");
        animal.makeSound();
        System.out.println("Name: " + animal.name);
        System.out.println("Gender: " + animal.gender);

//        Dog dog = new Dog();
//        dog = new SpecialDog();
//        dog = new Animal();
//        dog = new Cat();


    }
}

class Math{
    public int sum(int n1, int n2){
        return n1 + n2;
    }
    public int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double sum(double n1, double n2){
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
    public void makeSound(){
        System.out.println("Woof! Woof! Woof!");
    }
}
class SpecialDog extends Dog{
    public String name = "SpecialDog name";
    public SpecialDog(String gender){
        super(gender);
    }
    public void makeSound(){
        System.out.println("Wooof! Wooof! Wooof!");
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









