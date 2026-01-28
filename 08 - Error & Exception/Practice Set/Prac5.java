import java.util.Scanner;

class MyException2 extends Exception {
    public MyException2(String Message) {
        super(Message);
    }
    @Override
    public String toString() {
        return "MyException: " + getMessage();
    }
}

public class Prac5{
    
    public static void accessArray() throws MyException2 {
        int[] marks = {7, 56, 6};
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        
        while (i < 5) {
            try {
                System.out.println("Enter index: ");
                index = sc.nextInt();
                System.out.println("Value is: " + marks[index]);
                break; // Sahi jawab mila, bahar niklo
            } 
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        
        // Agar 5 baar galti hui, tabhi Exception feko
        if (i >= 5) {
            throw new MyException2("Max Retries Exceeded (5 baar galat kiya!)");
        }
    }

    public static void main(String[] args) {
        // Main method mein bas call karo aur handle karo
        try {
            accessArray(); // Method call kiya
        } 
        catch (MyException2 e) {
            // Agar method ne error feka, toh yahan pakda jayega
            System.out.println("\n" + e); 
            // Output: MyException: Max Retries Exceeded...
        }
    }
}