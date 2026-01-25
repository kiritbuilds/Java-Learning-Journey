class GoodThr5 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}
class GoodThr6 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Thank You");
        }
    }
}
public class Practice3 {
    public static void main(String[] args) {
        GoodThr5 t1 = new GoodThr5();
        GoodThr6 t2 = new GoodThr6();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        // State Check 
        // t1.start();
        t2.start();
        System.out.println(t2.getState());
        
    }
}
