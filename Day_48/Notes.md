# 📘 Day 48: Get, Set & Clear i-th Bit in Java

Today I continued with **Bit Manipulation** and explored three fundamental operations: **getting**, **setting**, and **clearing** the i-th bit of a number. These operations are the backbone of bitmasking and are essential for solving advanced problems efficiently.

---

## What I Did Today

1. **Learned Get i-th Bit (Check)**

   * Concept: Use a mask `(1 << i)` and apply `n & mask` to isolate the i-th bit.
   * Two approaches:

     * `(n & (1 << i)) != 0` → returns true/false.
     * `(n & (1 << i)) >> i` → directly gives `0` or `1`.
   * Examples: `getIthBit(10, 2) → 0`, `getIthBit(10, 3) → 1`.

2. **Practiced Set i-th Bit**

   * Formula: `n | (1 << i)` → ensures the i-th bit is set to 1.
   * If the bit is already 1, the value remains unchanged.
   * Examples: `setIthBit(10, 2) → 14`, `setIthBit(5, 2) → 5`.

3. **Explored Clear i-th Bit**

   * Formula: `n & ~(1 << i)` → forces the i-th bit to 0.
   * Other bits remain intact.
   * Examples: `clearIthBit(10, 1) → 8`, `clearIthBit(5, 2) → 1`.

---

## How I Practiced

* Wrote Java programs (`GetBit`, `SetBit`, `ClearBit`) to implement each operation.
* Verified results using binary step-by-step explanations.
* Created visualization tables for `Get`, `Set`, and `Clear` to solidify understanding.

---

## Key Details & Examples (reference)

**Get i-th Bit**

```java
int mask = 1 << i;
int bit = (n & mask) >> i; // returns 0 or 1
```

**Set i-th Bit**

```java
int result = n | (1 << i);
```

**Clear i-th Bit**

```java
int result = n & ~(1 << i);
```

---

## Key Takeaways

* `Get`: isolate a bit with `n & (1 << i)`.
* `Set`: turn on a bit with `n | (1 << i)`.
* `Clear`: reset a bit with `n & ~(1 << i)`.
* Together, these form the **core toolkit** for bitmasking — useful in competitive programming, optimization, and low-level control.

---

*Prepared as part of Day 48 of #100DaysOfCode*
