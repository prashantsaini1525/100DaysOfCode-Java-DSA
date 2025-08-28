# Q3 — Add 1 to an integer using Bit Manipulation

## 1. Short answer (one line)

**Two useful ways:**

* One-line identity: `x + 1 == -~x`.
* Bitwise carry method: flip trailing 1s to 0 until you find a 0, then flip that 0 to 1.

---

## 2. Intuition (humanised)

* Adding 1 works like this on bits from right to left:

  * If LSB = 0 → just flip it to 1 and stop.
  * If LSB = 1 → it becomes 0 and carry moves to the next bit (repeat).
* So visually: **flip all trailing ones to zeros, then flip the next zero to one**.
* The identity `-~x` comes from `~x = -x - 1` ⇒ `-~x = x + 1` (two’s complement algebra).

---

## 3. Tiny algebraic proof (1 line)

Start from `~x = -x - 1`. Negate both sides → `-~x = x + 1`. So `-~x` equals `x + 1` for two’s-complement ints.

---

## 4. Bit-by-bit algorithm (how to think & implement)

1. Set `mask = 1`.
2. While `(x & mask) != 0` (current bit is 1):

   * `x ^= mask`  // flip that 1 to 0 (carry)
   * `mask <<= 1` // move carry to next bit
3. After loop: `x ^= mask` // flip the first 0 to 1 → done

This exactly simulates binary carry propagation.

---

## 5. Small worked examples (do these on paper)

**Example A — x = 5**

```
5 = 00000101
LSB=1 -> flip to 0, carry -> 00000100
Next bit=0 -> flip to 1, stop -> 00000110 (6)
```

Algebraic check: `-~5 = 6`.

**Example B — x = 7**

```
7 = 00000111
Flip trailing ones -> 00000000 and carry out -> 00001000 (8)
```

Edge case: `x = -1` (all ones in two’s complement) → adding 1 gives 0.

---

## 6. Your implementation (your code)

```java
public class code {

    public static int addOne(int n) {
        int m = 1;
        while ((n & m) > 0) {
            n = n ^ m; // toggle the bits (turn trailing 1 to 0)
            m = m << 1; // move mask left
        }
        n = n ^ m; // toggle the rightmost 0 bit to 1
        return n;
    }

    public static void main(String[] args) {
        int n = 15; // try other values too
        System.out.println(addOne(n));
    }
}
```

*Notes on your code:*

* Correct and follows the carry-simulation approach.
* Use `(n & m) != 0` instead of `> 0` to be explicit and handle sign bits safely.
* Be cautious if `m` shifts beyond 31 for `int` (add a guard in production).

---

## 7. Apna College Solution (included and explained)

**One-line identity (concise):**

```java
System.out.println(x + " + 1 is " + -~x);
```

* Works because `-~x` equals `x + 1` by two’s-complement algebra.

**Bit-by-bit (same as yours, tidy version):**

```java
int addOneByBits(int x) {
    int mask = 1;
    while ((x & mask) != 0) {
        x ^= mask;    // flip 1 -> 0 (carry)
        mask <<= 1;   // next bit
    }
    x ^= mask;        // flip first 0 -> 1
    return x;
}
```

* This is identical in logic to your method and is easy to read.

---

## 8. Quick Java test (copy-paste & run)

```java
int[] tests = {0, 1, 5, 7, 15, -1, Integer.MAX_VALUE - 1};
for (int x : tests) {
    System.out.printf("x=%d [%s] ; x+1=%d [%s] ; -~x=%d [%s] ; addOneByBits=%d [%s]
",
        x, String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0'),
        x+1, String.format("%32s", Integer.toBinaryString(x+1)).replace(' ', '0'),
        -~x, String.format("%32s", Integer.toBinaryString(-~x)).replace(' ', '0'),
        addOneByBits(x), String.format("%32s", Integer.toBinaryString(addOneByBits(x))).replace(' ', '0')
    );
}
```

---

## 9. Important notes & pitfalls

* `-~x` is clever and compact but less explicit; use when comfortable with two's-complement identities.
* The loop method is clearer for interviews — it shows you understand carries.
* Watch out for shifting beyond bit-width (e.g., `mask <<= 1` when mask becomes 0 for large shifts). Add safeguards if needed.
* Overflow: adding 1 to `Integer.MAX_VALUE` wraps to `Integer.MIN_VALUE` in Java — be aware of signed overflow.

---

## 10. Practice tasks (short)

* On paper, run `addOneByBits` for `x = 13` and `x = 15` with 8-bit lines and show each flip.
* Test your function on negatives (e.g., `x = -4`) and inspect 32-bit binary output.
* Modify your code to return long and test `mask` shifting safety for larger widths.

---

## 11. Conclusion (one-line)

Adding 1 can be a compact algebraic trick (`-~x`) or an explicit carry-simulation (flip trailing ones), both teach the same bit-level idea — practice both so you can explain either clearly in interviews.

*Copy this canvas note into your notebook under Q3 and paste your hand-work below for checking.*
