class MyThr3 extends Thread {
    public MyThr3(String name) {
        super(name);
    }

    public void run(){
        System.out.println("Thank You");
        while(true){
            System.out.println("The Name Of Thread Is " + this.getName());
        }
    }
}

public class Priority_Thread{
    public static void main(String[] args) {
        MyThr3 t1 = new MyThr3("Kirit");
        MyThr3 t2 = new MyThr3("Kirit1");
        MyThr3 t3 = new MyThr3("Kirit2");
        MyThr3 t4 = new MyThr3("Kirit3");
        MyThr3 t5 = new MyThr3("Kirit4");
        MyThr3 t6 = new MyThr3("Kirit5 (Most Important) ");
        t6.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

                
    }
}