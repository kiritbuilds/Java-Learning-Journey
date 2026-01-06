class Cylinder1{
    private double radius;
    private double height;
     public double getRadius(){
        return radius;
    }
     public void setRadius(int k){
        radius = k;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(int c){
        height = c;
    }    
    
    public double getArea(){
        return (2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius);
    }
    public double getVolume(){
        return 3.14 * radius * radius * height;
    }
}

public class ps2 {
    public static void main(String[] args) {
        Cylinder1 kirit = new Cylinder1();
        kirit.setRadius(20);
        kirit.setHeight(30);
        System.out.println("Radius is: " + kirit.getRadius());
        System.out.println("Height is: " + kirit.getHeight());

        // 3. Unhi values se calculate kiya
        System.out.println("Surface Area is: " + kirit.getArea());
        System.out.println("Volume is: " + kirit.getVolume());
    }
}
