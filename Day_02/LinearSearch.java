// time complexity: O(n)
public class LinearSearch {
    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i <numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1; // if key is not found in the array.
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 14;

        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
    
}
