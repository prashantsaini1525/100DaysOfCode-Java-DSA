
public class FastExponentiation {

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a; // Square the base
            n = n >> 1; // Divide n by 2
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5)); // Output: 243
        System.out.println(fastExpo(5, 3)); // Output: 125
        System.out.println(fastExpo(2, 10)); // Output: 1024
    }
}
