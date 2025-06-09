# 📘 Day 31: Finding Max & Min in a 2D Array

Building on Days 29–30, where I practiced 2D array creation, input, and search, Day 31 focuses on **scanning a matrix to find its largest and smallest elements**. This exercise reinforces nested loops, comparisons, and real-world data scanning patterns.

---

## 🌟 What’s the Goal?

Given a 3×3 integer matrix (populated by user input with prompts), determine:

1. **Max Value**: The largest number in the entire grid.
2. **Min Value**: The smallest number in the entire grid.

This is a fundamental pattern: a single pass over all data points to compute aggregate properties.

---

## 🔍 Code Walkthrough

```java
int[][] matrix = new int[3][3];
int n = matrix.length;
int m = matrix[0].length;

Scanner sc = new Scanner(System.in);

// 1. Input with prompts
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        System.out.print("Enter element at [" + i + "][" + j + "]: ");
        matrix[i][j] = sc.nextInt();
    }
}

// 2. Print matrix
for (...) print(matrix[i][j]);

// 3. Initialize max/min to first element
int max = matrix[0][0];
int min = matrix[0][0];

// 4. Traverse to update max/min
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        int val = matrix[i][j];
        if (val > max) max = val;
        if (val < min) min = val;
    }
}

// 5. Report
System.out.println("Largest element: " + max);
System.out.println("Smallest element: " + min);

sc.close();
```

**Key steps**:

- **Initialization**: Set both `max` and `min` to the first cell so comparisons start from a valid value.
- **Nested loops**: One pass over `matrix[i][j]` to update `max`/`min`.
- **Comparison logic**: Two separate `if` checks ensure both extremes are found in one traversal.

---

## 🤔 Why This Matters

- **Data scanning**: Many real-world tasks (e.g., image processing, sensor grids) require finding extremes quickly.
- **Single-pass efficiency**: This approach is O(n·m), optimal for scanning without extra storage.
- **Pattern reuse**: The same nested-loop structure applies to sums, averages, and other aggregate metrics.

---

## ⚠️ Common Pitfalls & Tips

1. **Incorrect Initialization**: If you set `max` to `0` or `Integer.MAX_VALUE`, it may fail for negative or large inputs. Always initialize to an actual data point (`matrix[0][0]`).
2. **Loop Bounds**: Remember `i < matrix.length` and `j < matrix[0].length` — mixing these up can cause exceptions.
3. **Scanner Close**: Don’t forget `sc.close()` to prevent resource leaks.

---

## 🔑 Key Takeaways

- A simple nested-loop scan can find global properties like max/min in O(n·m) time and O(1) extra space.
- Initializing extremes from the data avoids reliance on magic numbers.
- This pattern extends to sum, count, and other aggregate operations over matrices.

Tomorrow (Day 32): I’ll implement **matrix addition and subtraction**, combining two matrices and checking for dimension compatibility.

---

_Happy coding, and may your matrices always be within bounds!_
