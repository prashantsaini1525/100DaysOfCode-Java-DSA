
import java.util.Scanner;

public class TwoDArrayCreation {

    public static void main(String[] args) {
        int matrix[][] = new int[3][3]; // Declare a 2D array with 3 rows and 3 columns
        int n = matrix.length;          // Number of rows
        int m = matrix[0].length;       // Number of columns

        Scanner sc = new Scanner(System.in);
        // 1) Input elements into the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // 2) Print the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 3) Initialize max and min to the first element
        int max = matrix[0][0];
        int min = matrix[0][0];

        // 4) Traverse the grid once to update max and min
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int current = matrix[i][j];
                if (current > max) {
                    max = current;  // Found a new high!
                }
                if (current < min) {
                    min = current;  // Found a new low!
                }
            }
        }

        // 5) Report results
        System.out.println("Scan complete!");
        System.out.println("Largest element in the 2D array: " + max);
        System.out.println("Smallest element in the 2D array: " + min);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
