
public class code {

    public static int addOne(int n) {
        int m = 1;
        while ((n & m) > 0) {
            n = n ^ m; // toggle the bits
            m = m << 1; // left shift m by 1
        }
        n = n ^ m; // toggle the rightmost 0 bit
        return n;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(addOne(n));
    }
}
