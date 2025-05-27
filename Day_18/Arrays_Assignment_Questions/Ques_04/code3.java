// Approach: Dynamic Programming using Auxiliary Arrays
// Time Complexity: O(n) || Space Complexity: O(n)
// DSA Sheet#11
// Leetcode #42 Trapping Rain Water
// This approach uses two auxiliary arrays to store the maximum height of the bars to the left and right of each index.

public class code3 {

    public static int trap(int[] height) {
        int n = height.length;

        // calculate the left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate the right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        code3 obj = new code3();
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(obj.trap(height)); // Output: 6
    }
}
