# 📘 Day 50: Power-of-Two Checks & Counting Set Bits

Today I explored two fundamental bit-manipulation utilities that show up in interviews and real systems work:

* **Check if a number is a power of two** (fast `n & (n-1)` trick).
* **Count set bits** (simple right-shift loop and compact variants).

This file explains the intuition, safe checks, code snippets, examples, complexity, and practical tips — all in one place.

---

## What I Did Today

1. **Power-of-Two Test**

   * Learned the `n & (n - 1)` trick: it clears the lowest set bit. For powers of two (one `1` bit) this yields `0`.
   * Implemented the safe test: `n > 0 && (n & (n - 1)) == 0` and validated on `16 → true`, `18 → false`.
   * Reviewed alternatives: `Integer.bitCount(n) == 1` and `BigInteger` methods for large numbers.

2. **Count Set Bits**

   * Implemented the straightforward loop: test LSB with `(n & 1)`, shift right `n >>= 1`, accumulate count.
   * Wrote compact variants (`count += (n & 1); n >>= 1`) and noted complexity.
   * Discussed optimizations (Brian Kernighan’s algorithm and `Integer.bitCount`).

---

## Power-of-Two — How It Works

**Key idea:** a power-of-two in binary has exactly one `1`. Clearing the lowest `1` with `n & (n-1)` produces `0` for powers of two.

```java
// Safe test
public static boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}
```

**Binary proof:**

* `n = 1000...0` (2^k) → `n - 1 = 0111...1` → `n & (n-1) = 0`.

**Edge cases & tips:**

* Always require `n > 0` (0 would otherwise pass the `(n&(n-1))==0` check).
* Use `long` for values beyond 32-bit range; for arbitrarily large numbers use `BigInteger`.

---

## Count Set Bits — How It Works

**Simple approach (bit-by-bit):**

```java
public static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        count += (n & 1);
        n >>= 1;
    }
    return count;
}
```

**Complexity:** O(log n) — proportional to the number of bits in `n` (or O(32) for 32-bit ints).

**More efficient variant (Brian Kernighan):** repeatedly clear the lowest set bit:

```java
int count = 0;
while (n > 0) {
    n &= (n - 1); // drops the lowest 1
    count++;
}
```

* This runs in O(k) where k = number of set bits (faster when k is small).
* Java provides `Integer.bitCount(n)` as a fast builtin.

---

## Examples & Quick Checks

* `isPowerOfTwo(16) → true`
* `isPowerOfTwo(18) → false`
* `countSetBits(10) → 2` (10 = `1010`)
* `countSetBits(15) → 4` (15 = `1111`)

---

## Key Takeaways

* `n > 0 && (n & (n - 1)) == 0` is the canonical constant‑time power‑of‑two test.
* Counting bits by shifting is simple and clear; Brian Kernighan’s trick is the usual micro‑optimization.
* Prefer built‑ins like `Integer.bitCount()` when readability and performance are both desired.

---

*Prepared as part of Day 50 of #100DaysOfCode*
