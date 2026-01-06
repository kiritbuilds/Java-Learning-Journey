class Rectangle{
    int length = 50;
    int width = 40;
    public int area(){
        return length * width ;
    }
    public int parimeter(){
        return 2 * (length + width);
    }
}
public class pr4 {
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
       System.out.println( R.area());
       System.out.println( R.parimeter());
    }
}
