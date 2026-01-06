import java.util.Scanner;
public class day3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Multiplication Table:");
        int num = sc.nextInt();
        int i;
        for(i=1; i<=10; i++){
            System.out.println(num + "X" + i + "=" + (num*i));
        }
        sc.close();
    }
}
