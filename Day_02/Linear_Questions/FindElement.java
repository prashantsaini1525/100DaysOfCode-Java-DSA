public class FindElement {

    public static int linearSearch(int arr[], int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;  // Element not found in array
    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int key = 11;

        int index = linearSearch(arr, key);
        if(index == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
