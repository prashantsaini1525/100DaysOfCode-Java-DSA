// StringBuilder is a mutable sequence of characters, which means it can be modified after creation. It is used to create strings that can be modified without creating new string objects, which is more efficient for concatenation operations.
// Time Complexity: O(n) for appending characters, where n is the number of characters being appended. 
// Space Complexity: O(n) for storing the characters in the StringBuilder object.

public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        } //abcdefghijklmnopqrstuvwxyz  time complexity: O(26)
        //if we take only strings, it will create a new string object for each append operation, leading to O(n^2) time complexity. 
        // O(26 * n^2) ~ O(n^2) time complexity
        System.out.println(sb); // Output: abcdefghijklmnopqrstuvwxyz
        System.out.println(sb.length()); // Output: 26
        System.out.println(sb.charAt(0)); // Output: a
        System.out.println(sb.charAt(25)); // Output: z
        System.out.println(sb.indexOf("a")); // Output: 0
        System.out.println(sb.indexOf("z")); // Output: 25
    }
}
