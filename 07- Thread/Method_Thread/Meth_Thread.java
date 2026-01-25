class MyNewThr extends Thread {
    public void run() {
        // Comment Out Karelu Join Method Mate che
        // int i = 0;
        // while(i<566){
        // System.out.println("Thank You 1 bar ");
        // i++;
        // }
        // Interrupet Method
        while (true) {
            System.out.println("Thank You 1 bar ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyNewThr1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thank You 2 Bar ");
        }
    }
}

public class Meth_Thread {
    public static void main(String[] args) {
        MyNewThr t1 = new MyNewThr();
        MyNewThr1 t2 = new MyNewThr1();
        t1.start();
        // Join Method
        // try {
        // t1.join();
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // Interrupet
        try {
            Thread.sleep(2000); // Main thread 2 second rukega
            t1.interrupt(); // Phir T1 ko disturb karega (Jaago!)
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}
