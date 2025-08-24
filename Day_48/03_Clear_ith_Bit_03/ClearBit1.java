
public class ClearBit1 {

    public static int clearIthBit(int n, int i) {
        // Create a bit mask with the ith bit set to 0
        // For example, if i = 2, bitMask will be 1111...111011 (which is ~(1 << 2))
        // This means we are clearing the 2nd bit of n
        int bitMask = ~(1 << i);
        return n & bitMask; // Use bitwise AND to clear the ith bit in n
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int i = 2; // We want to clear the 2nd bit (0-indexed) 
        System.out.println(clearIthBit(n, i)); // Output: 1 (Binary: 0001)
    }
}
