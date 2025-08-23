// Check if a number is odd or even using bit manipulation

public class OddEven {

    public static void OddOrEven(int n) {
        int bitmask = 1; // 0001 in binary
        if ((n & bitmask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(14);
        OddOrEven(99);
    }
}
