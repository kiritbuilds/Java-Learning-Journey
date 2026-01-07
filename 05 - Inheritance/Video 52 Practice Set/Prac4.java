class Base2{
    int x;
    Base2(int x){
        System.out.println("It Is A Constructor Of A Base Class " + x);
    } 
}
class Derived2 extends Base2{
    int y;
    Derived2(int x, int y){
        super(x);
        System.out.println("It Is A Constructor of A Derived2 Class" + y);
    }
}
class Derived3 extends Derived2{
    int z;
    Derived3(int x, int y, int z){
        super(x,y);
        System.out.println("It Is A Constructor of A Derived3 Class" + z);
    }
}
public class Prac4 {
    public static void main(String[] args) {
        Derived3 a = new Derived3(5,10, 15);
        System.out.println(a);
    }
}
