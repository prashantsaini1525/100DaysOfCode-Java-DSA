# String Interning and StringBuffer in Java

## Why It Matters

Java gives you powerful ways to control how strings are stored and changed. Two tools to know:

- **String Pooling (`intern()`)**: Reuses identical text in memory to save space and make comparisons faster.
- **Mutable Buffers (`StringBuffer`)**: Lets you tweak text in-place, safely across multiple threads.

---

## Making the Most of the String Pool

- Whenever you write a string literal (`"Hello"`), Java keeps it in a shared pool.
- Calling `myString.intern()` checks that pool:

  1. If the text is already there, you get the original object back.
  2. If not, Java adds it and returns that new pooled object.

### Why do this?

- **Save memory** when you have lots of repeated strings.
- **Speed up** checks like `==` because you’re comparing object references, not character-by-character.

```java
String a = new String("Java");
String pooled = a.intern();
String literal = "Java";

System.out.println(pooled == literal); // true!
```

**Tip:** Only intern strings you'll reuse a lot. Don’t flood the pool with huge, one-off text.

---

## Tweaking Text Safely with StringBuffer

- `StringBuffer` is like `StringBuilder` but with built-in locks. Great when multiple threads edit the same text.
- You can:

  - `append(...)` more text
  - `insert(...)` at any spot
  - `delete(...)` chunks
  - `reverse()` the whole thing
  - Finally, `toString()` to get a normal `String`

```java
StringBuffer sb = new StringBuffer("Hi");
sb.append(" there");       // "Hi there"
sb.insert(2, ",");         // "Hi, there"
sb.reverse();                // "ereht, iH"
String result = sb.toString();
```

### When to pick it:

Use `StringBuffer` in multi-threaded code. If you’re single-threaded, `StringBuilder` is faster.

---

## Bottom Line

- `intern()` streamlines memory for identical strings and makes `==` comparisons super quick.
- `StringBuffer` gives you safe, in-place edits across threads.