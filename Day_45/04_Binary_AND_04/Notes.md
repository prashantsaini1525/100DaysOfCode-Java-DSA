# Bitwise AND Operator

The bitwise AND operator (`&`) compares each bit of two integers and returns a new integer whose bits are set to 1 only if both corresponding bits of the inputs are 1.

## How It Works

- **Operation**: For each bit position,  
  result bit = 1 **only if** both input bits = 1  
- **Use cases**: Masking bits, checking flags, clearing bits, low-level optimizations.

## Examples

```java
public class BinaryAnd {
    public static void main(String[] args) {
        System.out.println(5 & 6);  // 0101 & 0110 = 0100 → 4
    }
}
```

```java
public class BinaryAnd1 {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Perform bitwise AND operation
        int result = a & b; // 0001 in binary, which is 1 in decimal

        // Print the result
        System.out.println("The result of " + a + " & " + b + " is: " + result);
    }
}
```

## Explanation

- In the first example, `5 & 6` evaluates bit-by-bit:
  - `0101` (5)
  - `0110` (6)
  - `0100` (4)
- In the second example, `(5 & 3)` yields `0001` (1), because only the least significant bit is set in both inputs.

## Practical Tips

- **Checking a single bit**: Use `(value & (1 << n)) != 0` to test if the nth bit is set.
- **Clearing bits**: Combine with NOT to clear: `value & ~mask`.
- **Combining flags**: Use AND along with OR to apply multiple masks.

## Conclusion

Understanding the AND operator is foundational for efficient bit-level data manipulation.
