# Bitwise OR Operator

The bitwise OR operator (`|`) compares each bit of two integers and returns a new integer whose bits are set to 1 if **either** corresponding bit of the inputs is 1.

## How It Works

- **Operation**: For each bit position,  
  result bit = 1 if at least one input bit = 1  
- **Use cases**: Setting flags, combining bit masks, default value application.

## Examples

```java
public class BinaryOr {
    public static void main(String[] args) {
        System.out.println(5 | 6);  // 0101 | 0110 = 0111 → 7
    }
}
```

```java
public class BinaryOr1 {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Perform bitwise OR operation
        int result = a | b; // 0111 in binary, which is 7 in decimal

        // Print the result
        System.out.println("The result of " + a + " | " + b + " is: " + result);
    }
}
```

## Explanation

- In the first example, `5 | 6` gives:
  - `0101` (5)
  - `0110` (6)
  - `0111` (7)
- In the second example, `(5 | 3)` yields `0111` (7) because any bit set in either input becomes 1.

## Practical Tips

- **Setting Bits**: Use OR with a mask to switch on specific bits without altering others.  
- **Merging Flags**: Combine multiple boolean flags stored as bits into a single value.

## Conclusion

Mastering OR operations is crucial for effectively constructing and combining bit masks.
