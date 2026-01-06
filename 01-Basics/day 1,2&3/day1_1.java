import java.util.Scanner;

public class day1_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        double Radius = sc.nextFloat();
        double Area = 3.14 * Radius * Radius;
        double c = 2 * 3.14 * Radius;
        // c = Circumference of circle parigh
        System.out.println("Area is :" + Area);
        System.out.println("Cricumference of Circle is:" + c);
        sc.close();


    }
    
}
