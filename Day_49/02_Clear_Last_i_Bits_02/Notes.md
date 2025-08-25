# Clear Last i Bits in Java

## Introduction

Clearing the **last i bits** means setting the **i least-significant bits** (rightmost i bits) of a number to `0`, while keeping the higher bits unchanged. This is useful when you want to remove small-value noise or align numbers to multiples of powers of two.

---

## Intuition (in one line)

Make a mask that has **zeros** in the last `i` positions and **ones** everywhere else, then `AND` the mask with the number.

---

## Formula / Short Syntax

```
mask = ~((1 << i) - 1)
result = num & mask
// Alternative: result = num & (~0 << i)
```

* `(1 << i) - 1` creates a value with `i` ones at the LSB (e.g., i=3 -> `000...0111`).
* `~(...)` flips to give zeros in the last `i` bits and ones elsewhere.
* `num & mask` forces the last `i` bits of `num` to zero.

---

## Why this works (step-by-step)

1. `1 << i` shifts `1` left by `i` places. Example i=3 → `00001000`.
2. Subtract `1` → `(1 << i) - 1` → `00000111` (i ones at LSB).
3. Negate with `~` → `...11111000` (zeros in last i bits).
4. `num & ~((1 << i) - 1)` clears last i bits of `num` and leaves other bits unchanged.

---

## Example Walkthroughs (8-bit view)

### Example A

```
num = 15  -> 00001111
i   = 1
(1<<1)-1 = 00000001
~(...)    = 11111110
result = 00001111 & 11111110 = 00001110 -> 14
```

Explanation: Clearing last 1 bit changes `1111` to `1110` (15 → 14).

### Example B

```
num = 15  -> 00001111
i   = 2
(1<<2)-1 = 00000011
~(...)    = 11111100
result = 00001111 & 11111100 = 00001100 -> 12
```

### Example C

```
num = 15  -> 00001111
i   = 3
(1<<3)-1 = 00000111
~(...)    = 11111000
result = 00001111 & 11111000 = 00001000 -> 8
```

---

## Compact Visualization Table (8-bit)

| num (dec) | num (binary) |  i  | mask (`~((1<<i)-1)`) | result (binary) | result (dec) |
| --------: | :----------- | :-: | :------------------: | :-------------: | -----------: |
|        15 | `00001111`   |  1  |      `11111110`      |    `00001110`   |           14 |
|        15 | `00001111`   |  2  |      `11111100`      |    `00001100`   |           12 |
|        15 | `00001111`   |  3  |      `11111000`      |    `00001000`   |            8 |
|         5 | `00000101`   |  2  |      `11111100`      |    `00000100`   |            4 |

---

## Java Snippets (clean, minimal)

Use the robust version with safety checks in real code.

```java
// Simple version (works when i in reasonable range)
int clearLastIBits(int num, int i) {
    return num & (~((1 << i) - 1));
}

// Safer version (handles edge cases for Java 32-bit int)
int clearLastIBitsSafe(int num, int i) {
    if (i <= 0) return num;          // nothing to clear
    if (i >= 32) return 0;           // clears all bits in 32-bit int
    int mask = ~((1 << i) - 1);
    return num & mask;
}
```

---

## Edge Cases & Tips

* `i = 0` → result = `num` (no bits cleared).
* `i >= 32` (for Java `int`) → typical safe behaviour: return `0` (all bits cleared). Avoid shifting by `>=32` in Java directly; check `i` first.
* Alternative mask: `(~0) << i` or `(-1) << i` produce the same mask but be careful with language-specific behavior.
* Use this when you need to round a number down to a multiple of `2^i`.

---

## Use Cases

* Clear low-order bits to align addresses or sizes (e.g., align to 8-byte boundary).
* Remove fractional bits when using fixed-point representations.
* Prepare a number before setting new lower bits.

---

## Key Takeaway (one line)

To clear the last `i` bits: `num & (~((1 << i) - 1))` — make a mask with zeros in LSB positions and AND it with the number.

---

## Short Checklist (copy to your notebook)

* Build `(1<<i)-1` → `i` ones at LSB.
* Negate `~(...)` → zeros at LSB, ones elsewhere.
* AND with `num` → last `i` bits become 0.

---

## Conclusion

This is a small but powerful bit-trick. Memorize the mask pattern and remember to guard against shifting by too many bits in real code.
