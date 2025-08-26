# Check: Is a Number a Power of Two? (Canvas Notes)

The **power-of-two** test checks whether a number `n` is exactly equal to `2^k` for some non-negative integer `k`. In binary, powers of two have **exactly one `1` bit** (e.g., `1`, `10`, `100`, `1000`, ...).

---

## How it works (short)

A simple trick: `n & (n - 1)` clears the lowest set bit (the rightmost `1`) in `n`.

* If `n` is a power of two, it has only one `1`. Clearing that bit yields `0`.
* So when `(n & (n - 1)) == 0`, `n` had at most one `1` bit.
* **Important:** this expression returns true for `n = 0`, so always combine with `n > 0` for correctness.

**Safe test:**

```
n > 0 && (n & (n - 1)) == 0
```

---

## Binary intuition / proof

If `n = 2^k`, then in binary: `n = 1000...0` (one `1` followed by `k` zeros). Then:

```
n - 1 = 0111...1
n & (n - 1) = 1000...0 & 0111...1 = 0
```

If `n` has more than one `1` bit, removing the lowest `1` still leaves another `1`, so the result is non-zero.

---

## Bit-level Examples

**Example 1 — n = 16 (power of two)**

```
n     = 00010000
n - 1 = 00001111
n&(n-1)=00000000  => zero -> power of two
```

**Example 2 — n = 18 (not a power of two)**

```
n     = 00010010
n - 1 = 00010001
n&(n-1)=00010000  => non-zero -> not a power of two
```

---

## Java code variants (ready to paste)

### 1) Minimal check (unsafe for non-positive values)

```java
public static boolean isPowerOfTwo(int n) {
    return (n & (n - 1)) == 0;
}
```

### 2) Safe check (recommended)

```java
public static boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}

public static void main(String[] args) {
    System.out.println(isPowerOfTwo(16)); // true
    System.out.println(isPowerOfTwo(18)); // false
}
```

### 3) Inline usage (quick-if)

```java
int n = 16;
if (n > 0 && (n & (n - 1)) == 0) {
    System.out.println("Power of 2");
} else {
    System.out.println("Not a Power of 2");
}
```

### 4) Readable alternative (using library)

```java
public static boolean isPowerOfTwoUsingBitCount(int n) {
    return n > 0 && Integer.bitCount(n) == 1;
}
```

---

## Complexity

* Time: **O(1)** — constant time bitwise operations.
* Space: **O(1)**.

---

## Edge cases & tips

* Check `n > 0` to avoid `0` being considered a power of two.
* Negative numbers are not powers of two in this context.
* Use `long` if you need to test numbers > `2^31 - 1`.
* For very large numbers, use `BigInteger` and its bit methods.

---

## Quick checklist for your notebook

* ✅ `n > 0 && (n & (n - 1)) == 0` → safe test for power of two.
* ✅ `Integer.bitCount(n) == 1` → readable alternative.
* Examples: `1 (2^0)`, `2 (2^1)`, `4 (2^2)`, `8 (2^3)`, ...

---

## Conclusion

The `n & (n - 1)` trick is elegant and efficient: it clears the lowest `1` bit. Paired with `n > 0`, it becomes a tiny, reliable test to check whether a number is a power of two — perfect for interviews and clean code.
