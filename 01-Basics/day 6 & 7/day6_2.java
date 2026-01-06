import java.util.Scanner;

public class day6_2{
    public static void main(String[] args) {
        
        int[] arr = {90, 85, 40, 61, 56, 8, 9};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer to find: ");
        int numberToFind = sc.nextInt();

        // Step 1: Create a flag variable, assume the number is not found
        boolean isFound = false;

        // Loop through each element
        for (int element : arr) {
            // If the element matches, update the flag and stop the loop
            if (element == numberToFind) {
                isFound = true;
                break; 
            }
        }

        // Step 3: AFTER the loop, check the flag's final value
        if (isFound) {
            System.out.println("Yes, the number " + numberToFind + " is present in the array.");
        } else {
            System.out.println("No, the number " + numberToFind + " is not present in the array.");
        }
        
        sc.close();
    }
}