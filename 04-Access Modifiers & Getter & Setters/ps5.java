class Sphere{
    private double radius;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double k){
        radius = k;
    }
    public double Area(){
        return 4*3.14*radius*radius;
    }
    public double Volume(){
        return (4.0/3.0)* 3.14*radius*radius*radius;
    }
}
public class ps5 {
    public static void main(String[] args) {
        Sphere c = new Sphere();
        c.setRadius(40);
        System.out.println(c.getRadius());
        System.out.println(c.Area());
        System.out.println(c.Volume());
    }
    
}
