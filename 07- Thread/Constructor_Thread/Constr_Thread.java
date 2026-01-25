class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        // int i = 34;
        System.out.println("Thank You");
    }
}
class MyThr1 implements Runnable{
    String r;
    
    public MyThr1(String r){
        this.r = r;
    }
    public void run(){
        System.out.println("Thank You 1 bar");
    }
}

class MyThr2 implements Runnable{
    String r;
    String name;
    public MyThr2(String r, String name){
        this.r=r;
        this.name=name;
    }
    public void run(){
        System.out.println("Thank You 2 bar");
    }
}

public class Constr_Thread{
    public static void main(String[] args) {
        MyThr t1 = new MyThr("kirit");
        MyThr t2 = new MyThr("Brijesh");
        t1.start();
        System.out.println("The Id Of A Thread Is " + t1.getId());
        System.out.println("The Name Of A Thread Is " + t1.getName());
        t2.start();
        System.out.println("The Id Of A Thread Is " + t2.getId());
        System.out.println("The Name Of A Thread Is " + t2.getName());

        MyThr1 bullet1 = new MyThr1("Kirit Ki Bullet");
        Thread gun1 = new Thread(bullet1);

        gun1.start();
        System.out.println("The Name Of A Thread Is " + bullet1.r);

        MyThr1 bullet2 = new MyThr1("Simple Bullet");
        Thread gun2 = new Thread(bullet2, "Kirit Ki Bullet1");

        gun2.start();
        System.out.println("The Name Of A Thread Is " + gun2.getName());
    }
}