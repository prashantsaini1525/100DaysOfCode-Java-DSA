
public class Strings {

    public static void main(String[] args) {
        String firstName = "Prashant";
        String lastName = "Saini";

        String fullName = firstName + " " + lastName; // Concatenation using + operator

        // Alternatively, you can use String.c oncat() method
        // String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.charAt(0)); // Output: Prashant Saini
    }
}
