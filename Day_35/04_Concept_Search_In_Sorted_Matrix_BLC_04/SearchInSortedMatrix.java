// Staircase Search in a Sorted Matrix
// The function should return true if the key is found, and false otherwise.
// Time Complexity: O(n + m), where n is the number of rows and m is the number of columns. || Space Complexity: O(1)
// Start From the bottom-left corner of the matrix and move up if the current element is greater than the key, or right if it is less than the key.

public class SearchInSortedMatrix {

    public static boolean searchInSortedMatrix(int matrix[][], int key) {
        int row = matrix.length - 1; // Start from the bottom-left corner
        int col = 0; // Start from the bottom-left corner

        while (row >= 0 && col < matrix[0].length) {
            // Check if the current element matches the key
            if (matrix[row][col] == key) {
                System.out.println("Key found at: (" + row + ", " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--; // Move up if the current element is greater than the key
            } else {
                col++; // Move right if the current element is less than the key
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
