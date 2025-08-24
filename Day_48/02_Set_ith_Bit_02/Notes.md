# Set i-th Bit

Set (turn ON) the **i-th bit** (0-indexed from the right) of a number.

---

## How it works

To set the i-th bit we create a **mask** that has `1` only at the i-th position and `0` elsewhere, then use **bitwise OR** with the number:

### Formula

```
num | (1 << i)
```

* `1 << i` produces a mask with only the i-th bit set (e.g., `1 << 2 = 00000100`).
* `num | mask` sets that bit to `1` without changing other bits.

---

## Java Example 1 (simple style)

```java
public class SetBit {

    public static int setIthBit(int n, int i) {
        // Create a bit mask with the ith bit set to 1
        // For example, if i = 2, bitMask will be 0000...000100 (which is 1 << 2)
        // This means we are setting the 2nd bit of n to 1
        int bitMask = 1 << i;
        return n | bitMask; // Use bitwise OR to set the ith bit in n
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2)); // Example usage
        // 10 in binary is 1010, setting the 2nd bit gives us 1110 which is 14 in decimal.
        System.out.println(setIthBit(10, 3)); // 10 in binary is 1010, setting the 3rd bit gives us 1010 which is still 10 in decimal.
    }
}
```

### Explanation

* `10` in binary (8-bit view): `00001010`
* For `i = 2`: mask = `1 << 2 = 00000100`; `00001010 | 00000100 = 00001110` → `14`.
* For `i = 3`: mask = `1 << 3 = 00001000`; `00001010 | 00001000 = 00001010` → `10` (bit already set, so value unchanged).

---

## Java Example 2 (compact)

```java
public class SetBit1 {

    public static int setIthBit(int n, int i) {
        // Create a mask with the ith bit set
        int mask = 1 << i;
        // Use bitwise OR to set the ith bit in n
        return n | mask;
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int i = 2; // Set the 2nd bit (0-indexed)
        int result = setIthBit(n, i);
        System.out.println("Number after setting " + i + "th bit: " + result); // Output: 5 (Binary: 0101)
    }
}
```

### Explanation

* For `n = 5 (0101)`, `i = 2`: mask = `0100`. `0101 | 0100 = 0101` → `5` (bit already 1 → no change).

---

## Visualization (8-bit)

| n (dec) | n (binary)  | i | mask (1<<i) | n (binary) | mask (binary) | result (binary) | result (dec) |
|--------:|:------------|:--:|:------------|:-----------:|:-------------:|:----------------:|-------------:|
| 10      | `00001010`  | 2 | `00000100`  | `00001010`  | `00000100`    | `00001110`       | 14           |
| 10      | `00001010`  | 3 | `00001000`  | `00001010`  | `00001000`    | `00001010`       | 10           |
| 5       | `00000101`  | 2 | `00000100`  | `00000101`  | `00000100`    | `00000101`       | 5            |

---

## Key Points

* `num | (1 << i)` sets the i-th bit to 1 and leaves other bits unchanged.
* If the i-th bit is already `1`, the number remains the same.
* Indexing is **0-based** (rightmost bit is `i=0`).
* Be careful with `i` >= number-of-bits (shifting behaviour depends on language/width).

---

## Use Cases

* Enabling a flag in a bitmask.
* Turning on features represented by single bits.
* Building/setting bits for encoding or low-level protocols.

---

## Conclusion (one-line)

`Set i-th bit` → create mask `1<<i` and OR with the number: `num | (1 << i)`.
