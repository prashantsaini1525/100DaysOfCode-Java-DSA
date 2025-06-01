// insertion Sort
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time.
// It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

public class InsertionSort {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            //finding out the correct position for the current element
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1] = curr;
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
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
}
