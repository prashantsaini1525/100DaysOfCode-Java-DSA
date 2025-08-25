
public class ClearRangeInBits {

    public static int clearBitsinRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearBitsinRange(10, 2, 4));
        // 15 in binary is 1111, clearing bits from position 1 to 3 gives us 0001 which
        // is 1 in decimal.
        System.out.println(clearBitsinRange(31, 1, 3));
        // 31 in binary is 11111, clearing bits from position 1 to 3 gives us 10001
        // which is 17 in decimal.
        System.out.println(clearBitsinRange(63, 1, 4));
        // 63 in binary is 111111, clearing bits from position 1 to 4 gives us 100001
        // which is 33 in decimal.
    }
}
