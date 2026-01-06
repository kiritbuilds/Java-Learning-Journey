public class Day6_4_Correct {
    public static void main(String[] args) {

        // First Matrix
        int[][] matrix1 = {{100, 10, 1}, 
                           {90, 87, 58}};

        // Second Matrix
        int[][] matrix2 = {{50, 20, 9}, 
                           {10, 13, 42}};

        // Result matrix to store the sum
        int[][] result = new int[2][3];

        // --- Logic to Add Matrices ---
        // Outer loop for rows
        for (int i = 0; i < 2; i++) {
            // Inner loop for columns
            for (int j = 0; j < 3; j++) {
                // Add corresponding elements
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // --- Logic to Print the Result Matrix ---
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}