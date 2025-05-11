// Time Complexity: O(n^3)
// Space Complexity: O(1)
// In this Code we are printing all the subarrays of an array also with single element.
public class SubArrayConcept0 {

    public static void printSubarrays(int numbers[]) {
        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                for(int k = start; k <= end; k++) { //print
                    System.out.print(numbers[k] + " "); //subarrays
                }
                System.out.println();
            }
            System.out.println("-------------------");
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
