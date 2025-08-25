
public class ClearRangeInBits1 {

    public static int clearBitsinRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int i = 2; // Starting position (0-indexed)
        int j = 3; // Ending position (0-indexed)
        System.out.println(clearBitsinRange(n, i, j)); // Output: 1 (Binary: 0001)
    }
}
