// This code finds the largest string in an array of strings using the compareTo method.
// The compareTo method compares two strings lexicographically and returns a positive integer if the first string is greater than the second.
// If the first string is less than the second, it returns a negative integer, and if they are equal, it returns zero.
// The code iterates through the array of strings, comparing each string with the current largest string found, and updates the largest string accordingly.
// Finally, it prints the largest string found in the array.
// Time complexity is O(n) where n is the number of strings in the array, and space complexity is O(1) since we are using a constant amount of space for the largest string variable.

public class StringCompareTo {

    public static void main(String[] args) {
        String fruits[] = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("The largest string in the array is: " + largest);
        // Output: The largest string in the array is: Elderberry
    }
}
