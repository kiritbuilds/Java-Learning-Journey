class TammyVecetti{
    public void hit(){
        System.out.println("Hitting...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
    public void run(){
        System.out.println("Running...");
    }
}
public class pr6 {
    public static void main(String[] args) {
        TammyVecetti k = new TammyVecetti();
        k.hit();
        k.fire();
        k.run();
    }
}
