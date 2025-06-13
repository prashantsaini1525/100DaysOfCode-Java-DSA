# 📘 Day 34: Staircase Search in a Sorted 2D Matrix (Top-Right Start)

On Day 34 of my #100DaysOfCode journey, I implemented two versions of the **staircase search** algorithm to find a key in a 2D matrix where rows and columns are sorted:

- **Version A**: Searches for a present key (e.g., 50) and reports its position.
- **Version B**: Searches for an absent key (e.g., 429) and reports not found.

Both versions start at the **top-right corner** and move left or down based on comparisons, achieving **O(n + m)** time and **O(1)** space.

---

## 🌟 Concept Recap: Staircase Search

1. **Matrix Properties**:

   - Each row is sorted left to right.
   - Each column is sorted top to bottom.

2. **Algorithm Steps**:

   1. Initialize `(row, col) = (0, m - 1)` (top-right).
   2. While `row < n` and `col >= 0`:

      - If `matrix[row][col] == key`, stop (found).
      - If `matrix[row][col] > key`, move **left** (`col--`).
      - Else, move **down** (`row++`).

3. **Outcome**:

   - Return `true` and position if found, else `false` after exiting loop.

---

## 🛠️ Version A: Key Present

- **Key**: 50
- **Behavior**: Moves until `matrix[0][3] → 40 < 50`, so goes down; continues until it reaches `(3,3)`.
- **Result**: Prints `Key found at: (3, 3)`.

## 🛠️ Version B: Key Absent

- **Key**: 429
- **Behavior**: Traverses rightmost column and bottom boundary until both indices go out of valid range.
- **Result**: Prints `Element not found`.

---

## 🔍 Why This Matters

- **Efficiency**: O(n + m) beats O(n·m) brute force and O(n log m) row-wise binary search on large matrices.
- **Simplicity**: Only two pointer movements (left/down) guided by comparisons.
- **Practical Use**: Anywhere you need to search in matrix-like data that’s sorted both ways.

---

## 🔁 Key Variations

| Version       | Start     | Move When > key | Move When < key | Key Example | Outcome                       |
| ------------- | --------- | --------------- | --------------- | ----------- | ----------------------------- |
| A (found)     | Top-right | Left            | Down            | 50          | Found at (3, 3)               |
| B (not found) | Top-right | Left            | Down            | 429         | Exits loop, reports not found |

---

Tomorrow (Day 35): I’ll apply the same staircase concept starting from the **bottom-left** corner to search with inverted moves (up/right).
