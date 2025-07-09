//Time Complexity: O(n) || Space Complexity: O(n)

public class StringCompression {

    public static String compress(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
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
