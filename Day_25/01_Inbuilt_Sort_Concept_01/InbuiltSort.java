// Inbuilt Sort

import java.util.Arrays;

public class InbuiltSort {

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2}; //primitive array
        Arrays.sort(arr); // Inbuilt sort function
        printArr(arr);
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
