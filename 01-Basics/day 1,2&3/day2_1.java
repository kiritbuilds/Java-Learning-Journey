import java.util.Scanner;

public class day2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        int user_year = sc.nextInt();
        if(user_year%4==0){
            System.out.println("It is a Leap Year:");
        }else{
            System.out.println("It is a not a Leap Year:");
        }
        sc.close();
    }
    
}
