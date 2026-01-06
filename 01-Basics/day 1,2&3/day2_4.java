import java.util.Scanner;

public class day2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1");
        double num1 = sc.nextDouble();
        System.out.println("Enter Operator");
        char Operator = sc.next().charAt(0);
        System.out.println("Enter Number2");
        double num2 = sc.nextDouble();

        switch(Operator){
            case '+':
            double num3 = num1 + num2;
            System.out.println("Sum is : " + num3);
            break;

            case '-':
            double num4 = num1 - num2;
            System.out.println("Difference is: " + num4);
            break;

            case '*':
            double num5 = num1 * num2;
            System.out.println("Multiplication is: " + num5);
            break;

            case '/':
            if(num2!=0){
                double num6 = num1 / num2;
                System.out.println("divided number is " + num6);
            }else{
                System.out.println("Cannot divided by Zero:");
            }
            break;

            default:
            System.out.println("Error: Invalid operator entered. Please use +, -, *, or /.");
        }
        sc.close();
    }
    
}
