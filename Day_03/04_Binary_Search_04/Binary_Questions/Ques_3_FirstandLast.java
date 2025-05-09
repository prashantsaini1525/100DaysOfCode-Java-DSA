//time Complexity for this code is O(logn)
//space Complexity for this code is O(1)

public class Ques_3_FirstandLast {
    public static int[] searchRange(int arr[], int target) {
        int result [] = {-1, -1};
        
        //find first occurence
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                result[0] = mid;
                end = mid - 1; // search in left half
            } else if (arr[mid] < target) {
                start = mid + 1; // search in right half
            } else {
                end = mid - 1; // search in left half
            }
        }

        // find last occurrence
        start = 0;
        end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;  // overflow-safe
            if(arr[mid] == target) {
                result[1] = mid;
                start = mid + 1; // search in right half
            } else if(arr[mid] < target) {
                start = mid + 1; // search in right half
            } else {
                end = mid - 1; // search in left half
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        int finalresult [] = searchRange(arr, target);
        System.out.println("First Occurrence: " + finalresult[0] + ", Last Occurrence: " + finalresult[1]);
    }
}
