# Clear i-th Bit

Clear (turn OFF) the **i-th bit** (0-indexed from the right) of a number.

---

## How it works

To clear the i-th bit we create a **mask** that has `0` at the i-th position and `1` elsewhere, then use **bitwise AND** with the number:

### Formula

```
num & ~(1 << i)
```

* `1 << i` produces a mask with only the i-th bit set (e.g., `1 << 2 = 00000100`).
* `~(1 << i)` flips that mask to `...11111011` (0 at i, 1s elsewhere).
* `num & mask` clears that bit to `0` while keeping other bits unchanged.

---

## Java Example 1 (simple style)

```java
public class ClearBit {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i); // Create a bit mask with the ith bit set to 0
        return n & bitMask; // Use bitwise AND to clear the ith bit in n
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
        // 10 in binary is 1010, clearing the 1st bit gives us 1000 which is 8 in decimal.
        System.out.println(clearIthBit(10, 2));
        // 10 in binary is 1010, clearing the 2nd bit gives us 1010 which is 10 in decimal.
        System.out.println(clearIthBit(10, 3));
        // 10 in binary is 1010, clearing the 3rd bit gives us 0010 which is 2 in decimal.
    }
}
```

### Explanation

* `10` in binary (8-bit view): `00001010`
* For `i = 1`: mask = `~(1 << 1) = ~00000010 = 11111101`; `00001010 & 11111101 = 00001000` → `8`.
* For `i = 2`: mask = `~(1 << 2) = ~00000100 = 11111011`; `00001010 & 11111011 = 00001010` → `10` (bit already 0 → no change).
* For `i = 3`: mask = `~(1 << 3) = ~00001000 = 11110111`; `00001010 & 11110111 = 00000010` → `2`.

---

## Java Example 2 (compact)

```java
public class ClearBit1 {

    public static int clearIthBit(int n, int i) {
        // Create a bit mask with the ith bit set to 0
        // For example, if i = 2, bitMask will be 1111...111011 (which is ~(1 << 2))
        // This means we are clearing the 2nd bit of n
        int bitMask = ~(1 << i);
        return n & bitMask; // Use bitwise AND to clear the ith bit in n
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int i = 2; // We want to clear the 2nd bit (0-indexed)
        System.out.println(clearIthBit(n, i)); // Output: 1 (Binary: 0001)
    }
}
```

### Explanation

* For `n = 5 (0101)`, `i = 2`: mask = `~0100 = 1011`; `0101 & 1011 = 0001` → `1`.

---

## Visualization (8-bit) — compact

| n (dec) | n (binary) |  i  | mask (1<\<i) | mask (binary) | result (binary) | result (dec) |
| ------: | :--------- | :-: | :----------- | :-----------: | :-------------: | -----------: |
|      10 | `00001010` |  1  | `00000010`   |   `11111101`  |    `00001000`   |            8 |
|      10 | `00001010` |  2  | `00000100`   |   `11111011`  |    `00001010`   |           10 |
|      10 | `00001010` |  3  | `00001000`   |   `11110111`  |    `00000010`   |            2 |
|       5 | `00000101` |  2  | `00000100`   |   `11111011`  |    `00000001`   |            1 |

---

## Key Points

* `num & ~(1 << i)` clears the i-th bit and leaves other bits intact.
* If the i-th bit is already `0`, the number stays the same.
* Indexing is **0-based** (rightmost bit is `i=0`).
* Be careful with `i` >= number-of-bits (shifting behaviour depends on language/width).

---

## Use Cases

* Disabling a flag in a bitmask.
* Mask manipulation in low-level encoding.
* Clearing specific bits before setting new values.

---

## Conclusion (one-line)

`Clear i-th bit` → create mask `~(1<<i)` and AND with the number: `num & ~(1 << i)`.
