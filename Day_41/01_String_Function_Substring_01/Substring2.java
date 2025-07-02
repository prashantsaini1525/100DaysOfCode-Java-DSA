
public class Substring2 {

    public static String subString(String str, int start, int end) {
        // Check if the start and end indices are valid
        if (start < 0 || end > str.length() || start >= end) {
            return "Invalid indices";
        }
        // Extract the substring from start to end
        return str.substring(start, end);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String: " + str);
        // Using the custom subString method
        System.out.println("Substring from index 0 to 5: " + subString(str, 0, 5));
        System.out.println("Substring from index 6 to 11: " + subString(str, 6, 11));
        System.out.println("Substring from index 0 to 11: " + subString(str, 0, 11));

        // Using the built-in substring method
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));
        System.out.println("Substring from index 6 to 11: " + str.substring(6, 11));
        System.out.println("Substring from index 0 to 11: " + str.substring(0, 11));
    }
}
