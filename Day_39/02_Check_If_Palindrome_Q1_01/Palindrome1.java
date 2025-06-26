//Time Complexity: O(n) || Space Complexity: O(1)
// This code checks if a given string is a palindrome. 
// A palindrome is a string that reads the same backward as forward.

public class Palindrome1 {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length(); // Get the length of the string
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // If characters at the current position and its corresponding position from the end are not equal
                //not a palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        // String str = "hello";
        // String str = "madam";

        boolean result = isPalindrome(str);
        if (result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
