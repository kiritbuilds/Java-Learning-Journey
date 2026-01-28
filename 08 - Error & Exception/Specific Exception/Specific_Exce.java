import java.util.Scanner;

public class Specific_Exce {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Index ");
        int ind = sc.nextInt();

        System.out.println("Enter The Number You Want to divide the value with ");
        int number = sc.nextInt();

        try {
            System.out.println("The Value at array index entered is: " + marks[ind]);
            System.out.println("The Value of Array-Value/number is: " + marks[ind]/number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticExeption Occured! ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured! ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some Other Exception Occured! ");
            System.out.println(e);
        }
    }
}
