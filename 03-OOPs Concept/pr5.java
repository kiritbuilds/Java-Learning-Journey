class Circle{
    double r = 61;
    public double area(){
        return 3.14*r*r;
    }
    public double parimeter(){
        return 2*3.14*r;
    }
}
public class pr5 {
    public static void main(String[] args) {
        Circle k = new Circle();
        System.out.println(k.area());
        System.out.println(k.parimeter());
    }
}
