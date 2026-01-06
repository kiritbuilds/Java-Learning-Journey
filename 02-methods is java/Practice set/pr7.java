public class pr7 {

    static void pattern_reverse(int n) {
        // Base Case: Stop when n is 0 or less
        if (n > 0) {
            
            // 1. Work First: Print 'n' stars in a line
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
            
            // 2. Recurse After: Call the function for the next smaller case
            pattern_reverse(n - 1);
        }
    }

    public static void main(String[] args) {
        // Calling with 4, as in your notes
        pattern_reverse(4);
    }
}