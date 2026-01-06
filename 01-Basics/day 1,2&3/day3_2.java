import java.util.Scanner;

public class day3_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long factorial = 1;
        int num = sc.nextInt();
        int i;
        for(i=1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println("Number is:" + num);
        System.out.println(("Factorial is:" + factorial));
        sc.close();
        
    }
    
}
