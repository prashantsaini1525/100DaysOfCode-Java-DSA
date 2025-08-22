# 📘 Day 46: Exploring Bitwise NOT, OR, and XOR in Java

Today I continued with **Bit Manipulation** and focused on three fundamental operators: **NOT (\~)**, **OR (|)**, and **XOR (^)**. These operators form the backbone of many low-level algorithms, masking operations, and performance optimizations in Java.

---

## What I Did Today

1. **Learned Bitwise NOT (`~`)**

   * Flips every bit in a number (1 → 0, 0 → 1).
   * Equivalent to `-(x + 1)` in Java.
   * Explored examples like `~0 = -1` and `~5 = -6`.
   * Understood its role in **inverting flags** and **resetting bits**.

2. **Practiced Bitwise OR (`|`)**

   * Sets a bit to `1` if either operand’s bit is `1`.
   * Worked through examples such as `5 | 6 = 7` and `5 | 3 = 7`.
   * Learned how OR is useful for **setting specific bits** and **combining multiple flags**.

3. **Explored Bitwise XOR (`^`)**

   * Sets a bit to `1` only if the operand bits differ.
   * Saw outputs like `5 ^ 6 = 3` and `5 ^ 3 = 2`.
   * Learned practical use cases: **toggling bits**, **swapping values without temp variables**, and **parity checks**.

---

## How I Learned

* Revisited theory for each operator with clear definitions and formulas.
* Wrote Java programs (`BinaryNot`, `BinaryOr`, `BinaryXor`) to test behavior.
* Verified results with binary step-by-step breakdowns.
* Focused on real-world use cases like **masking**, **flag management**, and **bit toggling**.

---

## Key Takeaways

* `~` (NOT): Inverts every bit → useful for complement operations.
* `|` (OR): Turns bits on → great for setting and merging.
* `^` (XOR): Highlights differences → handy for toggling and parity logic.

Mastering these operators brings me closer to solving advanced bit manipulation problems with confidence.

---

*Prepared as part of Day 46 of #100DaysOfCode*