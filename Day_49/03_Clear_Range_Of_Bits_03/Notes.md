# Clear Range of Bits

The **clear range of bits** operation is used to set a specific range of bits (from index `i` to `j`) in a number to **0**, while keeping all other bits unchanged. This is especially useful when working with bitmasks, binary data manipulation, and optimization tasks.

---

## How It Works

To clear bits in the range `[i, j]`:

1. Create a mask that has **0s in the range \[i, j]** and **1s elsewhere**.
2. Perform a bitwise `AND` between the number and this mask.

---

## Formula

```
mask = ((~0) << (j + 1)) | ((1 << i) - 1)
result = n & mask
```

* `(~0) << (j + 1)` → Creates 1s to the left of `j`.
* `(1 << i) - 1` → Creates 1s to the right of `i`.
* `|` (OR) → Combines them into a mask with 0s in `[i, j]`.
* `&` (AND) → Clears bits in the desired range.

---

## Example 1: Clearing a Range of Bits

```java
public class ClearRangeBitsExample {
    public static void main(String[] args) {
        int n = 31;     // 11111 in binary
        int i = 1;
        int j = 3;

        int mask = ((~0) << (j + 1)) | ((1 << i) - 1);
        int result = n & mask;

        System.out.println("Number before clearing: " + n);
        System.out.println("Number after clearing bits from " + i + " to " + j + ": " + result);
    }
}
```

### Explanation

* `n = 31` → `11111`
* Clear bits from 1 to 3 → `10001`
* Decimal result → `17`

---

## Example 2: Dynamic Range Clearing

```java
public class ClearRangeBitsDynamic {
    public static void main(String[] args) {
        int n = 255;   // 11111111 in binary
        int i = 2;
        int j = 5;

        int mask = ((~0) << (j + 1)) | ((1 << i) - 1);
        int result = n & mask;

        System.out.println("The result of clearing bits from " + i + " to " + j + " in " + n + " is: " + result);
    }
}
```

### Explanation

* `n = 255` → `11111111`
* Clear bits from 2 to 5 → `11000011`
* Decimal result → `195`

---

## Binary Visualization

| Number (n) | Binary (Before) | Clear Range \[i, j] | Binary (After) | Decimal Result |
| ---------- | --------------- | ------------------- | -------------- | -------------- |
| 31         | `0001 1111`     | \[1, 3]             | `0001 0001`    | 17             |
| 255        | `1111 1111`     | \[2, 5]             | `1100 0011`    | 195            |

---

## Key Points

* **Masking** is the core idea behind clearing bits.
* Useful for resetting specific parts of a binary number.
* Indexing starts from **0 (LSB)**.
* Works efficiently in **O(1)** time complexity.

---

## Use Cases

* Resetting specific fields in binary-encoded data.
* Working with **flags, registers, or permissions**.
* Useful in **image processing, compression, and cryptography**.

---

## Conclusion

The **clear range of bits** technique is a powerful binary manipulation tool. By carefully constructing a mask, we can reset a range of bits in constant time, making it efficient and practical for low-level programming and performance-critical applications.
