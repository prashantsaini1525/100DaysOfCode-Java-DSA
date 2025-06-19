
public class TransposeMatrix {

    public static void printMatrix(int matrix[][]) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each row of the matrix
            for (int j = 0; j < matrix[0].length; j++) {
                // Print each element of the matrix
                System.out.print(matrix[i][j] + " ");
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 2, column = 3; // Define the number of rows and columns
        // Example matrix to test the transpose function
        int matrix[][] = {
            {2, 3, 7},
            {5, 6, 7}
        };

        // Display Original Matrix
        printMatrix(matrix);

        // Transpose the matrix
        int transpose[][] = new int[column][row]; // Create a new matrix for the transpose
        for (int i = 0; i < row; i++) {
            // Loop through each element of the matrix
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // Print the transposed matrix
        printMatrix(transpose); // Call the function to print the transposed matrix
    }
}
