# Bitwise XOR Operator

The bitwise XOR operator (`^`) compares each bit of two integers and returns a new integer whose bits are set to 1 if the corresponding bits are **different**.

## How It Works

- **Operation**: For each bit position,  
  result bit = 1 if input bits differ (one is 1, the other is 0)  
- **Use cases**: Bit toggling, simple checksums, parity calculations.

## Examples

```java
public class BinaryXor {
    public static void main(String[] args) {
        System.out.println(5 ^ 6);  // 0101 ^ 0110 = 0011 → 3
    }
}
```

```java
public class BinaryXor1 {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Perform bitwise XOR operation
        int result = a ^ b; // 0010 in binary, which is 2 in decimal

        // Print the result
        System.out.println("The result of " + a + " ^ " + b + " is: " + result);
    }
}
```

## Explanation

- In the first example, `5 ^ 6` gives:
  - `0101` (5)
  - `0110` (6)
  - `0011` (3)
- In the second example, `(5 ^ 3)` yields `0010` (2) because only bits that differ between inputs become 1.

## Practical Tips

- **Toggling Bits**: Use XOR with a mask to flip specific bits.  
- **Parity Checks**: XOR accumulates parity information (even/odd).

## Conclusion

Understanding XOR unlocks powerful techniques for bit-level transformations and toggles.
