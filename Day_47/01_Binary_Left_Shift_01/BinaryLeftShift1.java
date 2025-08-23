
public class BinaryLeftShift1 {

    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Perform bitwise left shift operation
        // This shifts the bits of 'a' to the left by 'b' positions
        // For example, 5 (0101) left shifted by 3 becomes 101000 in binary
        // which is 40 in decimal
        int result = a << b; // 0101 becomes 101000 in binary, which is 40 in decimal 

        // Print the result
        System.out.println("The result of " + a + " << " + b + " is: " + result);
    }
}
