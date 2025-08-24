
public class GetBit1 {

    public static int getIthBit(int n, int i) {
        // Create a mask by left shifting 1 by i positions
        int mask = 1 << i;

        // Use bitwise AND to isolate the ith bit
        int ithBit = n & mask;

        // Shift the result right by i positions to get the bit value (0 or 1)
        return ithBit >> i;
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int i = 2; // We want to get the 2nd bit (0-indexed)
        int result = getIthBit(n, i);
        System.out.println("The " + i + "th bit of " + n + " is: " + result); // Output: 1
    }
}
