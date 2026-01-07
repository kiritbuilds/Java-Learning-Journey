class base{
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("This is Setter Method:");
        this.x = x;
    }
    public void printMe(){
        System.out.println("This is A Constructor");
    }
}
class Derived extends base{
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

public class Inharitance{
    public static void main(String[] args) {
        base b = new base();
        // Creating an Object of base class
        b.setX(61);
        System.out.println(b.getX());

        // Creating an object of Derived class
        Derived d = new Derived();
        d.setY(51);
        System.out.println(d.getY());
    }
}