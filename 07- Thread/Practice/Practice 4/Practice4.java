class GoodThr7 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

class GoodThr8 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thank You");
        }
    }
}

public class Practice4 {
    public static void main(String[] args) {
        GoodThr7 t1 = new GoodThr7();
        GoodThr8 t2 = new GoodThr8();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        // State Check 
        // t1.start();
        t2.start();
        System.out.println(t2.getState());
        // Problem 5
        System.out.println(Thread.currentThread().getState());        
    }
}

