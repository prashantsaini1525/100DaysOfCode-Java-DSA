# Bitwise Left Shift Operator (`<<`)

The bitwise **left shift operator** (`<<`) moves the bits of a number to the **left** by a specified number of positions. This has the effect of **multiplying the number by 2 raised to the power of shift amount**.

---

## How It Works

When you perform `a << b`, you're shifting the binary representation of `a` to the left by `b` positions.

### Formula:

```
a << b  ≡  a × 2^b
```
# Bitwise Right Shift Operator (`>>`)

The bitwise **right shift operator** (`>>`) shifts the bits of a number **to the right** by a given number of positions. Each right shift effectively divides the number by 2 raised to the number of shift positions, discarding any remainder.

---

## How It Works

When you write `a >> b`, it means:
- Move each bit in `a` to the right by `b` positions.
- The **leftmost bits** are filled based on the sign of `a` (0 for positive, 1 for negative).
- The **rightmost bits** are discarded.

### Formula:

```
a >> b ≡ a / (2^b)
```

Note: This is integer division (i.e., the result is rounded down to the nearest whole number).

---

## Example 1: Simple Right Shift Calculations

```java
public class BinaryRightShift {

    public static void main(String[] args) {
        System.out.println(6 >> 1); // Right shift 6 by 1 → 6 / 2^1 = 3
        System.out.println(6 >> 3); // Right shift 6 by 3 → 6 / 2^3 = 0
    }
}
```

### Explanation:

- `6 >> 1`
  - Binary: `0000 0110`
  - Shift → `0000 0011` (which is 3 in decimal)

- `6 >> 3`
  - Binary: `0000 0110`
  - Shift → `0000 0000` (which is 0 in decimal)

---

## Example 2: Dynamic Right Shift Operation

```java
public class BinaryRightShift1 {

    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // shift amount

        int result = a >> b; // 5 >> 3 = 0

        System.out.println("The result of " + a + " >> " + b + " is: " + result);
    }
}
```

### Explanation:

- `5 >> 3`
  - Binary of 5: `0000 0101`
  - Shift 3 bits right → `0000 0000`
  - Decimal result: `0`

---

## Binary Visualization

| Operation | Binary (Before) | Shift | Binary (After) | Decimal Result |
|-----------|------------------|--------|-----------------|----------------|
| 6 >> 1    | `0000 0110`       | 1      | `0000 0011`      | 3              |
| 6 >> 3    | `0000 0110`       | 3      | `0000 0000`      | 0              |
| 5 >> 3    | `0000 0101`       | 3      | `0000 0000`      | 0              |

---

## Key Points

- Right shift divides the number by powers of 2.
- Discards bits shifted out from the right.
- For **positive numbers**, left bits are filled with `0`.
- For **negative numbers**, Java uses **sign extension** (left bits filled with `1`).

---

## Use Cases

- Efficient integer division.
- Binary parsing and compression.
- Working with encoded values or binary protocols.

---

## Conclusion

The right shift operator is a powerful tool for reducing a number by factors of two using direct binary manipulation. It’s especially useful for performance-optimized code and low-level operations where binary control matters.

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
