import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        // int a = 10;
        // if(a==11){
        //     System.out.println("I Am 11");
        // }else{
        //     System.out.println("I am 10");
        // }
        Scanner sc = new Scanner(System.in);
        float maths = sc.nextFloat();
        float science = sc.nextFloat();
        float hindi = sc.nextFloat();
        float percentage = ((maths + science + hindi ) / 3 ) * 100;
        if(maths >= 33 && science >=33 && hindi >= 33 && percentage >= 40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        sc.close();

        
    }
}
