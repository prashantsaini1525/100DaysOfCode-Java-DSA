//time Complexity for this code is O(n^2)
//space Complexity for this code is O(1)

public class MaxSubArrayPrefixSum1 {

    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate the prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i; //start index
            for (int j = i; j < numbers.length; j++) {
                int end = j; //end index
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; //1st method
                if (maxSum < currSum) { //1st method
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }
}
