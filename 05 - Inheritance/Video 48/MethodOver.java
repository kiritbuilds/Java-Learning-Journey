class A{
    public void math2(){
        System.out.println("A Method Is Class A");
    }
}
class B extends A{
    @Override
    public void math2(){
        System.out.println("A Method Is Class B");
    }
    public void math3(){
        System.out.println("A Method Is Class B");
    }
}

public class MethodOver {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.math2();
        b.math2();
    }
}
