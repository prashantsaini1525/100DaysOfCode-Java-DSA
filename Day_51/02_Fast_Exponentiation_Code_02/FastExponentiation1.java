
public class FastExponentiation1 {

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) { // If n is odd
                ans = ans * a;
            }
            a = a * a; // Square the base
            n = n >> 1; // Divide n by 2
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println("Result: " + fastExpo(a, n)); // Output: 1024
    }
}
