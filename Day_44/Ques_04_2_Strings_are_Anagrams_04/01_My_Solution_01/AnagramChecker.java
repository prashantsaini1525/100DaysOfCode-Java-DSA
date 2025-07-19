// Question 2 : Determine if 2 Strings are anagrams of each other?

// What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed into a study, or care’s characters can be formed into race. Below is a java program to check if two strings are anagrams or not.
import java.util.Arrays;

public class AnagramChecker {

    // Returns true if s1 and s2 are anagrams (i.e. same letters in a different order).
    public static boolean isAnagram(String s1, String s2) {
        // Quick length check
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert to char arrays
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Compare sorted versions
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? "
                + isAnagram(str1, str2));

        // Another test
        String s3 = "hello";
        String s4 = "bello";
        System.out.println("Are \"" + s3 + "\" and \"" + s4 + "\" anagrams? "
                + isAnagram(s3, s4));
    }
}
