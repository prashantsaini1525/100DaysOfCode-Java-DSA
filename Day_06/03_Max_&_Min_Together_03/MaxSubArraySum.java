//time Complexity for this code is O(n^3)
//space Complexity for this code is O(1)

public class MaxSubArraySum {

    public static void maxSubArraySum(int numbers[]) {
        int ts = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; //- infinity
        int minSum = Integer.MAX_VALUE; //+ infinity

        for (int i = 0; i < numbers.length; i++) { //outer loop for each number
            for (int j = i; j < numbers.length; j++) { //print //inner
                currSum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + (k == j ? "" : ", "));//subarrays

                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.println("] -> Sum: " + currSum); // Print subarray and its sum
                //update maxSum if current sum is greater
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                if (minSum > currSum) {
                    minSum = currSum;
                }
                ts++; //total subarrays printed
            }
            System.out.println("-------------------");
        }
        System.out.println("Max Sum : " + maxSum);
        System.out.println("Min Sum : " + minSum);
        // Print the total number of subarrays and max sum
        System.out.print("Total subarrays printed: " + ts); //total subarrays printed: 15
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubArraySum(numbers);
    }
}
