import java.util.Scanner;
public class day3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int sum = 0;
        for(i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("N Natural Number " + num);
        System.out.println("sum is: " + sum);
        sc.close();

    }
    
}
