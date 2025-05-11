// Time Complexity: O(n^3)
// Space Complexity: O(1)
// In this Code we are printing all the subarrays of an array but with single element. 
// We also print the total number of subarrays printed.
public class SubArrayConcept1 {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for(int i = 0; i < numbers.length; i++) {
            // int start = i;
            for(int j = i; j < numbers.length; j++) {
                // int end = j;
                for(int k = i; k <= j; k++) { //print
                    System.out.print(numbers[k] + " "); //subarrays
                }
                ts++; //total subarrays printed
                System.out.println();
            }
            System.out.println("-------------------");
        }
        System.out.println("Total subarrays printed: " + ts); //total subarrays printed: 15
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
