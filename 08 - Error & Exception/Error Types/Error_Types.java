import java.util.Scanner;

public class Error_Types {
    public static void main(String[] args) {
        // Syntax Error Demo
        // int a = 0 // Error No Semicolon!
        // b = 0; // Error: b Is Not Declared!.

        // Logical Error Demo
        // Write A Program to print 1 to 10 numbers
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1); // Output Aayega lekin Isme 9 bhi print Hoga Jo Ki Prime Nahin Hai Kyoki 3 se
                                           // bhi divide hota hai so Yeh Logical Error Ka Example Hai.
        }

        // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer Part Of 1000 divided by k is " + 1000 / k);
        // Isme Error Yeh aayega ki 0 se divide karte waqt yeh infinity hota hai to yeh
        // ek runtime error hai aur ise handle try catch me exeption me dal ke kiya jata
        // hai jisse error throw nahin karta yeh..
    }
}