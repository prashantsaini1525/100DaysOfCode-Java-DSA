// Staircase Search in a Sorted Matrix
// The function should return true if the key is found, and false otherwise.
// Time Complexity: O(n + m), where n is the number of rows and m is the number of columns. || Space Complexity: O(1)
// Start From the top-right corner of the matrix and move left if the current element is greater than the key, or down if it is less than the key.

public class SearchInSortedMatrix {

    public static boolean searchInSortedMatrix(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at: (" + row + ", " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 50;
        searchInSortedMatrix(matrix, key);
    }
}
