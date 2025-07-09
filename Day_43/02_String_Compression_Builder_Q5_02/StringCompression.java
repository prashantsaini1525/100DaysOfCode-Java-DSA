// Time complexity: O(n), where n is the length of the string 
// Space complexity: O(n) for the StringBuilder used to build the compressed string

public class StringCompression {

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) { // Outer loop to iterate through the string
            int count = 1; // Initialize count for the current character

            // Inner loop to count occurrences of the current character
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++; // Increment count if the next character is the same
                i++; // Move to the next character
            }

            sb.append(str.charAt(i)); // Append the current character to the StringBuilder

            if (count > 1) {
                sb.append(count); // Append the count if greater than 1
            }
        }

        return sb.toString(); // Convert StringBuilder to String and return it.
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + compress(str));

        String str2 = "abcd";
        System.out.println("Original String: " + str2);
        System.out.println("Compressed String: " + compress(str2));
    }
}
