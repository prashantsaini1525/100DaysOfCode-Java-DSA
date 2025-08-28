
public class code {

    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 7; // 0111

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Step 1: a = a ^ b
        a = a ^ b; // a now becomes 2 (0010)

        // Step 2: b = a ^ b
        b = a ^ b; // b becomes 5 (0101)

        // Step 3: a = a ^ b
        a = a ^ b; // a becomes 7 (0111)

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
