# Q4 — Convert Uppercase to Lowercase (and vice versa) using Bits

---

## 1. Short answer (one line)

* **Upper → Lower:** `ch | ' '` (OR with space, 0x20)
* **Lower → Upper:** `ch & '_'` (AND with underscore, 0x5F)

---

## 2. Intuition (humanised)

* In ASCII:

  * `'A'` = 65 (0100 0001)
  * `'a'` = 97 (0110 0001)
* Difference = **32 (2⁵)** → just one bit apart.
* Space `' '` = 32 = 0010 0000 → sets the 5th bit to 1.
* Underscore `'_'` = 95 = 0101 1111 → clears the 5th bit.
* Trick:

  * OR with `' '` → guarantees lowercase (bit set).
  * AND with `'_'` → guarantees uppercase (bit cleared).

---

## 3. Why it works

* Uppercase letters = 65–90 (`010x xxxx`)
* Lowercase letters = 97–122 (`011x xxxx`)
* Only difference is bit-5.
* Using `' '` or `'_'` avoids remembering numeric constants, just uses ASCII characters.

---

## 4. Small worked examples (do these on paper)

**Example A — Upper → Lower**

```
ch = 'B' = 0100 0010
' ' =       0010 0000
Result =    0110 0010 = 'b'
```

**Example B — Lower → Upper**

```
ch = 'd' = 0110 0100
'_' =      0101 1111
Result =   0100 0100 = 'D'
```

---

## 5. Your Java solution (with both cases)

```java
public class code {
    public static void main(String[] args) {
        char ch = 'Z';

        if (ch >= 'A' && ch <= 'Z') {
            // Uppercase to Lowercase
            char ans = (char) (ch | ' ');
            System.out.println("Lowercase: " + ans);
        } else if (ch >= 'a' && ch <= 'z') {
            // Lowercase to Uppercase
            char ans = (char) (ch & '_');
            System.out.println("Uppercase: " + ans);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
```

---

## 6. Notebook exercises (practice)

* Convert `'C'` → `'c'` manually with OR `' '`.
* Convert `'x'` → `'X'` manually with AND `'_'`.
* Test with `'A'`, `'Z'`, `'a'`, `'z'` and verify outputs.

---

## 7. Important notes & pitfalls

* Works only for alphabetic characters; numbers/symbols stay unchanged.
* Be mindful of character encoding (assumes ASCII/UTF-16 lower 7 bits are same as ASCII).
* This bit trick is very common in compilers and interview puzzles.

---

## 8. Conclusion (one-line)

Uppercase and lowercase letters differ only by one bit — set it with OR `' '` to lowercase, clear it with AND `'_'` to uppercase. Practice both directions to master the ASCII bit trick.
