import java.util.Scanner;
public class day2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  System.out.println("--- Vowel or Consonant Checker ---");
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Yes It Is Vowels " + ch);
            }  else{
                System.out.println("It is Not a Vowel It is Consonent" + ch);
            }
            sc.close();
   }
}
