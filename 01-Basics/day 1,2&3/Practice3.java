import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float v = sc.nextFloat();
        float u = sc.nextFloat();
        float a = sc.nextFloat();
        float s = sc.nextFloat();
        float Value = (v*v - u*u)/(2 * a * s);
        System.out.println(Value);
        sc.close();

    }
    
}
