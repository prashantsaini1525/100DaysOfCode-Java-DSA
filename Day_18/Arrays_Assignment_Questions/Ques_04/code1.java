// Approach: Two-Pointer Technique
// Time Complexity: O(n) || Space Complexity: O(1)
//DSA Sheet#11
// Leetcode #42 Trapping Rain Water

public class code1 {

    public static int trap(int height[]) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while (leftPointer < rightPointer) {
            if (height[leftPointer] < height[rightPointer]) {
                if (height[leftPointer] >= leftMax) {
                    leftMax = height[leftPointer];
                } else {
                    trappedWater += leftMax - height[leftPointer];
                }
                leftPointer++;
            } else {
                if (height[rightPointer] >= rightMax) {
                    rightMax = height[rightPointer];
                } else {
                    trappedWater += rightMax - height[rightPointer];
                }
                rightPointer--;
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height)); // Output: 6
    }
}
