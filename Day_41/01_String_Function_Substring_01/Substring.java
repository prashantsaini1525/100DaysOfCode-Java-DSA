
public class Substring {

    public static String subString(String str, int si, int ei) {
        String substr = "";

        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String: " + str);
        System.out.println("Substring from index 0 to 5: " + subString(str, 0, 5));
    }
}
