
public class Strings2 {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " "); // " " is used to separate characters
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "12345"; // Example with numbers
        String lastName = "67890";

        String fullName = firstName + " " + lastName; // Concatenation using + operator

        printLetters(fullName);
    }
}
