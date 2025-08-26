
public class PowerOfTwoOrNot1 {

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0 && n > 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(18)); // false
    }
}
