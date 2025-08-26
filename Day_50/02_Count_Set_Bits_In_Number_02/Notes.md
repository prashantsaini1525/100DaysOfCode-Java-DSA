# Count Set Bits

The **count set bits** operation is used to determine how many `1`s are present in the binary representation of a number. These `1`s are often called **set bits**. This concept is widely used in bit manipulation problems, optimization tasks, and even hardware-level programming.

---

## How It Works

1. Check the **least significant bit (LSB)** using `(n & 1)`.

   * If it equals `1`, increment the count.
2. Right shift the number (`n >> 1`) to check the next bit.
3. Repeat until the number becomes `0`.

---

## Formula / Approach

```
while (n > 0):
    if (n & 1) != 0:
        count++
    n = n >> 1
```

* `(n & 1)` → Checks if the last bit is set.
* `>>` (Right Shift) → Moves to the next bit.

---

## Example 1: Count Set Bits in 10

```java
public class CountSetBits {

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // Check if the last bit is set
                count++;
            }
            n = n >> 1; // Shift to the next bit
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(10)); // Output: 2
    }
}
```

### Explanation

* `n = 10` → Binary: `1010`
* Set bits → `2`

---

## Example 2: Optimized Style

```java
public class CountSetBits1 {

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) { // Alternative check
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(15)); // Output: 4
    }
}
```

### Explanation

* `n = 15` → Binary: `1111`
* Set bits → `4`

---

## Example 3: Compact Implementation

```java
public class CountSetBits2 {

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1); // Directly add last bit
            n >>= 1;          // Shift right
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 13; // Binary: 1101
        int count = countSetBits(n);
        System.out.println("Number of set bits in " + n + " is: " + count);
    }
}
```

### Explanation

* `n = 13` → Binary: `1101`
* Set bits → `3`

---

## Binary Visualization

| Number (n) | Binary  | Set Bits Count |
| ---------- | ------- | -------------- |
| 10         | `1010`  | 2              |
| 15         | `1111`  | 4              |
| 16         | `10000` | 1              |
| 13         | `1101`  | 3              |

---

## Key Points

* Each iteration checks one bit → **O(log n)** complexity.
* `(n & 1)` is the core operation for detecting set bits.
* Can be optimized further using **Brian Kernighan’s Algorithm**.

---

## Use Cases

* Counting **1s in binary representation** (Hamming weight).
* Applications in **cryptography, compression, error detection**.
* Used in solving problems like **subset generation** or **bitmask DP**.

---

## Conclusion

The **count set bits** operation is simple but powerful in bit manipulation. By repeatedly checking the least significant bit and shifting, we can efficiently count the number of set bits in a number.
