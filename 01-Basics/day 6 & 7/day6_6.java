public class day6_6 {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 90, 60};
        int min = arr[0];
        for (int element : arr) {
             // Step 3: Compare and update if a larger element is found
            if (element < min) {
                min = element;
            }
        }
        System.out.println("The maximum element in the array is: " + min);
 }
}

