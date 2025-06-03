// Inbuilt Sort
// Time Complexity: O(n log n)
// Space Complexity: O(1) for primitive types, O(n) for object types

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void main(String[] args) {
        // int arr[] = {5, 4, 1, 3, 2};
        Integer arr[] = {5, 4, 1, 3, 2}; // Using Integer instead of int for Collections.reverseOrder() because it requires objects
        Arrays.sort(arr, Collections.reverseOrder()); // Inbuilt sort function
        printArr(arr);
    }

    // Function to print the array
    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
