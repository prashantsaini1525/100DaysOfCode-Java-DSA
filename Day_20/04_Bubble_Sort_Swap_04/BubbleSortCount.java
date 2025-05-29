// Bubble Sort with Swap Count
// This program implements the bubble sort algorithm and counts the number of swaps made during the sorting process.
// It prints the sorted array and the total number of swaps.
// Time Complexity: O(n^2) || Space Complexity: O(1)

public class BubbleSortCount {

    public static void bubbleSort(int arr[]) {

        //n times
        int swap = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // n - 1 - turn times
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                // compare
                // if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
        }
        System.out.println("Number of swaps: " + swap);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArr(arr);
    }
}
