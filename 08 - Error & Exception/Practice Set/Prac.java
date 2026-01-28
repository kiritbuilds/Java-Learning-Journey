import java.util.Scanner;

class MyException1 extends Exception {
    public MyException1(String Message) {
        super(Message);
    }

    @Override
    public String toString() {
        return "MyException:" + getMessage();
    }
}

public class Prac {
    public static void main(String[] args) {
        // Problem 1

        // Syntax Error
        // int a = 7

        // Logical Error
        // int age = 78;
        // int year_born = 2000-78;

        // Runtime Error
        // int c = 10/0;

        // Problem 2
        // try {
        // int c = 10/0;
        // System.out.println(c);

        // } catch (IllegalArgumentException e) {
        // System.out.println("HeHe");
        // } catch (ArithmeticException e){
        // System.out.println("HaHa" );
        // }

        // Problem 3
        // int[] marks = new int[3];
        // marks[0] = 5;
        // marks[1] = 10;
        // marks[2] = 15;
        // Scanner sc = new Scanner(System.in);
        // int index;
        // boolean flag = true;
        // int i = 0;
        // while (flag && i < 5) {
        // try {
        // System.out.println("Enter Number ");
        // index = sc.nextInt();
        // System.out.println("The Value Of Marks[index] is " + marks[index]);
        // } catch (Exception e) {
        // System.out.println("Invalid Index");
        // i++;
        // }
        // }
        // if (i <= 5) {
        // System.out.println("Error");
        // }

        // Problem 4
        // Problem 4 Implementation
        // boolean flag = true;
        int[] marks = { 7, 56, 6 };
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;

        try {
            // Loop tab tak chalega jab tak 5 errors na ho jayein
            while (i < 5) {
                try {
                    System.out.println("Enter the value of index");
                    index = sc.nextInt();
                    System.out.println("The value of marks[index] is " + marks[index]);

                    break;
                } catch (Exception e) {
                    System.out.println("Invalid Index");
                    i++; // Galti count badhao
                }
            }

            if (i >= 5) {
                throw new MyException1("Error: Max Retries reached!");
            }
        } catch (MyException1 e) {
            System.out.println(e.toString());
        }

    // Problem 5
    
    }
}