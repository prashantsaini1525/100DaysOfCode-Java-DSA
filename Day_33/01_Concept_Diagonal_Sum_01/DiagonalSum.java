// DiagonalSum.java
// Time Complexity: O(n) || Space Complexity: O(1)

public class DiagonalSum {

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length; // Assuming a square matrix
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += matrix[i][j]; // Primary diagonal
                } else if (i + j == n - 1) {
                    sum += matrix[i][j]; // Secondary diagonal
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { //n=3
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // int matrix[][] = { //n=4
        //         { 1, 2, 3, 4 },
        //         { 5, 6, 7, 8 },
        //         { 9, 10, 11, 12 },
        //         { 13, 14, 15, 16 }
        // };
        System.out.println("Diagonal Sum: " + diagonalSum(matrix));
    }

}
