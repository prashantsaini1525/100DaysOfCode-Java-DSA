// Given an integer array nums, return true if any value appears at least twice in the
// Approach 1 : O(n^2) time complexity
// and O(1) space complexity
// if an element repeated more than twice return true otherwise return false if every element is distinct.
// Apna college Question 1
// DSA Sheet#4

public class code1 {

    public static boolean containsDuplicate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] nums = {1, 2, 3, 1}; // --> true
        // int[] nums = {1, 2, 3, 4}; // --> false
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // --> false
        System.out.println(containsDuplicate(nums));
    }
}
