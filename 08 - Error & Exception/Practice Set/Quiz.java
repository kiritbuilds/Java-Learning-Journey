// Write A Java Program That Allow You to keep accessing an array until a valid index is given by the array. 

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Ente The Value Of Index ");
            int ind = sc.nextInt();
            try {
                System.out.println("Watch Video No 82 ");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry This Index Does Not Exist ");
                    System.out.println(e);
                    System.out.println("Exception is Level 2 ");
                }
            } catch (Exception e) {
                System.out.println("Exception is Level 1 ");
                System.out.println(e);
            }
        }
    }
}
