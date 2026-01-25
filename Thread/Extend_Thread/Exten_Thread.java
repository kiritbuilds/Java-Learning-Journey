class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("My Thread Is RUnning");
            System.out.println("I Am Happy");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("Thread 2 For Chatting With Him");
            System.out.println("I Am Sad!");
            i++;
        }
    }
}

public class Exten_Thread{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        
    }
}