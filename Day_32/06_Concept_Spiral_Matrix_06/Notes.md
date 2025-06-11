# Spiral Matrix Concept and Step-by-Step Breakdown

A **spiral matrix** refers to arranging or traversing elements of a 2D array in spiral (clockwise) order. In many problems, you either:

1. **Print** the elements of an existing matrix in spiral order.
2. **Generate** a new $n 	imes n$ matrix filled in spiral order.

Below is a Markdown guide covering both aspects: definition, core ideas, pseudocode, and a detailed step-by-step example for printing a matrix in spiral order, using only 2D arrays (no lists).

---

## 1. What Is a Spiral Matrix?

- **Spiral Order Traversal**: Given a rectangular or square matrix, start at the top-left corner and move right, then down, then left, then up—each time sticking to the boundary of unvisited cells—until all elements are visited.
- **Spiral Matrix Generation**: Create a new matrix of size $n 	imes n$ by filling values (usually integers from 1 to $n^2$) in the same spiral pattern.

Visualizing a 4×4 example in spiral order (printing):

```
Input matrix:            Spiral traversal printed:
[ [ 1,  2,  3,  4 ],      1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
  [ 5,  6,  7,  8 ],
  [ 9, 10, 11, 12 ],
  [13, 14, 15, 16 ] ]
```

- We follow the boundary: top row left→right, right column top→bottom, bottom row right→left, left column bottom→top, then repeat inward.

---

## 2. Core Idea for Traversal (Printing in Spiral)

Use four pointers (boundaries):

- **top**: initially 0 (first row)
- **bottom**: initially $n-1$ (last row)
- **left**: initially 0 (first column)
- **right**: initially $m-1$ (last column)

At each step:

1. Traverse from **left** to **right** along row = **top**, then increment **top**.
2. Traverse from **top** to **bottom** along column = **right**, then decrement **right**.
3. If **top** ≤ **bottom**, traverse from **right** to **left** along row = **bottom**, then decrement **bottom**.
4. If **left** ≤ **right**, traverse from **bottom** to **top** along column = **left**, then increment **left**.
5. Repeat until **top** > **bottom** or **left** > **right**.

Each cycle covers one “layer” of the spiral. After finishing a layer, boundaries move inward.

---

## 3. Pseudocode for Printing Spiral Order

```text
initialize top = 0, bottom = rows - 1
initialize left = 0, right = cols - 1

while (top <= bottom and left <= right) do:
  1) for col from left to right:
       print matrix[top][col]
     top = top + 1

  2) for row from top to bottom:
       print matrix[row][right]
     right = right - 1

  3) if (top <= bottom):
       for col from right down to left:
         print matrix[bottom][col]
       bottom = bottom - 1

  4) if (left <= right):
       for row from bottom down to top:
         print matrix[row][left]
       left = left + 1

end while
```

The `if` checks in steps 3 and 4 prevent re-traversing the same row or column when only one remains.

---

## 4. Step-by-Step Example: 4×4 Matrix

Let’s walk through printing a 4×4 matrix in spiral order. Input:

```
matrix = [ [ 1,  2,  3,  4 ],
           [ 5,  6,  7,  8 ],
           [ 9, 10, 11, 12 ],
           [13, 14, 15, 16 ] ]
```

**Initial boundaries**:

- top = 0, bottom = 3, left = 0, right = 3

**Iteration 1**:

1. Traverse top row (row 0) col 0→3: print `1 2 3 4` → set `top = 1`.
2. Traverse right column (col 3) row 1→3: print `8 12 16` → set `right = 2`.
3. Since `top (1) ≤ bottom (3)`, traverse bottom row (row 3) col 2→0: print `15 14 13` → set `bottom = 2`.
4. Since `left (0) ≤ right (2)`, traverse left column (col 0) row 2→1: print `9 5` → set `left = 1`.

Printed so far: `1 2 3 4 8 12 16 15 14 13 9 5`

**New boundaries**: top = 1, bottom = 2, left = 1, right = 2

**Iteration 2**:

1. Traverse top row (row 1) col 1→2: print `6 7` → set `top = 2`.
2. Traverse right column (col 2) row 2→2: print `11` → set `right = 1`.
3. Since `top (2) ≤ bottom (2)`, traverse bottom row (row 2) col 1→1: print `10` → set `bottom = 1`.
4. Since `left (1) ≤ right (1)`, now `bottom (1) < top (2)`, loop ends.

Printed in this layer: `6 7 11 10`

**Final printed sequence**:

```
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
```

---

## 5. Java Implementation Using 2D Array (No Lists)

Below is a Java program that prints the elements of a 2D array in spiral order, using only `int[][]` and `System.out.print` calls.

```java
public class SpiralPrint {
    public static void printSpiral(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1) Print top row, left → right
            for (int col = left; col <= right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            // 2) Print right column, top → bottom
            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            // 3) Print bottom row, right → left (if still valid)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            // 4) Print left column, bottom → top (if still valid)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }
        System.out.println(); // newline at end
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 },
            {13, 14, 15, 16 }
        };

        printSpiral(matrix);
        // Expected output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
    }
}
```

- This code declares `int[][] matrix` and uses four boundary variables (`top`, `bottom`, `left`, `right`).
- Each `for` loop prints one side of the current “layer.”
- The `if` checks ensure we don’t re-print a single row or column twice.

---

## 6. Generating a Spiral Matrix (Using 2D Array)

To **generate** an $n 	imes n$ spiral matrix without lists:

1. Create `int[][] matrix = new int[n][n];`
2. Set `top=0, bottom=n-1, left=0, right=n-1, num=1`.
3. While (`top <= bottom && left <= right`):

   - Fill top row (col=`left→right`) with `num` then `num++`; `top++`.
   - Fill right column (row=`top→bottom`) with `num` then `num++`; `right--`.
   - If (`top <= bottom`): fill bottom row (col=`right→left`) with `num` then `num++`; `bottom--`.
   - If (`left <= right`): fill left column (row=`bottom→top`) with `num` then `num++`; `left++`.

4. When done, `matrix` holds values 1 → $n^2$ in spiral order.

### Example (n = 3)

```
Step 1: matrix initialized with zeros:
[ [0, 0, 0],
  [0, 0, 0],
  [0, 0, 0] ]
num = 1, top=0, bottom=2, left=0, right=2

- Fill top row (0,0→0,2): 1,2,3 → top=1, num=4
- Fill right col (1,2→2,2): 4,5 → right=1, num=6
- Fill bottom row (2,1→2,0): 6,7 → bottom=1, num=8
- Fill left col (1,0→1,0): 8 → left=1, num=9

Now top=1, bottom=1, left=1, right=1:
- Fill top row (1,1): 9 → top=2, num=10

Final spiral matrix:
[ [1, 2, 3],
  [8, 9, 4],
  [7, 6, 5] ]
```

---

## 7. Tips for Your Notes

- **Draw the boundaries**: Label rows/cols outside the grid (top, bottom, left, right).
- **Mark direction**: Use arrows to show “→ ↓ ← ↑” around each layer.
- **Practice varied sizes**: Try a 3×5 or 5×3 matrix to see how boundaries shift when rows ≠ columns.
- **Keep it simple**: Each side is just a `for` loop that prints/fills one row or column.

---

**Key takeaway**: Spiral logic is simply “peel layers” off the matrix—print/fill one boundary at a time, then move inward. No lists needed, just a 2D array and four boundary pointers.
