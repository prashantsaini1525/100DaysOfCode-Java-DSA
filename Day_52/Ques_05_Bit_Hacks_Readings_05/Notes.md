# Q5 — A Good Read: Hacks Using Bits

---

## 1. Short answer (one line)

* Bit manipulation isn’t just theory — it’s full of small hacks that save time and memory. This question is about exploring such **clever tricks**.

---

## 2. Intuition (humanised)

* Computers work natively with bits, so many problems can be solved faster if we think in terms of 0/1 operations.
* Instead of conditionals (`if/else`) or loops, bit hacks often use **AND, OR, XOR, shifts** to do the same work in one or two CPU instructions.
* These tricks are widely used in compilers, cryptography, operating systems, and competitive programming.

---

## 3. Classic Bit Hacks to Know

1. **Check if a number is even/odd**

   ```
   odd  if (x & 1) == 1
   even if (x & 1) == 0
   ```

2. **Swap two numbers without a temp**

   ```
   a = a ^ b;
   b = a ^ b;
   a = a ^ b;
   ```

3. **Clear lowest set bit**

   ```
   x & (x - 1)
   ```

   → drops the rightmost 1. Useful for counting set bits.

4. **Isolate lowest set bit**

   ```
   x & -x
   ```

   → extracts the rightmost 1 as a power of two.

5. **Check if power of 2**

   ```
   (x > 0) && ((x & (x - 1)) == 0)
   ```

6. **Toggle case of a letter**

   ```
   ch ^ (1 << 5)
   ```

   → flips between uppercase and lowercase.

7. **Absolute value without branch**

   ```
   (x ^ (x >> 31)) - (x >> 31)
   ```

8. **Modulo by power of 2**

   ```
   x % (2^k) == x & ((1 << k) - 1)
   ```

---

## 4. Worked examples (do these on paper)

**Example A — Clear lowest set bit**

```
x = 12 (1100)
x-1 = 11 (1011)
x & (x-1) = 1000 (8)
```

**Example B — Isolate lowest set bit**

```
x = 12 (1100)
-x (two’s comp) = 0100
x & -x = 0100 (4)
```

---

## 5. Why these are useful

* Faster than normal arithmetic/loops.
* Help in solving problems like:

  * Counting set bits (Brian Kernighan’s algorithm).
  * Generating subsets using masks.
  * Quick checks for properties (even/odd, power of two).
* Frequently asked in coding interviews.

---

## 6. Quick Java snippet (test a few hacks)

```java
public class BitHacks {
    public static void main(String[] args) {
        int x = 12;
        System.out.println("x is even? " + ((x & 1) == 0));
        System.out.println("Clear lowest set bit: " + (x & (x - 1)));
        System.out.println("Isolate lowest set bit: " + (x & -x));
        System.out.println("Is power of 2? " + ((x > 0) && ((x & (x - 1)) == 0)));
    }
}
```

---

## 7. Notebook exercises (practice)

* Compute `(x & (x-1))` for `x = 7, 10, 16`.
* Show why `x & -x` always gives the lowest set bit.
* Try the swap hack with numbers `a=5, b=9`.
* Verify the modulo trick: compare `x % 8` vs `x & 7`.

---

## 8. Conclusion (one-line)

Bit hacks are tiny patterns that use simple operators (`&, |, ^, <<, >>`) to achieve big results — they’re the “shortcuts” every programmer should know, especially for interviews and competitive coding.

---

*Tip:* Keep a dedicated page in your notebook listing these hacks — they’ll come in handy for almost every bit manipulation problem.
