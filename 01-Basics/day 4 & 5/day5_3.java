import java.util.Scanner;
public class day5_3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Multiplication Table is:");
       int i;
       int sum = 0;
       int num = sc.nextInt();
       for(i=1; i<=10; i++){
        sum = sum + (num * i);
    }
       
       System.out.println("The sum of numbers in the multiplication table of " + num + " is: " + sum);   
    // System.out.println(num + "+" + i + "=" + (num + i));
       sc.close(); 
    }
}
