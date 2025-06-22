# 📘 Day 38‑b: String Concatenation in Java

Continuing Day 38’s deep dive, today I explored **joining strings** using two core methods, then looked ahead to performance strategies.

---

## ➕ String Concatenation Methods

### 1. Using the + Operator

```java
String first = "Prashant";
String last  = "Saini";
String full  = first + " " + last;
System.out.println(full); // Prashant Saini
```

* **Pros**: Highly readable and concise.
* **Cons**: Creates a new String object for each +, which can add up in loops.

### 2. Using `concat()` Method

```java
String full2 = first.concat(" ").concat(last);
System.out.println(full2); // Prashant Saini
```

* **Pros**: Method chaining option; readability similar to +.
* **Cons**: Under the hood, still allocates new objects on each call.

---

## 🚀 Performance Considerations

* For **lightweight** or one‑off joins, + and `concat()` are fine.
* For **heavy** concatenation (e.g., in loops), switch to **StringBuilder**:

  ```java
  StringBuilder sb = new StringBuilder();
  for (String part : parts) {
      sb.append(part);
  }
  String result = sb.toString();
  ```
* `StringBuilder` uses a mutable buffer, minimizing temporary object creation.

---

## 🔑 Key Takeaways

* Use + for clarity in simple cases.
* Use `concat()` for explicit method‑based joins.
* When performance matters, refactor to **StringBuilder** to avoid repeated allocations.

**Next (Day 39)**: Compare **StringBuilder** vs **StringBuffer**, exploring their thread-safety differences, and tackle classic string interview problems like reversing strings and checking for palindromes.

*Happy concatenating!*
