import java.util.Arrays;

public class day6_5 {
    public static void main(String[] args) {        
        int[] arr = {10, 20, 30, 40, 50};
        
        // --- The Reversing Logic ---
        int start = 0;
        int end = arr.length - 1;
        int temp; // A temporary variable for swapping

        while (start < end) {
            // Swap the elements
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move the pointers
            start++;
            end--;
        }
        
        // Print the reversed array to see the result
        System.out.println("The reversed array is: ");
        // Arrays.toString() is a handy way to print an array
        System.out.println(Arrays.toString(arr));
    }
}