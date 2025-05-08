// Given an array of integers arr[] and a target value T, find the first index i such that arr[i] >= T. If no such element exists, return -1.
public class Ques {
    public static int findFirstIndex(int arr[], int target) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= target) {
                return i; // Return the first index where arr[i] >= target
            }
        }
        return -1; // If no such element exists, return -1
    }
    public static void main(String[] args) {
        // int arr[] = {3, 5, 2, 8, 6};
        int arr[] = {1, 2, 3};
        // int target = 6;
        int target = 5;

        int result = findFirstIndex(arr, target);
        if (result == -1) {
            System.out.println("No such element exists.");
        } else {
            System.out.println("First index where arr[i] >= " + target + " is: " + result);
        }
    }
}
