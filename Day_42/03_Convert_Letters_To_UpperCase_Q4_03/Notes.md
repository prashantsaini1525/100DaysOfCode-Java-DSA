# Making Each Word Shine: Capitalizing Words in Java Strings

## Why We Do This

Ever noticed how titles, headlines, and names look cleaner when each word starts with a capital letter? That’s called **Title Case** or **Initial Caps**. It makes text easier to read and gives it a polished look.

## The Theory Behind It

1. **Understanding Characters:** Java stores text as sequences of Unicode characters. Each char has properties—like whether it’s a letter, digit, space, or punctuation.
2. **Character Class:** Java’s `Character` class provides methods like `isLetter()`, `toUpperCase()`, and `toLowerCase()` to inspect and change characters safely.
3. **Title Case Logic:** To title-case a sentence:

   - Uppercase the very **first letter** if it’s a letter.
   - For each following character:

     - If the **previous character** was a space (or any non-letter), uppercase the current letter.
     - Otherwise, leave it lowercase (or as-is) for consistent style.

## Step-by-Step Process

1. **Check for empty or null strings**—nothing to do if there’s no text.
2. **Convert the entire string to lowercase** (optional) to ensure a uniform base.
3. **Uppercase the first valid letter.**
4. **Walk through each character:**

   - If you hit a separator (space, dash, underscore), look ahead for the next letter and uppercase it.
   - Otherwise, just append the character (lowercase or original).

## Human-Friendly Example

Imagine you have this sentence:

```
"hello-world_from java"
```

You want:

```
"Hello-World_From Java"
```

Notice how we treat `-` and `_` as boundaries too.

## How Your Code Works

Here’s how your `toUpperCase` method turns each word’s first letter into uppercase, step by step, based on your implementation:

```java
public static String toUpperCase(String str) {
    StringBuilder sb = new StringBuilder();

    // 1) Uppercase the very first character
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    // 2) Walk through the rest of the characters
    for (int i = 1; i < str.length(); i++) {
        ch = str.charAt(i);
        if (ch == ' ' && i < str.length() - 1) {
            // Found a space: keep it, then uppercase the next character
            sb.append(ch);
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        } else {
            // Not a boundary: just append as-is
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
```

**What’s happening here?**

1. **Start fresh:** You create a `StringBuilder` to collect the new characters.
2. **First-letter magic:** You grab the first character (`str.charAt(0)`), make it uppercase, and add it to `sb`.
3. **Look for word breaks:** As you loop:

   - If you hit a **space**, you know the next character should be a capital. So you:

     - Append the space itself.
     - Move `i` forward by one to the next character.
     - Uppercase that character and append it.

   - Otherwise, you just append the original character (whether letter, punctuation, or whatever).

4. **Wrap up:** Convert `sb` back to a `String` and return it.

## Why This Works

- **In-place building:** Using `StringBuilder` avoids creating new `String` objects each time.
- **Clear boundaries:** By checking for a space, you know exactly when a word ends and the next one begins.
- **Handles edges:** You only uppercase when it’s safe (i.e., there **is** a next character).

## Final Thoughts

- To be extra safe, you could first **lowercase** the whole string, so existing uppercase letters inside words don’t sneak through.
- If you want to treat other separators (like `-` or `_`) as word boundaries, just add them to the `if` check.
- This humanised logic helps students see exactly how each step transforms the text, making the concept stick!