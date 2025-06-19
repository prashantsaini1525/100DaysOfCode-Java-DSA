# 📘 Day 36: 2D Array Practice – Count, Sum, Transpose

Today I tackled three classic 2D array tasks from my assignment sheet. Beyond just coding, I focused on **why** each operation matters and how wrapping logic in reusable methods makes your code cleaner and more maintainable.

---

## 🔢 1. Counting a Specific Value in a Matrix

### Why This Matters

Imagine you have a grid of survey responses (0 = no, 1 = yes). You need to tally how many “yes” votes across all regions. Counting occurrences in a 2D array is the same pattern.

**Task**: In `{{4,7,8},{8,8,7}}`, find how many times `7` appears (should be **2**).

```java
int countValue(int[][] matrix, int target) {
    int count = 0;
    for (int[] row : matrix) {
        for (int val : row) {
            if (val == target) count++;
        }
    }
    return count;
}
```

- **Nested loops** ensure every cell is checked.
- Counting only when `val == target` mimics tallying votes.

**Usage**:

```java
int[][] arr = {{4,7,8},{8,8,7}};
System.out.println("Number of 7's: " + countValue(arr, 7));
```

**Pro Tip**: Make `countValue` generic so you can reuse it for any target, not just `7`.

---

## ➕ 2. Summing One Row of the Matrix

### Why This Matters

Summing a row is like calculating the total sales for a single day from a sales grid where each row is a day and each column is a region.

**Task**: For `{{1,4,9},{11,4,3},{2,2,3}}`, compute the sum of the second row (index 1), expected **18**.

```java
int sumRow(int[][] matrix, int rowIndex) {
    int sum = 0;
    for (int val : matrix[rowIndex]) {
        sum += val;
    }
    return sum;
}
```

- **Single loop** over one row keeps it O(m).
- `rowIndex` parameter makes it versatile for any row.

**Usage**:

```java
int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
System.out.println("Sum of 2nd row: " + sumRow(nums, 1));
```

**Pro Tip**: You can extend this to sum any subarray or diagonal by adjusting index logic.

---

## 🔄 3. Transposing the Matrix

### Why This Matters

Transposing a matrix flips its rows and columns. This is essential in graphics (rotating pixels), linear algebra, and converting data tables.

**Task**: Convert a 2×3 matrix into a 3×2 matrix by swapping rows and columns.

```java
int[][] transpose(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] result = new int[cols][rows];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result[j][i] = matrix[i][j];
        }
    }
    return result;
}
```

- Creates a new matrix with flipped dimensions.
- Double loop assigns `result[j][i] = matrix[i][j]`.

**Usage**:

```java
int[][] mat = {{2,3,7},{5,6,7}};
int[][] t = transpose(mat);
// Print or use t as needed
```

**Pro Tip**: If memory is tight, transpose in place only for square matrices.

---

## 🔑 Summary Table

| Operation         | Method Signature                | Time   | Space  | Real-World Analogy         |
| ----------------- | ------------------------------- | ------ | ------ | -------------------------- |
| Count occurrences | `countValue(int[][], int)`      | O(n·m) | O(1)   | Tallying votes in a grid   |
| Sum a row         | `sumRow(int[][], int rowIndex)` | O(m)   | O(1)   | Summing sales per day      |
| Transpose matrix  | `transpose(int[][])`            | O(n·m) | O(n·m) | Rotating an image or table |

---

> **Coming Next (Day 37)**: A humanized deep dive into **Java Strings**—what they are, how they’re stored, basic I/O, getting length, and common operations like substring, concatenation, and comparison. Let's turn characters into code!
