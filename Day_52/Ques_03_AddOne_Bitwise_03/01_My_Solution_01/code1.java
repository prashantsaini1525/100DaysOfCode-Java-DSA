
public class code1 {

    int addOneByBits(int x) {
        int mask = 1;
        while ((x & mask) != 0) { // while current bit is 1
            x ^= mask; // flip it to 0 (carry)
            mask <<= 1; // move to next bit
        }
        x ^= mask; // flip first 0 to 1
        return x;
    }

    public static void main(String[] args) {
        code1 obj = new code1();
        int n = 15;
        System.out.println(obj.addOneByBits(n));
    }
}
