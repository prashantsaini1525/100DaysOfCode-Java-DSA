
public class UpdateBit1 {

    public static int setIthBit(int n, int i) {
        int bitMask = (1 << i); // Create a bit mask with the ith bit set to 1
        return n | bitMask; // Use bitwise OR to set the ith bit in n
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i); // Create a bit mask with the ith bit set to 0
        return n & bitMask; // Use bitwise AND to clear the ith bit in n
    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i); // Clear the ith bit
        int Bitmask = newBit << i; // Create a bitmask with newBit at the ith position
        return n | Bitmask; // Update the ith bit to newBit
    }

    public static void printBinary(int n) {
        System.out.println(String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0')); // Print the binary representation of n, padded with leading zeros to 8 bits and replace spaces with '0'
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 1, 1));
        // 10 in binary is 1010, updating the 1st bit to 1 gives us 1010 which is 10 in decimal.
        System.out.println(updateIthBit(10, 2, 1));
        // 10 in binary is 1010, updating the 2nd bit to 1 gives us 1110 which is 14 in decimal.
        System.out.println(updateIthBit(10, 3, 0));
        // 10 in binary is 1010, updating the 3rd bit to 0 gives us 0010 which is 2 in decimal.

        int n1 = updateIthBit(10, 1, 1);
        System.out.print(n1 + " -> ");
        printBinary(n1);

        int n2 = updateIthBit(10, 2, 1);
        System.out.print(n2 + " -> ");
        printBinary(n2);

        int n3 = updateIthBit(10, 3, 0);
        System.out.print(n3 + " -> ");
        printBinary(n3);
    }
}
