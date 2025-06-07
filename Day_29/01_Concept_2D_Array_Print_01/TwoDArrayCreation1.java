
import java.util.Scanner;

public class TwoDArrayCreation1 {

    public static void main(String[] args) {
        int matrix[][] = new int[3][3]; // Declare a 2D array with 3 rows and 3 columns
        // int n = 3, m = 3; // Dimensions of the matrix
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        Scanner sc = new Scanner(System.in);
        // Input elements into the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
