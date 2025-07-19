// Question 1 : Count how many times lowercase vowels occurred in a String entered by the user.

// Time Complexity: O(n), where n is the length of the input string.
// Space Complexity: O(1), as we are using a constant amount of space for the
import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();    // read the whole line

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // check if ch is one of the lowercase vowels
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of lowercase vowels: " + count);
        sc.close();
    }
}
