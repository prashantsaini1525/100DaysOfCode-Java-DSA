
public class code {

    public static void main(String[] args) {
        // char ch = 'A';
        char ch = 'Z';
        // char ch = 'a';
        // char ch = 'z';
        // char ch = '0';
        // char ch = '$';

        if (ch >= 'A' && ch <= 'Z') {
            // Uppercase to Lowercase
            char ans = (char) (ch | ' ');
            System.out.println("Lowercase: " + ans);
        } else if (ch >= 'a' && ch <= 'z') {
            // Lowercase to Uppercase
            char ans = (char) (ch & '_');
            System.out.println("Uppercase: " + ans);
        } else {
            System.out.println("Invalid Input");
        }

    }
}
