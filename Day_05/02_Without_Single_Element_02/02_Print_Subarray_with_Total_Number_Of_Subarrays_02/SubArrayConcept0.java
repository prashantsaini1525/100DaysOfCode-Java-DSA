// Time Complexity: O(n^3)
// Space Complexity: O(1)
// when we are printing the subarrays we are not printing the single element.
// By starting the middle loop (j) from i + 1, you ensure that each subarray contains at least two elements.
// We also print the total number of subarrays printed.

public class SubArrayConcept0 {

    public static void printsubarrays(int numbers[]) {
        int ts = 0; //total subarrays
        
        for (int i = 0; i < numbers.length; i++) {
            int start = i; //start index
            for (int j = i + 1; j < numbers.length; j++) {
                int end = j; //end index
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " "); //subarrays
                }
                ts++; //total subarrays printed
                System.out.println();
            }
            if (i < numbers.length - 1) {
                System.out.println("-------------------"); // Separator after each iteration of the outer loop, except the last one
            }
        }
        System.out.println("Total subarrays printed: " + ts); //total subarrays printed: 15
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printsubarrays(numbers);
    }

}
