
public class SetBit1 {

    public static int setIthBit(int n, int i) {
        // Create a mask with the ith bit set
        int mask = 1 << i;
        // Use bitwise OR to set the ith bit in n
        return n | mask;
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int i = 2; // Set the 2nd bit (0-indexed)
        int result = setIthBit(n, i);
        System.out.println("Number after setting " + i + "th bit: " + result); // Output: 5 (Binary: 0101)
    }
}
