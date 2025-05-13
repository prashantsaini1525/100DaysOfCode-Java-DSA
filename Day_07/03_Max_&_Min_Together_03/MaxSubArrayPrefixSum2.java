//time Complexity for this code is O(n^2)
//space Complexity for this code is O(n)
public class MaxSubArrayPrefixSum2 {
    public static void maxSubarraySum(int numbers[]) {
        int ts = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; //- infinity
        int minSum = Integer.MAX_VALUE; //+ infinity
        int prefix[] = new int[numbers.length];
        
        prefix[0] = numbers[0];
        //calculate the prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length; j++) {
                // currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1]; //1st method
                currSum = i > 0 ? prefix[j] - prefix[i-1] : prefix[j]; //2nd method
                ts++; //total subarrays printed
                maxSum = Math.max(maxSum, currSum); //2nd method
                minSum = Math.min(minSum, currSum); //2nd method 
            }
        }
        System.out.println("Max Sum : " + maxSum);
        System.out.println("Min Sum : " + minSum);
        System.out.print("Total subarrays printed: " + ts);
    }
    public static void main(String[] args) {
        // int numbers[] = {1, -2, 6, -1, 3};
        int numbers[] = {1, -2};
        maxSubarraySum(numbers);
    }
}
