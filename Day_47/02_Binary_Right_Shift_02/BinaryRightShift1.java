
public class BinaryRightShift1 {

    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Perform bitwise right shift operation
        // This shifts the bits of 'a' to the right by 'b' positions
        // For example, 5 (0101) right shifted by 3 becomes 0000 in binary
        // which is 0 in decimal
        int result = a >> b; // 0101 becomes 0000 in binary, which is 0 in decimal 

        // Print the result
        System.out.println("The result of " + a + " >> " + b + " is: " + result);
    }
}
