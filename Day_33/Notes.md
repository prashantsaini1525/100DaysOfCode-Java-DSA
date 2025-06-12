# Diagonal Sum in a 2D Array: Explanation and Approach (Brute Force vs Optimized)

This document explains both the brute-force and optimized approaches for calculating the sum of diagonals in a square matrix using Java. These notes align with the two implementations found in your `.java` file.

---

## 1. Problem Overview

We aim to calculate:

1. **Primary diagonal sum**: Elements where `i == j`
2. **Secondary diagonal sum**: Elements where `i + j == n - 1`
3. **Combined diagonal sum**: Sum of both, but if matrix has odd size, subtract center element once to avoid double-counting

Assumption: The matrix is always square (`n x n`).

---

## 2. Brute Force Approach

### Time: O(n²) | Space: O(1)

### Code Summary:

- Nested loops traverse all elements
- Check every element:

  - If `i == j` → primary diagonal
  - If `i + j == n - 1` → secondary diagonal

### Java Snippet:

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        if (i == j)
            sum += matrix[i][j];
        else if (i + j == n - 1)
            sum += matrix[i][j];
    }
}
```

### Use Case:

- Simple to understand
- Works correctly, but not efficient for large matrices

---

## 3. Optimized Approach

### Time: O(n) | Space: O(1)

### Logic:

- Loop only once over rows
- Pick diagonal elements directly by index
- Avoids unnecessary traversal of non-diagonal elements

### Java Snippet:

```java
for (int i = 0; i < n; i++) {
    sum += matrix[i][i]; // Primary diagonal

    if (i != n - 1 - i) // Skip center if already added
        sum += matrix[i][n - 1 - i]; // Secondary diagonal
}
```

### Why Check `i != n - 1 - i`?

- In odd-sized matrices, the center element belongs to both diagonals
- To avoid counting it twice, skip adding it again

---

## 4. Visual Example

### 3x3 Matrix (Odd)

```
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
```

- Primary: 1 + 5 + 9 = 15
- Secondary: 3 + 5 + 7 = 15
- Combined: 15 + 15 - 5 (center) = 25

### 4x4 Matrix (Even)

```
[ 1,  2,  3,  4]
[ 5,  6,  7,  8]
[ 9, 10, 11, 12]
[13, 14, 15, 16]
```

- Primary: 1 + 6 + 11 + 16 = 34
- Secondary: 4 + 7 + 10 + 13 = 34
- Combined: 68 (no center overlap)

---

## 5. Summary of Differences

| Aspect           | Brute Force        | Optimized                |
| ---------------- | ------------------ | ------------------------ |
| Time Complexity  | O(n²)              | O(n)                     |
| Space Complexity | O(1)               | O(1)                     |
| Code Simplicity  | Easy to write      | Slightly more logical    |
| Redundant Access | Yes (non-diagonal) | No                       |
| Center Check     | Handled via logic  | Handled via `i != n-1-i` |

---

## 6. Final Thoughts

- Use **brute force** to understand the concept
- Use **optimized version** in real applications or coding interviews
- Always handle center overlap in odd-dimension matrices when summing both diagonals
