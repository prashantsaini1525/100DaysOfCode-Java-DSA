//time Complexity for this code is O(logn)
//space Complexity for this code is O(1)

public class Ques_1_LocateElement {
    public static int getlocateelement(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid =(start + (start + end) / 2) ;
            
            //comparisons
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // if key is not found in the array.
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int target = 5;

        int result = getlocateelement(arr, target);
        System.out.println("Index for target is : " + result);
    }
}
