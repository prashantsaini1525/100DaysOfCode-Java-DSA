
public class ClearLastBit1 {

    public static int clearLastIBits(int n, int i) {
        int bitMask = (~0) << i; // Create a bit mask with the last i bits set to 0
        //we can also use (-1) << i; to create the bit mask
        // ~0 is all bits set to 1, shifting left by i positions clears the last i bits and sets the rest to 1.
        return n & bitMask; // Use bitwise AND to clear the last i bits in n
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int i = 2; // We want to clear the last 2 bits (0-indexed)
        System.out.println(clearLastIBits(n, i)); // Output: 4 (Binary: 0100)
    }
}
