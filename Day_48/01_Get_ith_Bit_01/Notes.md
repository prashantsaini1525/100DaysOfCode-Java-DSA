# Get i-th Bit (Check)

Check whether the **i-th bit** (0-indexed from the right) of a number is `1` or `0`.

---

## How it works

To check the i-th bit we create a **mask** that has `1` only at the i-th position and `0` elsewhere, then use **bitwise AND** with the number:

### Formula

```
(n & (1 << i)) != 0   // returns true if i-th bit is 1
// or to get value 0/1:
(n & (1 << i)) >> i   // returns 0 or 1
```

* `1 << i` produces a mask with only the i-th bit set (e.g., `1 << 2 = 00000100`).
* `n & mask` keeps only that bit; if result is zero → bit was 0; otherwise bit was 1.

---

## Java Example 1 (boolean style)

```java
public class GetBit {

    public static int getIthBit(int n, int i) {
        // Create a mask by left shifting 1 by i positions
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            // If the ith bit is not set, return 0
            return 0;
        } else {
            // If the ith bit is set, return 1
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2)); // Output: 0
        System.out.println(getIthBit(10, 3)); // Output: 1
    }
}
```

### Explanation

* `10` in binary (8-bit view): `00001010`
* For `i = 2`: mask = `1 << 2 = 00000100`; `00001010 & 00000100 = 00000000` → `0`.
* For `i = 3`: mask = `1 << 3 = 00001000`; `00001010 & 00001000 = 00001000` → non-zero → `1`.

---

## Java Example 2 (compact numeric style)

```java
public class GetBit1 {

    public static int getIthBit(int n, int i) {
        // Create a mask by left shifting 1 by i positions
        int mask = 1 << i;

        // Use bitwise AND to isolate the ith bit
        int ithBit = n & mask;

        // Shift the result right by i positions to get the bit value (0 or 1)
        return ithBit >> i;
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int i = 2; // We want to get the 2nd bit (0-indexed)
        int result = getIthBit(n, i);
        System.out.println("The " + i + "th bit of " + n + " is: " + result); // Output: 1
    }
}
```

### Explanation

* This version isolates the i-th bit and then shifts it back to LSB to return `0` or `1` directly.
* For `n = 5 (0101)`, `i = 2`: mask = `0100`, `0101 & 0100 = 0100`, shifting right by 2 → `0001` → `1`.

---

## Visualization (8-bit)

| n (dec) | n (binary) |  i | mask (1<\<i) |   n & mask | result |
| ------: | ---------: | -: | -----------: | ---------: | -----: |
|      10 | `00001010` |  2 |   `00000100` | `00000000` |      0 |
|      10 | `00001010` |  3 |   `00001000` | `00001000` |      1 |
|       5 | `00000101` |  2 |   `00000100` | `00000100` |      1 |

---

## Key Points

* Use `(n & (1 << i)) != 0` to **check** if i-th bit is set (boolean style).
* Use `(n & (1 << i)) >> i` to **return** the bit value `0` or `1` directly.
* Indexing is **0-based** (rightmost bit is `i=0`).
* Be careful with `i` >= number-of-bits (shifting behaviour depends on language/width).

---

## Use Cases

* Checking flags in a bitmask.
* Extracting individual bits for bitwise algorithms.
* Useful in competitive programming and low-level manipulation.

---

## Conclusion (one-line)

`Get i-th bit` → build a mask with `1<<i` and `AND` with the number; non-zero means bit is `1`, zero means `0`.
