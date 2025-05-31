// Selection Sort
// Time Complexity: O(n^2) || Space Complexity: O(1)
// Selection Sort is a simple sorting algorithm that divides the input list into two parts: a sorted part and an unsorted part.
// It repeatedly selects the smallest element from the unsorted part and moves it to the end of the sorted part.

public class SelectionSort {

    public static int selectionSort(int arr[]) {
        int n = arr.length;
        int swap = 0;

        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap the minimum element with the first element of the unsorted array
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            swap++; // increment swap counter
        }
        return swap; // return the number of swaps
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        int swap = selectionSort(arr);
        printArr(arr);
        System.out.println("Number of swaps: " + swap);
    }
}
