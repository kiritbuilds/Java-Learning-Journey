class sqare{
    double side = 50.2;
    public void Area(){
        System.out.println("Area is a: " + side * side );
    }
    public void parimeter(){
        System.out.println("Parimeter is a: " + 4 * side);
    }
}

public class pr3 {
    public static void main(String[] args) {
        sqare kirit = new sqare();
        kirit.Area();
        kirit.parimeter();
    }
}
