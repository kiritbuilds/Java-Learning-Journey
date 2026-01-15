interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void BlowHornK3g();
    void BlowHornmn();
}

class AvonCycle implements Bicycle , HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void BlowHornK3g(){
        System.out.println("Poo Poo Poo");
    }
    public void BlowHornmn(){
        System.out.println("Pii Pii Pii");
    }
}
// You can Implements Classes But You can Extend only one class because Its Interface Condition Parent Ka Ek Hi Child Hona Chhiye.

public class Interfaces{
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can Create Properties In Interface 
        System.out.println(cycleHarry.a);
        // You cannot Modify The Properties One you delcared Its Final.
        // cycleHarry.a = 50;
        cycleHarry.BlowHornK3g();
        cycleHarry.BlowHornmn();
        




    }
}