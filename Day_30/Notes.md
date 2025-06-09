# 📘 Day 29: Dynamic 2D Arrays and Matrix Search in Java

Building on yesterday’s practice with 2D arrays (hardcoded and scanner-based creation), Day 29 of my #100DaysOfCode journey explores:

1. **Interactive Input**: Prompting the user for each element in a 3×3 matrix.
2. **Matrix Search**: Scanning the 2D array to find a target value and report its position.

These exercises deepen my understanding of nested loops, user interaction, and basic search algorithms in a 2D context.

---

## 🌟 Recap: Yesterday’s 2D Array Basics

- **Hardcoded Initialization**: Defined a matrix inline with `int[][] arr = {{1,2,3}, {...}}`.
- **Scanner Input**: Read values row by row without prompts (`matrix[i][j] = sc.nextInt()`).
- Traversed with nested `for` loops using `matrix.length` and `matrix[0].length`.

Today, I add user prompts and implement a simple search function.

---

## 🔍 Interactive Matrix Population

In `TwoDArrayCreation.java`:

- Declared `int[][] matrix = new int[3][3];`.
- Used two nested loops for rows (`i`) and columns (`j`).
- Before each input, printed `"Enter element at position [i][j]: "` to guide the user.
- Stored each entry with `matrix[i][j] = sc.nextInt();`.
- Closed `Scanner` after input to free resources.

**Key Point**: Prompting improves usability—students see exactly where to enter data.

---

## 🔍 Searching a 2D Array for a Key

Also in `TwoDArrayCreation.java` (updated):

- Implemented `public static boolean search(int[][] matrix, int key)`:

  1. Loop over all rows (`i`) and columns (`j`).
  2. If `matrix[i][j] == key`, print its position and return `true`.
  3. After full scan without finding, print "Element not found" and return `false`.

- In `main`, after populating and printing the matrix, called `search(matrix, 5)` to look for `5`.

**Insight**: Linear search in a 2D array is O(n·m). For large grids, more efficient techniques (binary search in sorted rows) might apply—but nested loops are perfect for beginners.

---

## 🛠 Code Snippets (Simplified)

### Prompted Input & Print

```java
for (int i = 0; i < n; i++) {
  for (int j = 0; j < m; j++) {
    System.out.print("Enter element at ["+i+"]["+j+" ]: ");
    matrix[i][j] = sc.nextInt();
  }
}
// Print matrix
for (...) print(matrix[i][j]);
```

### Matrix Search Method

```java
public static boolean search(int[][] matrix, int key) {
  for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[0].length; j++) {
      if (matrix[i][j] == key) {
        System.out.println("Element found at: " + i + ", " + j);
        return true;
      }
    }
  }
  System.out.println("Element not found");
  return false;
}
```

---

## 🤔 Common Pitfalls & Tips

- **Off-by-One**: Ensure loop bounds use `< matrix.length` and `< matrix[0].length`.
- **Scanner Prompts**: Always include meaningful prompts to help users know what to enter.
- **Resource Management**: Call `sc.close()` after all inputs.
- **Search Return**: Returning immediately on find avoids extra iterations.

---

## 🔑 Key Takeaways

- Prompted input makes CLI interactions user-friendly.
- Nested loops power both population and search tasks in 2D arrays.
- Matrix search is O(n·m); for large data, explore sorted searches or hashing.
- Building on previous days, each exercise reinforces array, loop, and I/O fundamentals.

Tomorrow (Day 30): I’ll implement **matrix addition and subtraction**, combining two 2D arrays and validating dimensions.

---

_Happy coding and matrix exploring!_
