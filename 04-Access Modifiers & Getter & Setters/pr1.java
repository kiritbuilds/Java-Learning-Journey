class Cylinder{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int k){
        radius = k;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int c){
        height = c;
    }


}

public class pr1 {
    public static void main(String[] args) {
        Cylinder p = new Cylinder();
        p.setRadius(45);
        p.setHeight(20);
        System.out.println(p.getRadius());
        System.out.println(p.getHeight());
    }
    
}
