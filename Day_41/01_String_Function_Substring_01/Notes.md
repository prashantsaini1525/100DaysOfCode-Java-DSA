# Mastering `StringBuilder`: Fast & Flexible Text Building

## 1. What Is `StringBuilder`?

- Think of `StringBuilder` as a flexible string that you can change without making a brand-new one each time.
- Great for when you’re putting together text step by step, like making sentences in a loop.

## 2. Why Pick `StringBuilder` Over `String`?

- **Speedy Editing:** You can add, remove, or change parts right away. No slow copying.
- **Less Memory Waste:** It uses one growing buffer instead of piles of temporary `String` objects.
- **Lots of Tools:** Easy methods to do common tasks: `append()`, `insert()`, `delete()`, `reverse()`, and more.

## 3. How to Start One

```java
// A fresh builder that can hold 16 chars by default
StringBuilder sb1 = new StringBuilder();

// Start with some text
StringBuilder sb2 = new StringBuilder("Hello");

// Reserve space for 100 chars upfront
StringBuilder sb3 = new StringBuilder(100);
```

## 4. Handy Methods

| Action                 | Method Example             | What It Does                             |
| ---------------------- | -------------------------- | ---------------------------------------- |
| Add text               | `sb.append("Java")`        | Puts info at the end                     |
| Put text in the middle | `sb.insert(5, "Cool")`     | Slides text into a spot                  |
| Remove a piece         | `sb.delete(3, 7)`          | Cuts out characters from index 3 up to 6 |
| Remove one character   | `sb.deleteCharAt(2)`       | Cuts out the char at index 2             |
| Swap out text          | `sb.replace(0, 4, "Good")` | Replaces chars 0–3 with new text         |
| Flip it                | `sb.reverse()`             | Turns "abc" into "cba"                   |
| Lock in final result   | `sb.toString()`            | Makes a normal, unchangeable String      |
| See length             | `sb.length()`              | Shows how many characters you have       |
| Check capacity         | `sb.capacity()`            | Shows how much space is reserved so far  |

## 5. Simple Example

Imagine you want to build the alphabet from a to z:

```java
StringBuilder sb = new StringBuilder(26); // room for 26 letters
for (char ch = 'a'; ch <= 'z'; ch++) {
    sb.append(ch);
}
String result = sb.toString();
System.out.println(result); // prints: abcdefghijklmnopqrstuvwxyz
```

- **Step by step:**

  1. You make space for 26 letters.
  2. Each loop adds one letter without making a whole new string.
  3. Finally, `toString()` gives you the full string.

- **Why it’s good:** This takes linear time (O(26)), instead of slower quadratic time if you used `String` concatenation in a loop.

## 6. When to Use What

- **`String`**: When your text is fixed or you need built-in safety for multiple threads.
- **`StringBuilder`**: When you’re in a single thread and changing text a lot.
- **`StringBuffer`**: Like `StringBuilder` but thread-safe (a bit slower because it locks).

## 7. Quick Takeaways

- Use `StringBuilder` to speed up many small text changes.
- Save memory by reusing the same buffer.
- Choose the right tool for your threading needs.

---

_Prepared for the Java Alpha Course_
