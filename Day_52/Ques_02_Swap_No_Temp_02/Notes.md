# Q3 — Add 1 to an integer using Bit Manipulation

## 1. Short answer (one line)

You can add 1 to an integer using bit tricks. Two neat ways:

* Algebraic trick: `x + 1 == -~x` (because `~x = -x - 1`).
* Bit-by-bit method: flip trailing 1s to 0s until you find a 0, then flip that 0 to 1.

---

## 2. Intuition (humanised)

* Adding 1 to a binary number changes bits from the right:

  * If the least significant bit (LSB) is 0 → it becomes 1 and we stop.
  * If LSB is 1 → it becomes 0 and we carry to the next bit, repeating the process.
* So adding 1 is basically: **flip trailing ones to zeros, then flip the first zero to one**.
* The algebraic identity `~x = -x - 1` rearranges to `-~x = x + 1`, giving a one-shot expression.

---

## 3. Tiny proof of identity (algebraic)

Start from the standard two's-complement identity:

```
~x = -x - 1
```

Negate both sides:

```
-~x = x + 1
```

So `-~x` equals `x + 1` for two's-complement integers.

---

## 4. Bitwise step-by-step method (manual algorithm you should understand)

Goal: implement the "flip trailing ones" idea.

Algorithm (human steps):

1. Set a mask = 1 (points to LSB).
2. While (num & mask) != 0  → the current bit is 1:

   * Flip that bit (num ^= mask) which turns it to 0.
   * Move mask left by 1 (mask <<= 1) to move carry to next bit.
3. After loop, num ^= mask  // flip first zero (or a new bit) to 1; done.

This exactly simulates binary addition carry propagation.

---

## 5. Worked examples (do these on paper)

Example A: x = 5 (8-bit view)

```
5 = 00000101
Add 1:
LSB=1 -> flip to 0, carry -> 00000100
Next bit=0 -> flip to 1, stop -> 00000110 (6)
```

Algebraic: `-~5 = 6` → check in code.

Example B: x = 7 (8-bit view)

```
7 = 00000111
Add 1:
flip trailing ones -> 00000111 -> 00000000 and carry beyond current bits -> 00001000 (8)
```

The loop flips three 1s to 0s then flips the next 0 to 1.

Edge case: x = -1 (all ones in two's complement, 32 bits)

* `-1 + 1 = 0`. The identities still hold, but watch for fixed bit-width interpretation in binary prints.

---

## 6. Java snippets (copy-paste & try)

### A. One-line trick (use with care — concise!)

```java
int plusOne(int x) {
    return -~x;   // equals x + 1
}
```

### B. Bit-by-bit (explicit, good to understand carry)

```java
int addOneByBits(int x) {
    int mask = 1;
    while ((x & mask) != 0) {   // while current bit is 1
        x ^= mask;              // flip it to 0 (carry)
        mask <<= 1;             // move to next bit
    }
    x ^= mask;                  // flip first 0 to 1
    return x;
}
```

*Note:* Check `mask` shifting limits in Java (shifting beyond 31 bits for int). For production use handle width and overflow explicitly.

---

## 7. Quick Java test to verify (print binaries too)

```java
public static void main(String[] args) {
    int[] tests = {0, 1, 5, 7, -1, 1023};
    for (int x : tests) {
        System.out.printf("x=%d [%s] ; x+1=%d [%s] ; -~x=%d [%s] ; addOneByBits=%d [%s]\n",
            x, String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0'),
            x+1, String.format("%32s", Integer.toBinaryString(x+1)).replace(' ', '0'),
            -~x, String.format("%32s", Integer.toBinaryString(-~x)).replace(' ', '0'),
            addOneByBits(x), String.format("%32s", Integer.toBinaryString(addOneByBits(x))).replace(' ', '0')
        );
    }
}
```

---

## 8. Important notes & pitfalls

* The one-line `-~x` uses two's-complement identities — it's clever but less explicit; use it when you know the identity.
* The bit-by-bit method shows exactly how carries propagate — great for interviews and deep understanding.
* Watch out for integer overflow: adding 1 to `Integer.MAX_VALUE` wraps to `Integer.MIN_VALUE` in Java.
* If you print binary for negative numbers, use 32-bit formatting (`Integer.toBinaryString`) to see all bits.

---

## 9. Practice tasks (short)

* On paper, add 1 to `x = 13` and `x = 15` (write 8-bit lines showing the flips).
* Try `addOneByBits` with `x = 255` and `i = 8` bits visual to see multi-bit carry.
* Write tests comparing `-~x` and `addOneByBits(x)` for a range of values (0..100) to build confidence.

---

## 10. Conclusion (one-line)

Adding 1 is either the simple identity `-~x` or an explicit carry-simulation that flips trailing ones until the first zero — both are valid; the loop method teaches the internal bit behavior.

*Copy this block into your notebook under Q3. When you're ready, try the quick examples on paper and paste your work here — I'll check it and then we'll move to Q4.*
