import java.util.Scanner;
public class Exercise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject Marks In Out Of 100");
        float maths = sc.nextFloat();
        float science = sc.nextFloat();
        float English = sc.nextFloat();
        float Gujarati = sc.nextFloat();
        float Hindi = sc.nextFloat();
        float Percentage = ((maths + science + English + Gujarati + Hindi) / 500 ) * 100;
        System.out.println("Student Percentage is a:" + Percentage); 
        sc.close();
        
    }
}