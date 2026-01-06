import java.util.Scanner;
public class day4_2 {
    public static void main(String[] args) {
        System.out.println("Enter Year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year %400 ==0 || year % 4 == 0 && year %100!= 0){
            System.out.println("It's Leap Year");
        }else{
            System.out.println("It is a Not a Leap Year");
        }
        sc.close();

    }
    
}
