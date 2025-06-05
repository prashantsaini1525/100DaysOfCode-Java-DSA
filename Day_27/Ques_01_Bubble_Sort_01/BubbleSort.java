// Bubble Sort
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int swap = 0; // variable to count the number of swaps

        //n times
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // n - 1 - turn times
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                // compare
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++; // increment the swap count
                }
            }
        }
        System.out.println("Total number of swaps: " + swap);
    }

    public static void printArr(int arr[]) {
        // print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // create an array
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArr(arr);
        // System.out.println(Arrays.toString(arr));
    }
}
