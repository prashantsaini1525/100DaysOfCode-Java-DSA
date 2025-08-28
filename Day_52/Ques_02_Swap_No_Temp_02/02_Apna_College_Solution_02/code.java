
public class code {

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println("Before Swap: x = " + x + ", y = " + y);
        // Swapping using XOR
        x = x ^ y; // Step 1: x now becomes 7 (0111)
        y = x ^ y; // Step 2: y becomes 3 (0011
        x = x ^ y; // Step 3: x becomes 4 (0100)
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }
}
