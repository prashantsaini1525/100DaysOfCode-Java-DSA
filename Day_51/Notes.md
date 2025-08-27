# 📘 Day 51: Fast Exponentiation (Binary Exponentiation)

Today I studied **fast exponentiation (binary exponentiation)** — an essential trick to compute `a^b` in **O(log b)** time using repeated squaring and the binary expansion of the exponent. These notes explain intuition, step‑by‑step worked examples (including modular), safe code patterns in Java, complexity, pitfalls, and a short practice checklist — all in the same structured style used on previous days.

---

## What I Did Today

1. **Learnt the core idea**: read the exponent in binary, square the base each step, and multiply the result only when the current bit is `1`.
2. **Implemented iterative fast exponentiation** (`fastPow`) and **modular fast exponentiation** (`modPow`) to avoid overflow.
3. **Worked two examples** with `5^3` (plain) and `5^3 % 100` (modular) and filled trace tables to verify correctness.
4. **Added safety checks & notes** — handling `b=0`, modular normalization for negative bases, and recommendations to use `BigInteger` or modular reductions for large values.

---

## The idea (plain words)

* Write `b` in binary. Each `1` bit indicates which squared powers of `a` to include.
* Repeatedly square `base` to obtain `a^(2^k)` and shift `b` right. When the LSB of `b` is `1`, multiply `result` by `base`.

Small mental image: think of `b` as coins `{1,2,4,8,...}` — pick coins whose bits are `1`, multiply corresponding `a^(coin)`.

---

## Pseudocode (iterative — canonical)

```
result = 1
base = a
while (b > 0):
    if (b & 1) == 1:
        result = result * base
    base = base * base
    b >>= 1
return result
```

---

## Example 1 — `5^3` (plain fast exponentiation)

* `3` in binary = `11`.

Trace (brief):

* Step 1: exp=3 (LSB=1) → result=1\*5=5; base=25; exp→1
* Step 2: exp=1 (LSB=1) → result=5\*25=125; base=625; exp→0

Answer: `5^3 = 125`.

---

## Example 2 — `5^3 % 100` (modular fast exponentiation)

Pseudocode (modular):

```
result = 1 % mod
base = ((a % mod) + mod) % mod
while (b > 0):
    if (b & 1) == 1:
        result = (result * base) % mod
    base = (base * base) % mod
    b >>= 1
return result
```

Trace gives `5^3 % 100 = 25`.

---

## Java code (concise)

```java
// Iterative fast exponent (may overflow for large values)
long fastPow(long a, long b) {
    long result = 1;
    long base = a;
    while (b > 0) {
        if ((b & 1) == 1) result = result * base;
        base = base * base;
        b >>= 1;
    }
    return result;
}

// Modular fast exponent: (a^b) % mod
long modPow(long a, long b, long mod) {
    long result = 1 % mod;
    long base = ((a % mod) + mod) % mod;
    while (b > 0) {
        if ((b & 1) == 1) result = (result * base) % mod;
        base = (base * base) % mod;
        b >>= 1;
    }
    return result;
}
```

---

## Common pitfalls & tips

* `b = 0` → return `1`.
* Negative `b` not supported by integer versions (requires fractions).
* Use `modPow` or `BigInteger` to avoid overflow for very large exponents/bases.
* Normalize base for modular arithmetic: `base = ((a % mod) + mod) % mod`.
* Prefer iterative version to avoid recursion depth issues.

---

## Quick checks

* `fastPow(5,3) = 125`
* `modPow(5,3,100) = 25`
* `fastPow(3,5) = 243`
* `fastPow(2,10) = 1024`

---

## Key Takeaways

* Binary exponentiation reduces O(b) multiplication to **O(log b)**.
* Useful for number theory, cryptography, and matrix exponentiation.
* Implement modular reductions inside the loop for CP problems.

---

*Prepared as part of Day 51 of #100DaysOfCode*
