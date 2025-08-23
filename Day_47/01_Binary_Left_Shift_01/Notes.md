# Bitwise Left Shift Operator (`<<`)

The bitwise **left shift operator** (`<<`) moves the bits of a number to the **left** by a specified number of positions. This has the effect of **multiplying the number by 2 raised to the power of shift amount**.

---

## How It Works

When you perform `a << b`, you're shifting the binary representation of `a` to the left by `b` positions.

### Formula:

```
a << b  ≡  a × 2^b
```

Each shift left by 1 position effectively multiplies the number by 2.

---

## Example 1: Simple Shift Calculations

```java
public class BinaryLeftShift {
    public static void main(String[] args) {
        System.out.println(5 << 2); // 5 × 2^2 = 20
        System.out.println(6 << 3); // 6 × 2^3 = 48
    }
}
```

### Explanation

- `5 << 2`
  - Binary: `0000 0101`
  - Shift left by 2: `0001 0100` → 20

- `6 << 3`
  - Binary: `0000 0110`
  - Shift left by 3: `0011 0000` → 48

---

## Example 2: Shifting with Dynamic Operands

```java
public class BinaryLeftShift1 {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Perform left shift
        int result = a << b; // 5 << 3 = 5 × 2^3 = 40

        System.out.println("The result of " + a + " << " + b + " is: " + result);
    }
}
```

- `5 << 3` results in `40`:
  - Binary: `0000 0101`
  - Shift left 3 times → `0010 1000` = 40

---

## Visualization

| Operation | Binary (Before) | Shift | Binary (After) | Decimal |
|-----------|------------------|--------|-----------------|---------|
| 5 << 2    | `0000 0101`       | 2      | `0001 0100`      | 20      |
| 6 << 3    | `0000 0110`       | 3      | `0011 0000`      | 48      |
| 5 << 3    | `0000 0101`       | 3      | `0010 1000`      | 40      |

---

## Key Points

- Only the **left-hand side** (LHS) is evaluated in binary.
- The **right-hand side** (RHS) represents how many times the LHS bits are shifted.
- Any bits shifted beyond the leftmost boundary are **discarded**.
- **Zeros** are filled in from the right side during the shift.

---

## Use Cases

- Efficient multiplication by powers of 2.
- Bitmask manipulations.
- Performance-critical low-level programming like hardware registers and encodings.

---

## Conclusion

The left shift operator provides a fast way to multiply by powers of 2 using binary bit manipulation. Understanding how the bits move and what the result means in decimal helps in writing more optimized and performant code.
