# Mastering String Replacement in Java

## Why Replace Strings?

When working with text, you often need to swap out certain characters or patterns—like fixing typos, censoring words, or formatting data. Java offers several handy methods to do just that.

## 1. `replace(char oldChar, char newChar)`

- **What it does:** Creates a new string where every occurrence of a specific character is swapped.
- **Use when:** You need to change **single characters** globally.

**Example:**

```java
String text = "happy coding";
String result = text.replace(' ', '-');
// result: "happy-coding"
```

## 2. `replace(CharSequence target, CharSequence replacement)`

- **What it does:** Finds every exact **sequence** of characters (a literal word or phrase) and replaces it.
- **Use when:** You want to swap whole words or substrings without regex.

**Example:**

```java
String text = "Java is fun. Java is powerful.";
String result = text.replace("Java", "Python");
// result: "Python is fun. Python is powerful."
```

## 3. `replaceAll(String regex, String replacement)`

- **What it does:** Uses a **regular expression** to find patterns and replace **all** matches.
- **Use when:** You need pattern-based replacements—like removing digits or complex formatting.

**Example:**

```java
String text = "Phone: 123-456-7890";
String result = text.replaceAll("\\d", "*");
// result: "Phone: ***-***-****" (all digits become asterisks)
```

## 4. `replaceFirst(String regex, String replacement)`

- **What it does:** Similar to `replaceAll()`, but only swaps the **first** match of the regex pattern.
- **Use when:** You only want to change the first occurrence of something.

**Example:**

```java
String text = "apple banana apple";
String result = text.replaceFirst("apple", "orange");
// result: "orange banana apple"
```

## Quick Tips & Pitfalls

- **Immutability:** None of these methods change the original string—they return a **new** one.
- **Regex Gotchas:** `replaceAll` and `replaceFirst` treat the search string as a regex. Escape special characters (like `.` or `\`) with `\\.`.
- **Performance:** Simple `replace(char, char)` and literal `replace(CharSequence, CharSequence)` run in O(n) time. Regex-based methods can be slower—use them only when needed.

---

_Prepared for the Java Alpha Course_
