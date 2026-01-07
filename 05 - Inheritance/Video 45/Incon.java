class Base1{
    public int x;
    Base1(){
        System.out.println("An Base Class Constructor:");
    }
    Base1(int x){
        System.out.println("An A Overloaded Constructor x is : " + x);
    }
}
class Derived1 extends Base1{
    public int y;
    Derived1(){
        System.out.println("An Derived Class Constructor:");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("An A Overloaded Constructor y is : " + y);
    }
}
class childOfDerived extends Derived1{
    public int z;
    childOfDerived(){
        System.out.println("An childOfDerived Class Constructor:");
    }
    childOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("An A Overloaded Constructor z is : " + z);
    }
}
public class Incon {
    public static void main(String[] args) {
        childOfDerived b = new childOfDerived(10,20,30);
        // childOfDerived b = new childOfDerived();
        System.out.println(b);
        
    }
    
}
