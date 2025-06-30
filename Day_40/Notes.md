# 📘 Day 40: Shortest Path Calculation & String Comparison in Java

Building on string fundamentals and algorithms, today I tackled:

1. **Calculating the shortest distance** from origin using a directions string (`N`, `S`, `E`, `W`).
2. **Understanding `==` vs `equals()`** for String comparison.

---

## 🌟 Conceptual Overview

* **Shortest Path**: Imagine walking on a grid. Each character in the path string tells you to step north, south, east, or west. After all steps, you measure the straight-line (Euclidean) distance back to your starting point using Pythagoras’ theorem.

* **String Comparison**: Think of String literals in Java as shared name tags in a pool, while `new String("...")` makes a fresh name tag copy. Using `==` checks if two tags point to the same object; `equals()` checks if the names written on tags match.

---

## 🧭 Shortest Path Implementation

```java
public static float findShortestPath(String path) {
    int x = 0, y = 0;
    for (char dir : path.toCharArray()) {
        switch (dir) {
            case 'N': y++; break;
            case 'S': y--; break;
            case 'E': x++; break;
            case 'W': x--; break;
        }
    }
    return (float) Math.sqrt(x*x + y*y);
}
```

* **Time Complexity:** O(n) — one pass through the path string.
* **Space Complexity:** O(1) — only two integer counters and constant extra variables.

---

## 🔍 String Comparison: `==` vs `equals()`

```java
String a = "Tony";
String b = "Tony";
String c = new String("Tony");

System.out.println(a == b ? "Same object" : "Different objects");
System.out.println(a.equals(b) ? "Same content" : "Different content");

System.out.println(a == c ? "Same object" : "Different objects");
System.out.println(a.equals(c) ? "Same content" : "Different content");
```

* **`==`**: checks **reference equality** (memory address).
* **`equals()`**: checks **value/content equality**.

---

## 🔑 Key Takeaways

* Convert the path string to a sequence of moves, track `x, y` displacement, and compute Euclidean distance.
* Use `==` only when you need to know if two references point to the same object (rare for Strings).
* Prefer `equals()` to compare textual content reliably.
