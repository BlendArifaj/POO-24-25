package group_03.java_10;
// Klasat Abstrakte dhe Nderfaqet
public class Main {
    public static void main(String[] args){
//        Vehicle vehicle1 = new Vehicle(); // X
        Vehicle vehicle2 = new BMW(1);
        BMW bmw = new BMW(2);
        details(vehicle2);
        details(bmw);
        Vehicle vehicle3 = new VW(3);
        VW vw = new VW(4);
        details(vehicle3);
        details(vw);
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
    public void shtypDetajet(){
        System.out.println("Detajet: ....");
    }
    abstract public void speed();
    abstract public void price();
    public int getSerialNumber(){
        return this.serialNumber;
    }
}
class BMW extends Vehicle{
    public BMW(int serialNumber){
        super(serialNumber);
    }
    public void speed(){
        System.out.println("BMW Speed ...");
    }
    public void price(){
        System.out.println("BMW Price ...");
    }
}
class VW extends Vehicle{
    public VW(int serialNumber){
        super(serialNumber);
    }
    public void speed(){
        System.out.println("VW Speed ...");
    }
    public void price(){
        System.out.println("VW Price ...");
    }
}
