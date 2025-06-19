
public class TransposeMatrix2 {

    // Utility to print only the rows of a 2D int matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = {
            {2, 3, 7},
            {5, 6, 7}
        };

        // 1) Print original matrix
        System.out.println("Original matrix:");
        printMatrix(matrix);

        // 2) Build its transpose [column][row]
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // 3) Print a blank line, then a new header
        System.out.println();
        System.out.println("Transposed matrix:");
        printMatrix(transpose);
    }
}
