@FunctionalInterface
interface DemoAno {
    void meth1(int a);
    // void meth2();
}

// Simple Normal 
// class AnoDemo implements DemoAno {
//     public void display() {
//         System.out.println("Display Method");
//     }

//     @Override
//     public void meth1() {
//         System.out.println("I Am A Meth1 ");
//     }

//     @Override
//     public void meth2() {
//         System.out.println("I Am A Meth2 ");
//     }
// }

// class HarryFunc implements DemoAno{
//      @Override
//     public void meth1() {
//         System.out.println("I Am A Meth1 ");
//     }
// }

public class AnonymsLemdaDemo {
    public static void main(String[] args) {
        // DemoAno obj = new AnoDemo();
        // obj.meth1();

        // Anonyms Class
        // DemoAno obj = new DemoAno() {
        //     @Override
        //     public void meth1() {
        //         System.out.println("I Am A Meth1 ");
        //     }

        //     @Override
        //     public void meth2() {
        //         System.out.println("I Am A Meth2 ");
        //     }
        // };
        // obj.meth1();

        // Lamda Expression
        // DemoAno obj = new HarryFunc();
        // obj.meth1();

        DemoAno obj = (a)->{ System.out.println("I Am A Method 1 From Lemda " + a);};
        obj.meth1(6);
    }
}
