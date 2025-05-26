// Approach 3
// Approach: HashSet for Efficient Duplicate Detection
// Time Complexity: O(n)  ||  Space Complexity: O(n)

import java.util.HashSet;

public class code3 {

    public static boolean containsDuplicate(int nums[]) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in the set, return true
            if (set.contains(nums[i])) {
                return true;
            }
            // Otherwise, add the element to the set
            set.add(nums[i]);
        }
        // If no duplicates were found, return false
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
