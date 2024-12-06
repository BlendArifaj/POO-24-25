package group_04.java_10;

//Klasat Abstrakte dhe Nderfaqet
public class Main {
    public static void main(String[] args){
//        Vehicle vehicle1 = new Vehicle(); // X
        Vehicle vehicle1 = new BMW(1);
        details(vehicle1);
        vehicle1 = new VW(2);
        details(vehicle1);
        BMW vehicle2 = new BMW(3);
        details(vehicle2);
    }

    public static void details(Vehicle vehicle){
        vehicle.price();
        vehicle.speed();
    }
}

abstract class Vehicle{
    private int serialNumber;
    public Vehicle(int serialNumber){
        this.serialNumber = serialNumber;
    }
    abstract public void speed();
    abstract public void price();
}
class BMW extends Vehicle{
    public BMW(int serialNumber){
        super(serialNumber);
    }
    public void speed(){
        System.out.println("BMW Top speed: 220 kmh");
    }
    public void price(){
        System.out.println("BMW price: 100");
    }
}
class VW extends Vehicle{
    public VW(int serialNumber){
        super(serialNumber);
    }
    public void speed(){
        System.out.println("VW top speed: 120kmh");
    }
    public void price(){
        System.out.println("VW price: 40");
    }
}
