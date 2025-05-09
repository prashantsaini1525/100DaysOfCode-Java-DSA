public class SmallestNumber {
    public static int getsmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i = 0; i < numbers.length; i++) {
            if(smallest > numbers[i]) { 
            smallest = numbers[i];
            }
        }
        return smallest;  // Return the smallest number in the array.  // O(n) time complexity.  // O(1) space complexity.  // In-place algorithm.  // No additional data structures are used.  // The algorithm can be used to find the largest number as well.  // The algorithm can be used to find the sum of all numbers in the array.  // The algorithm can be used to find the product of all numbers in the array.
    }
    public static void main(String[] args) {
        int numbers[] = {8, 2, 3, 4, 5, 7, 1};
        System.out.println("Smallest Value is : " + getsmallest(numbers));
    }
    
}
