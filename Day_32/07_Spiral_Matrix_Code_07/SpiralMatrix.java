//time complexity: O(n*m) where n is the number of rows and m is the number of columns
//space complexity: O(1) as we are using only a constant amount of space

public class SpiralMatrix {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Print the first row or top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Print the last column or right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Print the last row or bottom row
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) { // Avoid printing the same row again
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // Print the first column or left column
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) { // Avoid printing the same column again
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            // Move to the next layer
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printSpiral(matrix);
    }
}
