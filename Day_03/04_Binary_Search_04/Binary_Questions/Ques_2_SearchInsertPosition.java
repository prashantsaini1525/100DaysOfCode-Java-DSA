//time Complexity for this code is O(logn)
//space Complexity for this code is O(1)
public class Ques_2_SearchInsertPosition {
    public static int searchelement(int arr[], int target) {
        int start = 0; 
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2); // to avoid overflow

            //comparisons
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start; // if key is not found in the array.
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        int target = 2;
        int result = searchelement(arr, target);
        System.out.println("Index for target is : " + result);
    }
}
