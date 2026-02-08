// Problem 2 is Use A Built In Package display A Message By Using Sout After Taking User Input

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("Enter ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n ; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
