# Q1 — What is x ^ x for any integer x?

## 1. Short answer

**x ^ x = 0** for any integer x.

---

## 2. Intuition (humanised)

* XOR (`^`) compares two bits and gives `1` only when the bits differ.
* When a number is XORed with itself, every corresponding bit pair is identical, so each bit becomes `0`.
* All bits → `0` ⇒ the whole number becomes `0`.

---

## 3. Single-bit truth table (useful reminder)

```
0 ^ 0 = 0
0 ^ 1 = 1
1 ^ 0 = 1
1 ^ 1 = 0   <- this is why x ^ x zeroes every position
```

---

## 4. Tiny proof (2 lines)

* For each bit position `k`, `bit_k(x) ^ bit_k(x) = 0`.
* Since every position produces `0`, the final binary is all zeros → decimal `0`.

---

## 5. Small worked examples (do these on paper)

* Example A: x = 5

```
5  = 0101
5  = 0101
5^5= 0000 = 0
```

* Example B: x = 13

```
13 = 1101
13 = 1101
13^13 = 0000 = 0
```

> **Practice:** Try x = 7 and x = 26 on paper; show binary lines and the result.

---

## 6. Quick Java test (copy-paste)

```java
int[] tests = {0, 1, 5, 13, -1, 1024};
for (int x : tests) {
    System.out.printf("%d -> %s ^ %s = %d%n",
        x,
        Integer.toBinaryString(x),
        Integer.toBinaryString(x),
        x ^ x);
}
// Expect x ^ x to always print 0
```

---

## 7. Why this matters (interview / thinking tip)

* XOR is reversible and cancels duplicates: `a ^ a = 0`, `a ^ 0 = a`.
* This property is used in many tricks (e.g., find a unique number when others are paired, swap using XOR).
* Habit: when you see `^` with identical operands, you can answer `0` instantly.

---

## 8. Short practice tasks (write in notebook & solve)

* Do the bit math for `x = 7` and `x = 26` on paper.
* Explain in one sentence why `x ^ x = 0` (say it out loud or teach someone).
* Compute `(x ^ x) ^ y` and show it equals `y`.

---

*Tip:* Keep this page as `notes.md` for Q1 so you can refer back while solving related XOR problems.

---

## 9. Conclusion

* **Quick takeaway:** `x ^ x = 0` always — XOR cancels identical bits.
* **Why it matters:** This simple identity is the base for many bit tricks (finding uniques, swapping without extra memory, parity checks). Keep it as a mental shortcut.
* **Practice tip:** Whenever you see an expression with repeated XORs, try cancelling pairs first — it often reduces the problem immediately.

*Copy this conclusion into your physical notebook under Q1 to finish the page.*
