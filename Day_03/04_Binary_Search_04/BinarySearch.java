//time Complexity for this code is O(logn)
//space Complexity for this code is O(1)

public class BinarySearch {

    public static int binarySearch(int numbers[], int key){
        int start = 0, 
        end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // if key is not found in the array.
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,};
        int key = 10;
        // int key = 2;
        // int key = 25;
        
        int result = binarySearch(numbers, key);
        System.out.println("Index for key is : " + result);
    }
}
