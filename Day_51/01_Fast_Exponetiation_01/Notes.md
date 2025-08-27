# Fast Exponentiation (Binary Exponentiation) — Canvas Notes

> Compact, humanised, notebook-style explanation with two worked examples (both using `5^3`).

---

## 1. Short definition

Fast exponentiation computes `a^b` in **O(log b)** by using the binary form of the exponent and repeated squaring instead of multiplying `a` by itself `b` times.

---

## 2. The idea (in plain words)

* Write `b` in binary. Each `1` bit tells you which powers of `a` to multiply.
* Build `a^(2^0), a^(2^1), a^(2^2), ...` by squaring `base` each step.
* Multiply `result` by `base` only when the current bit of `b` is `1`.

One small mental image: think of `b` as a set of coins with values `{1,2,4,8,...}`. To make `b` you pick some coins; pick the corresponding `a^(coin)` and multiply them.

---

## 3. Pseudocode (iterative — recommended)

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

* `(b & 1)` checks the lowest bit of `b`.
* `base` becomes `a^(2^k)` at loop iteration `k`.

---

## 4. Example 1 — Compute `5^3` (plain fast exponentiation)

**Goal:** compute `5^3`.

* `3` in binary = `11` (bits from LSB → MSB: `1`, `1`).

Start:

```
result = 1
base = 5
exp = 3
```

Trace table (copy to notebook):

| Step | exp (dec) | exp (bin) | LSB bit |         Action (if 1) | result | base (after squaring) |
| ---- | --------: | --------: | ------: | --------------------: | -----: | --------------------: |
| 1    |         3 |        11 |       1 |   result = 1 \* 5 = 5 |      5 |                    25 |
| 2    |         1 |         1 |       1 | result = 5 \* 25 =125 |    125 |                   625 |
| End  |         0 |         0 |       - |                  stop |    125 |                     - |

**Answer:** `5^3 = 125`.

> Notebook tip: write the short sentence — “include `base` into `result` when the current bit = 1”.

---

## 5. Example 2 — Compute `5^3 % 100` (modular fast exponentiation)

**Why modular?** In many problems we need `a^b % mod`. We reduce after each multiply/square to avoid overflow.

Pseudocode (modular):

```
result = 1 % mod
base = (a % mod + mod) % mod
while (b > 0):
    if (b & 1) == 1:
        result = (result * base) % mod
    base = (base * base) % mod
    b >>= 1
return result
```

Use `a = 5`, `b = 3`, `mod = 100`.

Start:

```
result = 1
base = 5 % 100 = 5
exp = 3
```

Trace table (copy to notebook):

| Step | exp (dec) | LSB bit |                       Action (if 1) | result (mod 100) | base (after squaring, mod 100) |
| ---- | --------: | ------: | ----------------------------------: | ---------------: | -----------------------------: |
| 1    |         3 |       1 |          result = (1 \* 5) %100 = 5 |                5 |                (5\*5)%100 = 25 |
| 2    |         1 |       1 | result = (5 \* 25)%100 = 125%100=25 |               25 |    (25\*25)%100 = 625%100 = 25 |
| End  |         0 |       - |                                stop |               25 |                              - |

**Answer:** `5^3 % 100 = 25`.

> Notebook tip: after modular steps you might see base repeating (25 here). That's normal — we always reduce with `% mod`.

---

## 6. Why this saves time

* Each loop halves `b` → number of iterations \~ number of bits in `b` = `O(log b)`.
* We only do one multiply for `result` when needed, and one squaring per iteration.

Complexity: **O(log b)** time, **O(1)** extra space.

---

## 7. Java code (iterative + modular)

```java
// Iterative fast power (may overflow for large values)
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

// Modular fast power: (a^b) % mod
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

## 8. Common pitfalls & tips

* `b = 0` → returns `1` (by convention in programming).
* Negative `b` values need fractional results — not covered by integer versions.
* Use modular version to avoid overflow and when problems ask for results modulo `mod`.
* For very large results use `BigInteger` in Java.

---

## 9. Quick summary (one-liner to paste in notebook)

> "Fast exponentiation: read exponent in binary, square base each step, multiply result when bit=1 — runs in O(log b)."

---

## 10. Ready-to-copy checklist for practice

* [ ] Convert exponent `b` to binary (or loop with `b >>= 1`).
* [ ] Initialize `result = 1`, `base = a`.
* [ ] For each bit: if bit=1 → multiply result; square base; shift `b`.
* [ ] Use modular reductions if required.

---

## 12. Key Points

* Time complexity: **O(log b)** (number of bits in `b`).
* Use modular reduction `( % mod )` inside the loop to avoid overflow and for modulo problems.
* Iterative version is recommended (no recursion depth issues).
* Handles `b = 0` (returns `1`). Negative exponents need fraction handling — not covered here.

---

## 13. Use Cases

* Fast computation of large powers in algorithms and number theory.
* Modular exponentiation in cryptography (RSA, Diffie–Hellman).
* Matrix exponentiation (use repeated squaring on matrices for linear recurrences).

---

## Conclusion

Fast exponentiation is a small but powerful trick: **read the exponent in binary, square the base each step, and multiply the result only when the bit is 1**. This turns an O(b) process into O(log b) and is essential for performance-critical code.
