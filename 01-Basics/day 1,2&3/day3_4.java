import java.util.Scanner;
public class day3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter Number:");
        if(num%2==0){
            System.out.println( num + " is Not a Prime Number:");
        }else{
            System.out.println(num + " is a Prime Number:");
        }
    }
    
}
