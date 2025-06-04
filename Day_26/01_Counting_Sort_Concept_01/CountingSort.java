//Counting Sort Algorithm in Java
// Counting Sort is a non-comparison based sorting algorithm that is efficient for sorting integers within a known range.
// It works by counting the occurrences of each unique element and then calculating their positions in the sorted array.
// Time Complexity: O(n + k) where n is the number of elements in the input array and k is the range of the input values.
// Space Complexity: O(k) where k is the range of the input values.

public class CountingSort {

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // Find the largest element in the array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create a count array of size largest + 1
        int count[] = new int[largest + 1];
        // Count the occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Update the original array with sorted elements
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7}; // Example array
        countingSort(arr);
        printArr(arr);
    }
}
