
public class ClearBit {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i); // Create a bit mask with the ith bit set to 0 
        return n & bitMask; // Use bitwise AND to clear the ith bit in n
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
        // 10 in binary is 1010, clearing the 1st bit gives us 1000 which is 8 in decimal.
        System.out.println(clearIthBit(10, 2));
        // 10 in binary is 1010, clearing the 2nd bit gives us 1010 which is 10 in decimal.
        System.out.println(clearIthBit(10, 3));
        // 10 in binary is 1010, clearing the 3rd bit gives us 0010 which is 2 in decimal.
    }
}
