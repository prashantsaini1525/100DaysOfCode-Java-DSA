// Selection Sort
// Time Complexity: O(n^2) || Space Complexity: O(1)
// Selection Sort is a simple sorting algorithm that divides the input list into two parts: a sorted part and an unsorted part.
// It repeatedly selects the smallest element from the unsorted part and moves it to the end of the sorted part.

public class SelectionSort1 {

    // variable to count number of swaps
    static int swapCount = 0;

    public static int selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            // find the index of the smallest element in arr[i+1..n-1]
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            // if we found a new minimum, swap it into position i
            if (minPos != i) {
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
                swapCount++;
            }
        }
        return swapCount;
    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        int swaps = selectionSort(arr);
        printArr(arr);
        System.out.println("Number of swaps: " + swaps);
    }
}
