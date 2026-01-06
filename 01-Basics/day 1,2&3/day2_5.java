import java.util.Scanner;
public class day2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks:");
        double marks = sc.nextDouble();
        if(marks >= 90){
            System.out.println("Grade is A:");
        }else if(marks >= 80){
            System.out.println("Grade is B:");
        }
        else if(marks >= 70){
            System.out.println("Grade is C:");
        }
        else if(marks >= 60){
            System.out.println("Grade is D:");
        }
        else{
            System.out.println("Grade is E:");
        }
        sc.close();
    }
    
}
