
public class Strings1 {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "Prashant";
        String lastName = "Saini";

        String fullName = firstName + " " + lastName; // Concatenation using + operator

        printLetters(fullName);
    }
}
