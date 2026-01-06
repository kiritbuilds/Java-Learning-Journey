// import java.util.Arrays;

public class IsArraySorted {

    public static void main(String[] args) {

        // You can change this array to test different cases
        int[] arr = {10, 20, 90, 40, 50}; 

        // Step 1: Assume the array is sorted
        boolean isSorted = true;

        // Step 2: Loop from the first to the second-to-last element
        for (int i = 0; i < arr.length - 1; i++) {
            
            // Step 3: Check if the current element is bigger than the next one
            if (arr[i] > arr[i+1]) {
                // Step 4: If we find a mistake, update the flag and stop the loop
                isSorted = false;
                break;
            }
        }

        // System.out.println("Checking array: " + Arrays.toString(arr));
        
        // Step 5: Check the final value of the flag and print the result
        if (isSorted) {
            System.out.println("Result: The array is sorted.");
        } else {
            System.out.println("Result: The array is NOT sorted.");
        }
    }
}