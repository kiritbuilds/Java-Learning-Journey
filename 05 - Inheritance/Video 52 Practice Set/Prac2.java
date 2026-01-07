class Rectangle{
    double r;
   Rectangle(double r){
       this.r = r;
    System.out.println("It Is A Constructor Of Rectangle");
   }
   public double getX(){
    return 3.14*r*r;
   }
}

class Cuboid extends Rectangle{
    double h;
    Cuboid(double r, double h){
        super(r);
        this.h = h;
        System.out.println("It Is A Constructor Of Cuboid");
    }
    public double getY(){
        return 3.14*r*r*h;
    }
}
public class Prac2 {
    public static void main(String[] args) {
        Cuboid a = new Cuboid(12,5);
        a.getY();
        System.out.println(a.getY());
    }
}
