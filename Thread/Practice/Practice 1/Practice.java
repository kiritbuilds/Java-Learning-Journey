class GoodThr extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning! ");
    }
  }
}

class GoodThr1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome! ");
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        GoodThr t1 = new GoodThr();
        GoodThr1 t2 = new GoodThr1();
        t1.start();
        t2.start();
    }
}
