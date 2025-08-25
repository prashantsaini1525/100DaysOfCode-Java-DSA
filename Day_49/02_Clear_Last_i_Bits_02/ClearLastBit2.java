
public class ClearLastBit2 {

    public static int clearLastIBits(int n, int i) {
        int bitMask = ~((1 << i) - 1); // Create a bit mask with the last i bits set to 0
        // This works by shifting 1 left by i positions, subtracting 1 gives us i bits set to 1, and then negating it clears those bits.
        return n & bitMask; // Use bitwise AND to clear the last i bits in n
    }

    public static void main(String[] args) {
        System.out.println(clearLastIBits(15, 1));
        // 15 in binary is 1111, clearing the last 1 bit gives us 1110 which is 14 in decimal.
        System.out.println(clearLastIBits(15, 2));
        // 15 in binary is 1111, clearing the last 2 bits gives us 1100 which is 12 in decimal.
        System.out.println(clearLastIBits(15, 3));
        // 15 in binary is 1111, clearing the last 3 bits gives us 1000 which is 8 in decimal.
    }
}
