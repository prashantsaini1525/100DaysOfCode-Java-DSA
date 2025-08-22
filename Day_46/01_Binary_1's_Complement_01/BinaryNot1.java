
public class BinaryNot1 {

    public static void main(String[] args) {
        int a = 0;           // 000...0000
        int b = ~a;          // 111...1111 → -1
        System.out.println("~0 = " + b);

        int n = -1;          // 111...1111
        System.out.println("~(-1) = " + ~n);  // flips back to 0
    }
}
