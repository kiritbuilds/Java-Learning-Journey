class Circle{
    public double r;
    Circle(double r){
        System.out.println("Circle Class Constructor:" + "= " + r);
    }
}
class Cylinder extends Circle{
    public double h;
     Cylinder(double r, double h){
        super(r);
        System.out.println("Cylinder Class Constructor" + "= " + h);
    }
}
public class Prac1 {
    public static void main(String[] args) {
     Cylinder obj = new Cylinder(12,5);  
     System.out.println(obj); 
    }
}
