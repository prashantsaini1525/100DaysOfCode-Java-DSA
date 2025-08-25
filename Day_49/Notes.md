# 📘 Day 49: Update i-th Bit, Clear Last i Bits & Clear Range \[i, j]

Today I focused on three practical bit-manipulation patterns that let you modify or clear specific bits quickly: **update the i‑th bit**, **clear the last i bits**, and **clear a range \[i, j]**. These are essential building blocks for flag management, packing data, and low-level algorithms.

---

## What I Did Today

1. **Updated the i‑th bit** (set to 0 or 1) using both a clear+set approach and a direct formula.
2. **Cleared the last i bits** (least-significant i bits) using masks like `~((1 << i) - 1)` and learned safe handling for edge cases.
3. **Cleared a range of bits \[i, j]** by constructing a mask that has 0s in `[i, j]` and 1s elsewhere: `mask = ((~0) << (j+1)) | ((1 << i) - 1)`.

---

## How I Practiced

* Implemented and ran small Java functions for each operation to verify outputs against hand-created binary visualizations.
* Walked through multiple examples step-by-step (clearing, updating, and range clearing) to confirm masks behave as expected.
* Added safety checks for shifts and explored behavior when `i` or `j` hit boundary values (e.g., `i >= 32`).

---

## 1) Update i‑th Bit

### Two approaches

**Approach A — use set/clear helpers**

```java
int updateIthBit(int n, int i, int newBit) {
    if (newBit == 0) return n & ~(1 << i); // clear
    else return n | (1 << i);             // set
}
```

**Approach B — direct formula (clear then place)**

```java
int updateIthBit(int n, int i, int newBit) {
    n = n & ~(1 << i);           // clear ith bit
    int bitMask = (newBit & 1) << i; // ensure newBit is 0/1 then shift
    return n | bitMask;          // combine
}
```

### Example (n = 10 → 1010)

* Update i=2 to 1 → result 14 (`1110`).
* Update i=3 to 0 → result 2 (`0010`).

---

## 2) Clear Last i Bits

### Formula

```
result = num & (~((1 << i) - 1))
// alternative: result = num & (~0 << i)
```

### Intuition

* `(1 << i) - 1` builds `i` ones at LSB (e.g., i=3 → `0b111`).
* `~(...)` flips it to zeros in last `i` positions and ones elsewhere.
* ANDing with `num` zeroes out the last `i` bits.

### Examples (8-bit view)

* `num = 15 (00001111)`, i=1 → result `00001110` (14)
* `num = 15`, i=3 → result `00001000` (8)

### Edge cases & safe version

* If `i <= 0` return `num`.
* If `i >= 32` (Java `int`) return `0` to avoid undefined shifts.

```java
int clearLastIBitsSafe(int num, int i) {
    if (i <= 0) return num;
    if (i >= 32) return 0;
    return num & (~((1 << i) - 1));
}
```

---

## 3) Clear Range of Bits `[i, j]`

### Formula

```
mask = ((~0) << (j + 1)) | ((1 << i) - 1);
result = n & mask;
```

### How mask is built

* `(~0) << (j+1)` → 1s left of `j`, zeros for positions `0..j`.
* `(1 << i) - 1` → 1s in positions `0..i-1`.
* OR them to get 1s outside `[i,j]` and 0s inside `[i,j]`.

### Example

```java
int n = 31; // 11111
int i = 1, j = 3;
int mask = ((~0) << (j + 1)) | ((1 << i) - 1);
int result = n & mask; // 10001 -> 17
```

### Notes

* Ensure `0 <= i <= j < 32` for Java `int` to avoid shift problems.
* This runs in O(1) time and uses constant extra space.

---

## Key Takeaways

* Update = clear + set (or use direct formula) — clear first, then place new bit.
* Clearing last `i` bits is a small mask trick that’s handy for alignment and rounding down to multiples of `2^i`.
* Clearing a range `[i, j]` uses a composed mask (`left part | right part`) — powerful for resetting fields in packed integers.
* Always guard shift amounts (`i`, `j`) when working in Java to avoid undefined behavior for large shifts.

---

## Quick Reference (cheat sheet)

* Set ith bit: `n | (1 << i)`
* Clear ith bit: `n & ~(1 << i)`
* Update ith bit: `n & ~(1<<i) | (newBit<<i)`
* Clear last i bits: `n & (~((1<<i)-1))`
* Clear range \[i,j]: `n & ( ((~0) << (j+1)) | ((1<<i)-1) )`

---

*Prepared as part of Day 49 of #100DaysOfCode*
