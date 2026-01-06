import java.util.Scanner;

public class day1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        float Principle_amount = sc.nextFloat();
        float Rate = sc.nextFloat();
        float time = sc.nextFloat();
        float Simple_Interest = (Principle_amount * Rate * time ) / 100;
        System.out.println(Simple_Interest); 
        sc.close();
    }
    
}
