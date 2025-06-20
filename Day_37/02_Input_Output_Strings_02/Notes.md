# Friendly Guide to String Input & Output in Java

## Why It Matters

Getting user input and showing output is at the heart of interactive programs. With strings, you often choose between grabbing one word or an entire sentence.

## Reading Words vs. Lines

- **`next()`**

  - Think: “Give me the next word.”
  - Stops when it sees a space, tab, or newline.
  - Good for simple prompts (like first names).

- **`nextLine()`**

  - Think: “Give me everything until I hit Enter.”
  - Captures full sentences, including spaces.
  - Perfect for full names, addresses, or sentences.

## Making It Smooth

1. **Prompt Clearly**
   Always tell the user what you expect:

   ```java
   System.out.print("Enter your full name: ");
   ```

2. **Handle the Newline**
   If you switch from `next()` to `nextLine()`, Java might skip your line. Fix it by adding an extra `nextLine()` to clear the leftover newline:

   ```java
   sc.nextLine(); // consume the leftover newline
   ```

3. **Close When Done**
   In small examples it’s optional, but in real apps do:

   ```java
   sc.close();
   ```

## Quick Tips

- If the user just presses Enter at a `nextLine()` prompt, you’ll get an empty string. Check for `""` if you don’t want blanks.
- Mixing `nextInt()`, `next()` and `nextLine()` can cause surprises—remember to clear the buffer.
- Keep your prompts on the same line as the input for a cleaner console:

  ```java
  System.out.print(">> ");
  ```

---

_Prepared for the Java Alpha Course_
