import java.util.Scanner;
public class day4_3 {
    public static void main(String[] args) {
        System.out.println("Enter Words:");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".com")){
            System.out.println("It is a commercial Website");
        }else if(website.endsWith(".in")){
            System.out.println("It Is a Indian Website");
        }else if(website.endsWith(".org")){
            System.out.println("It is a Organization Website");
        }else{
            System.out.println("Another Website");
        }
        sc.close();

    }
    
}
