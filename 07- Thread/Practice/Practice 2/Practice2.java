class GoodThr3 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning 1 bar ");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class GoodThr4 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning 2 bar ");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class Practice2 {
    public static void main(String[] args) {
        GoodThr3 t1 = new GoodThr3();
        GoodThr4 t2 = new GoodThr4();
        t1.start();
        t2.start();
    }
}
