
public class TransposeMatrix1 {

    public static void printTranspose(int matrix[][]) {
        int rows = matrix.length; // Get the number of rows
        int cols = matrix[0].length; // Get the number of columns
        int transpose[][] = new int[cols][rows]; // Create a new matrix for the transpose

        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            // Loop through each element of the matrix
            for (int j = 0; j < cols; j++) {
                // Assign the transposed value
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of the matrix:");
        // Print the transposed matrix
        for (int i = 0; i < cols; i++) {
            // Loop through each row of the transposed matrix
            for (int j = 0; j < rows; j++) {
                // Print each element of the transposed matrix
                System.out.print(transpose[i][j] + " ");
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example matrix to test the transpose function
        int matrix[][] = {
            {2, 3, 7},
            {5, 6, 7}
        };
        System.out.println("Original matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        printTranspose(matrix);
    }
}
