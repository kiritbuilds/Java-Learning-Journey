import java.util.Scanner;

public class day3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int reversedNumber = 0;
        while(num!=0){
            int lastDigit = num % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("Enter Reversed Is:" + reversedNumber);
        sc.close();
    }
    
}
