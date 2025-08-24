
public class GetBit {

    public static int getIthBit(int n, int i) {
        // Create a mask by left shifting 1 by i positions
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            // If the ith bit is not set, return 0 
            return 0;
        } else {
            // If the ith bit is set, return 1
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2)); // Output: 0
        System.out.println(getIthBit(10, 3)); // Output: 1
    }
}
