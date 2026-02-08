// Prove that You Cannot Access Default Property in Another Package And Use That Protected in Another Package;
// package Proved;
// import MainCalculator.Practice1;

// Practice4.java:8: error: DefInt is not public in Practice1; cannot be accessed from outside package
        // System.out.println(DefInt);
                        //    ^
// 1 error

class C1 extends Practice1{
    void Prac1(){
        System.out.println(ProInt);
        System.out.println(DefInt);
    }
}


public class Practice4 {
    public static void main(String[] args) {
        C1 c = new C1();
        c.Prac1();
    }
}
