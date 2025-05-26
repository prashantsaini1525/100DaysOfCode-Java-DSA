// Approach: Sort and Scan for Adjacent Duplicates
// Time Complexity: O(n log n)  ||  Space Complexity: O(1) (assuming in-place sort)

import java.util.Arrays;

public class code2 {

    public static boolean containsDuplicate(int nums[]) {
        // Sort the array
        Arrays.sort(nums);
        // Check for duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] nums = {1, 2, 3, 1}; // --> true
        // int[] nums = {1, 2, 3, 4}; // --> false
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}; // --> true
        System.out.println(containsDuplicate(nums));
    }
}
