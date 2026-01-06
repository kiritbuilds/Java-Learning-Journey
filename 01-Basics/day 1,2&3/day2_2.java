import java.util.Scanner;
public class day2_2 {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
         System.out.println("A is the Highest Integer Number:");
        }else if(b>a && b>c){
            System.out.println("B is the Highest Integer Number:");
        }else{
            System.out.println("C is the Highest Integer Number:");
        }
        sc.close();
    }
    
}
