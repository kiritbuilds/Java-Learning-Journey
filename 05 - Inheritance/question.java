import java.util.*;

public class question{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // 1. Read 't', the total number of queries
        int t = in.nextInt();
        
        // 2. Start the outer loop to run 't' times
        for (int i = 0; i < t; i++) {
            
            // 3. Read a, b, and n for the current query
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            // 4. Initialize the current sum with the 'a' value
            int current_sum = a;
            
            // 5. Start the inner loop to print 'n' terms
            for (int j = 0; j < n; j++) {
                
                // 6. Calculate the term to add: (2^j * b)
                int term = (int)Math.pow(2, j) * b;
                
                // 7. Add this term to the current sum
                current_sum = current_sum + term;
                
                // 8. Print the sum followed by a space
                System.out.print(current_sum + " ");
            }
            
            // 9. After the inner loop, print a new line
            System.out.println();
        }
        
        // 10. Close the scanner after all queries are done
        in.close();
    }
}