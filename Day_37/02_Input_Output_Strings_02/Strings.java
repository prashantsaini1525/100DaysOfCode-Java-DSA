//Input Output Concepts of Java Strings

import java.util.Scanner;

public class Strings {

    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        String str = "abcde";
        String str2 = new String("xyz");

        //Strings are immutable.
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next(); // Reads a single word input

        // If you want to read a line including spaces, use sc.nextLine() instead.
        System.out.println(name);
    }
}
