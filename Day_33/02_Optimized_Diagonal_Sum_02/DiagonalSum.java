// Time Complexity: O(n) || Space Complexity: O(1)
// Optimized Diagonal Sum in a Square Matrix

public class DiagonalSum {

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length; // Assuming a square matrix
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += matrix[i][i]; // Primary diagonal
            // Add secondary diagonal element
            if (i != n - 1 - i) { // Avoid double counting the center element in odd-sized matrices
                sum += matrix[i][n - 1 - i]; // Secondary diagonal
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { // n=3
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // int matrix[][] = { //n=4
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 }
        // };
        System.out.println("Diagonal Sum: " + diagonalSum(matrix));
    }

}
