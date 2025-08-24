
public class SetBit {

    public static int setIthBit(int n, int i) {
        // Create a bit mask with the ith bit set to 1
        // For example, if i = 2, bitMask will be 0000...000100 (which is 1 << 2)
        // This means we are setting the 2nd bit of n to 1
        int bitMask = 1 << i;
        return n | bitMask; // Use bitwise OR to set the ith bit in n
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2)); // Example usage
        // 10 in binary is 1010, setting the 2nd bit gives us 1110 which is 14 in decimal.
        System.out.println(setIthBit(10, 3)); // 10 in binary is 1010, setting the 3rd bit gives us 1010 which is still 10 in decimal.
    }
}
