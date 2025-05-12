//time Complexity for this code is O(n^3)
//space Complexity for this code is O(1)

public class MinSubArraySum {

    public static void minSubArraySum(int numbers[]) {
        int currSum = 0;
        int minSum = Integer.MAX_VALUE; //+infinity

        for (int i = 0; i < numbers.length; i++) { //outer loop for each number
            for (int j = i; j < numbers.length; j++) { //inner loop for each number
                currSum = 0;
                for (int k = i; k <= j; k++) { //inner loop for print subarray values

                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                //update maxSum if current sum is greater
                if (minSum > currSum) {
                    minSum = currSum;
                }
            }
            System.out.println("-------------------");
        }
        //print the max subarray sum
        System.out.println("Min Sum : " + minSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        minSubArraySum(numbers);
    }
}
