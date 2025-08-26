
public class CountSetBits1 {

    // Function to count set bits in an integer
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) { // Check if the last bit is set (LSB)
                count++;
            }
            n = n >> 1; // Right shift n by 1
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(10)); // Output: 2 (binary 1010 has two set bits)
        System.out.println(countSetBits(15)); // Output: 4 (binary 1111 has four set bits)
        System.out.println(countSetBits(16)); // Output: 1 (binary 10000 has one set bit)
    }
}
