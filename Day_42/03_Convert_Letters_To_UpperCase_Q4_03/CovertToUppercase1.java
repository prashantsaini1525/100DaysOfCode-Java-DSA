// time complexity: O(n) || space complexity: O(n)

public class CovertToUppercase1 {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == ' ') {
                sb.append(ch);
                i++;
                if (i < str.length()) {
                    ch = Character.toUpperCase(str.charAt(i));
                }
            } else {
                ch = Character.toLowerCase(ch);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am prashant saini";
        System.out.println(toUpperCase(str));

        // Test with another string
        String str2 = "hi, i am prashant saini";
        String result = toUpperCase(str2);
        System.out.println(result);
    }
}
