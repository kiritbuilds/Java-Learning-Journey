import java.util.Scanner;
public class day5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();
        int factorial = 1;
        int i = 1;
        while (i<=num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("factorial is: " + factorial);

    }
}