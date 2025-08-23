# 📘 Day 47: Left & Right Shifts — Odd/Even with Bitmask

Today I continued bit manipulation practice by learning and applying the **left shift (`<<`)** and **right shift (`>>`)** operators, and then solved a small problem: checking whether a number is odd or even using bit operations. This file summarizes what I did, how I tested it, and the key takeaways—kept as a single, unified page for Day 47.

---

## What I Did Today

1. **Learned Bitwise Left Shift (`<<`)**

   * Concept: Shifts bits left by a specified number of positions; each left shift multiplies the value by `2`.
   * Formula: `a << b ≡ a × 2^b`.
   * Examples tested: `5 << 2 -> 20`, `6 << 3 -> 48`, `5 << 3 -> 40`.
   * Practical use: fast multiplication by powers of two, bitmask placement, and low-level encodings.

2. **Learned Bitwise Right Shift (`>>`)**

   * Concept: Shifts bits right by a specified number of positions; effectively divides by powers of two with integer truncation.
   * Formula: `a >> b ≡ a / 2^b` (integer division semantics).
   * Examples tested: `6 >> 1 -> 3`, `6 >> 3 -> 0`, `5 >> 3 -> 0`.
   * Note on sign: Java uses sign extension for `>>` (preserves sign bit for negatives).

3. **Solved an Odd/Even Problem with Bitmasking**

   * Idea: Use `n & 1` to check the least significant bit — `0` means even, `1` means odd.
   * Sample tests: inputs `3, 11, 14, 99` returned `Odd, Odd, Even, Odd` respectively.
   * Why it’s neat: O(1) check per number, tiny code, CPU-friendly.

---

## How I Practiced

* Read and ran the example programs for both `<<` and `>>` to see binary transformations and decimal results.
* Wrote a small `OddEven` Java program using a bitmask (`n & 1`) and ran it on several values to confirm correctness.
* Visualized binary before/after for a few examples to internalize how bits move and what gets discarded or filled.

---

## Key Details & Examples (reference)

**Left shift**

```java
// 5 << 2 = 20
System.out.println(5 << 2); // 20
// 6 << 3 = 48
System.out.println(6 << 3); // 48
```

**Right shift**

```java
// 6 >> 1 = 3
System.out.println(6 >> 1); // 3
// 5 >> 3 = 0
System.out.println(5 >> 3); // 0
```

**Odd/Even bitmask**

```java
int bitmask = 1; // 0001
if ((n & bitmask) == 0) {
    // even
} else {
    // odd
}
```

---

## Key Takeaways

* `<<` is a fast way to multiply by powers of two; bits pushed left drop off the high end and zeros fill on the right.
* `>>` is integer division by powers of two; sign extension matters for negative numbers.
* Bitmasking (`n & 1`) is the simplest, fastest parity check—useful in tight loops and low-level code.

---

*Prepared as part of Day 47 of #100DaysOfCode*
