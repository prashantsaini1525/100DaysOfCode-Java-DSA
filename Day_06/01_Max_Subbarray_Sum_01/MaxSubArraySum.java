//time Complexity for this code is O(n^3)
//space Complexity for this code is O(1)

public class MaxSubArraySum {

    public static void maxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; //+infinity

        for (int i = 0; i < numbers.length; i++) { //outer loop for each number
            for (int j = i; j < numbers.length; j++) { //inner loop for each number
                currSum = 0;
                for (int k = i; k <= j; k++) { //inner loop for print subarray values

                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                //update maxSum if current sum is greater
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println("-------------------");
        }
        //print the max subarray sum
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubArraySum(numbers);
    }
}
