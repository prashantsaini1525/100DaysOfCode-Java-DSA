
public class CountSetBits2 {

    // Function to count set bits in an integer
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1); // Increment count if the last bit is set
            n >>= 1;          // Right shift n to check the next bit
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 13; // Binary representation: 1101
        int count = countSetBits(n);
        System.out.println("Number of set bits in " + n + " is: " + count);
    }
}
