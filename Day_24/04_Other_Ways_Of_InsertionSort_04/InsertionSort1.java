
public class InsertionSort1 {

    // variable to count number of swaps
    static int swapCount = 0;
    // Change return type from void → int so we can return swap count

    public static int insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // finding out the correct position for the current element
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                swapCount++;  // Increment swap counter for each shift
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
        return swapCount;  // now valid, since method returns int
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
        int swapCount = insertionSort(arr);  // single call, captures the count
        printArr(arr);
        System.out.println("Number of swaps: " + swapCount);
    }
}
