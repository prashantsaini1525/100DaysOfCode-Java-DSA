# 📘 Day 37: Java Strings Fundamentals – What & I/O

Welcome to Day 37 of my #100DaysOfCode journey! Today I dove into the **building blocks** of Java Strings, focusing on:

1. **What is a String?**
2. **Reading and writing Strings** from the console.

I’ll explore string length, concatenation, and more in the upcoming days.

---

## 🌟 1. What Is a String?

A **String** in Java is a high‑level representation of text—a sequence of characters. Think of it like a sentence on a page. Under the hood:

- It’s backed by a **`char[]` array**, where each slot holds a UTF‑16 code unit.
- Stored in the **String Pool** when created as a literal, allowing reuse and memory savings.
- **Immutable**: Once you create a `String`, you cannot change its contents. Any modification (concatenation, replacement) produces a new `String` object.

```java
// Literal vs. Constructor
String literal = "hello";  // interned in pool
String constructed = new String("hello"); // new object in heap
```

**Why immutability?**

- **Thread safety**: Multiple threads can share a `String` safely.
- **Efficient hashing**: Hash code can be cached for fast lookups (e.g., as keys in a `HashMap`).

> **Heads‑up**: Excessive use of `+` for concatenation creates many temporary `String` objects—use `StringBuilder` for heavy text assembly later.

---

## ⏮️ 2. Input & Output with `Scanner`

Getting text into and out of your program is essential. Java’s `Scanner` makes it simple:

### a) Reading a Single Word with `next()`

```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter your username: ");
String user = sc.next();   // reads up to the first space or newline
System.out.println("Welcome, " + user + "!");
```

- Stops at whitespace, ideal for single tokens like usernames or keywords.

### b) Reading Full Lines with `nextLine()`

```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter your full address: ");
String address = sc.nextLine();  // reads everything until newline
System.out.println("Address stored: " + address);
```

- Captures spaces and entire sentences—great for paragraphs, addresses, or long inputs.

> **Pro Tip**: After `sc.nextInt()` or other `nextX()`, call `sc.nextLine()` once to consume the leftover newline before using `nextLine()`.

---

## 🔜 What’s Next?

Tomorrow (Day 38) we’ll explore **String length** and dive into methods like `length()`, handling Unicode, and more. Stay tuned!

_Happy coding with strings!_
