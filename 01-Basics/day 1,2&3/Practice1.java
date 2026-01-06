import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Enter");
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       System.out.println("Have a "+ name + " good day");
       sc.close();
    }
}
