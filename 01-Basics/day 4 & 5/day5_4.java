import java.util.Scanner;
public class day5_4 {
    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;
        int i ;
        for(i=1; i<=num; i++ ){
            factorial = factorial * i;
        }
        System.out.println("factorial is:" + factorial);
    }
    
}
