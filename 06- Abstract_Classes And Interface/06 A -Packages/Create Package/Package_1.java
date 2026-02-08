// Using Packages
// 1. 
// import java.util.Scanner;
// 2.
// import java.util.*;

public class Package_1{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // 3. 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Yes First Number is a " + a);
        sc.close();
    }
}