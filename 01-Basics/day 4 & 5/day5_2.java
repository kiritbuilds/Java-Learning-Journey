import java.util.Scanner;
public class day5_2 {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i =1;
        while (i<= num) {
            int evenumber = 2 * i;
            sum = sum + evenumber;
            i++;
        }
        System.out.println("The sum of first " + num + " sum is:" + sum);
        sc.close();
    }
}
