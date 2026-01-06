import java.util.Scanner;
public class day3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <= 0){
            System.out.println("Please Enter Positive number:");
        }else if(num == 1){
            System.out.println(0);
        }else{
            int a = 0;
            int i;
            int b = 1;
            System.out.println(a);
            System.out.println(b);
            for(i=2; i<=num; i++){
                int next_num = a+b;
                System.out.println(next_num);
                a = b;
                b  = next_num;
            }
        }

    }
    
}
