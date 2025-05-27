// Approach: Two-Pointer Technique
// Time Complexity: O(n) || Space Complexity: O(1)
//apna colllege Question 3
// DSA Sheet#11
// Leetcode #42 Trapping Rain Water

public class code2 {

    public static int trap(int height[]) {
        int n = height.length;
        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];
        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height)); // Output: 6
    }
}
