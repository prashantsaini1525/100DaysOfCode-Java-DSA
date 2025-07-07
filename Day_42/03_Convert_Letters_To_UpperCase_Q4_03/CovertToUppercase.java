// time complexity: O(n) || space complexity: O(n)

public class CovertToUppercase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            // ch = str.charAt(i);
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am prashant saini";
        System.out.println(toUpperCase(str));

        // Test with another string
        String str2 = "hello world";
        String result = toUpperCase(str2);
        System.out.println(result);
    }
}
