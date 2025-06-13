# 🔍 Search in a Sorted 2D Matrix

This note helps you understand how to efficiently search a value in a 2D matrix where:

- Each **row is sorted** left to right
- Each **column is sorted** top to bottom

---

### ✅ Sample Matrix

```
{10, 20, 30, 40}
{15, 25, 35, 45}
{27, 29, 37, 48}
{32, 33, 39, 50}
```

---

## Understanding the Matrix

Imagine this matrix like a grid of classrooms:

- As you move **right**, roll numbers increase.
- As you move **down**, class grades increase.

So, everything is in order both row-wise and column-wise. Our task is to find a target number quickly.

---

## 🥇 1. Brute Force (Naive Way)

🔹 Just go through every element one-by-one like scanning each room.

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        if (matrix[i][j] == target) return true;
    }
}
```

✅ **Easy to write**
❌ **Slow** for big matrices

**Time**: O(n × m)
**Space**: O(1)

---

## ⚙️ 2. Binary Search in Each Row

🔹 Each row is sorted, so apply binary search on every row:

```java
for (int i = 0; i < n; i++) {
    if (binarySearch(matrix[i], target)) return true;
}
```

✅ Good if rows are very long
❌ Still checks every row

**Time**: O(n × log m)
**Space**: O(1)

---

## 🚀 3. Staircase Search (Most Optimized)

🔹 Start from the **top-right corner**:

- If the number is **greater** than target, move **left**
- If the number is **less**, move **down**

```java
int i = 0, j = m - 1;
while (i < n && j >= 0) {
    if (matrix[i][j] == target) return true;
    else if (matrix[i][j] > target) j--;
    else i++;
}
```

✅ **Efficient and clean**
✅ **Works only if rows and columns are sorted**

**Time**: O(n + m)
**Space**: O(1)

---

## 🔁 Summary Table

| Method           | Time       | Space | Notes                        |
| ---------------- | ---------- | ----- | ---------------------------- |
| Brute Force      | O(n × m)   | O(1)  | Easy to write                |
| Row-wise Binary  | O(n log m) | O(1)  | Good if rows are big         |
| Staircase Search | O(n + m)   | O(1)  | Best for sorted 2D matrix ✅ |

---

### Final Thoughts

- Always prefer **staircase search** for sorted matrices.
- Use brute force only for learning or small inputs.
- Binary search in each row works well too, but a bit slower than the staircase method.

✅ Keep practicing and try these methods with dry runs in your notebook!

---
