# Bitwise NOT Operator (`~`)

The bitwise NOT operator in Java (`~`) is a **unary** operator that flips every bit of its operand. It converts all `1`s to `0`s and all `0`s to `1`s. This is commonly known as the **1's complement**.

---

## Concept

To understand how `~x` works, we need to know:

- Java uses **32-bit signed integers**.
- Negative numbers are stored in **two's complement** form.
- Applying `~x` returns the 1’s complement of `x`, which is mathematically equal to `-(x + 1)`.

### Formula:
```
~x = -(x + 1)
```

---

## Example 1: Flipping 0 and 5

```java
public class BinaryNot {
    public static void main(String[] args) {
        System.out.println(~0);  // Output: -1
        System.out.println(~5);  // Output: -6
    }
}
```

### Step-by-step:

- `~0`:
  - Binary of 0 = `0000...0000`
  - Flip bits → `1111...1111` → Equals `-1`

- `~5`:
  - Binary of 5 = `0000...0101`
  - Flip bits → `1111...1010` → Equals `-6`  
  - As per formula: `~5 = -(5 + 1) = -6`

---

## Example 2: Flipping positive and negative numbers

```java
public class BinaryNot1 {
    public static void main(String[] args) {
        int a = 0;
        int b = ~a;
        System.out.println("~0 = " + b);      // -1

        int n = -1;
        System.out.println("~(-1) = " + ~n);  // 0
    }
}
```

### Explanation:

- `~0` → `-1`: All bits flip to `1`s → -1
- `~(-1)` → `0`: All `1`s in -1 flip to all `0`s → 0

---

## Visualization (in 8-bit format for simplicity)

| Decimal | Binary        | `~x` (flipped) | Decimal Result |
|---------|---------------|----------------|----------------|
| 5       | `0000 0101`   | `1111 1010`     | -6             |
| 0       | `0000 0000`   | `1111 1111`     | -1             |
| -1      | `1111 1111`   | `0000 0000`     | 0              |

---

## Use Cases

- **Inverting flags**: Useful in low-level programming to invert every bit in a value.
- **Resetting bits with masks**.
- **Mathematical tricks**: Can be used as a compact form to negate and subtract 1.

---

## Conclusion

The bitwise NOT operator is simple but powerful. Understanding how Java handles signed integers and two’s complement makes its behavior clear and predictable.
