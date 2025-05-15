
//space Complexity for this code is O(1)
public class MaxSubArrayNegativeOnly1 {

    public static int maxSubArray(int[] nums) {
        // Initialize maxSum and currentSum to the first element
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentSum to be the maximum of the current element and the sum of currentSum and the current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] numbers = {-8, -3, -6, -2, -5, -4};
        int result = maxSubArray(numbers);
        System.out.println("Maximum Subarray Sum is: " + result);
    }
}
