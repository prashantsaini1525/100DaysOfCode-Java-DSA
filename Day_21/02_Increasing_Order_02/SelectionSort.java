// Selection Sort
// Time Complexity: O(n^2) || Space Complexity: O(1))
// Selection Sort is a simple sorting algorithm that divides the input list into two parts: a sorted part and an unsorted part.
// It repeatedly selects the smallest (or largest) element from the unsorted part and moves it to the end of the sorted part.

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        int swap = 0; // Initialize swap counter
        // n times
        for (int i = 0; i < arr.length - 1; i++) {
            // assume the first element is the minimum
            // and store its index
            int minPos = i;
            // find the minimum element in the unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    // update the minimum position
                    // if the current element is smaller than the minimum
                    minPos = j;
                }
            }
            // swap the minimum element with the first element of the unsorted array
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            swap++; // increment swap counter
        }
        System.out.println("Number of swaps: " + swap);
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
        selectionSort(arr);
        printArr(arr);
    }
}
