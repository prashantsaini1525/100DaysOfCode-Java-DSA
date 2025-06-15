# 📘 Day 35: Staircase Search in a Sorted 2D Matrix (Bottom-Left Start)

Continuing from Day 34’s top-right approach, on Day 35 I implemented two **staircase search** variants starting at the **bottom-left corner**:

- **Version C**: Searches for a present key (e.g., 50) using bottom-left → up/right moves.
- **Version D**: Searches for a present key with reversed comparison order, demonstrating the same logic.

This alternate start exploits the sorted properties using **O(n + m)** time and **O(1)** space, moving **up** when current > key and **right** when current < key.

---

## 🔄 Alternate Staircase Logic

1. **Start**: `(row, col) = (n - 1, 0)` (bottom-left).
2. **While** `row >= 0` and `col < m`:

   - If `matrix[row][col] == key`, found.
   - If `matrix[row][col] > key`, move **up** (`row--`).
   - Else, move **right** (`col++`).

3. **End**: Return found status or not found.

---

## 🛠️ Version C & D Details

| Version   | Key | Move Up If > key | Move Right If < key | Outcome         |
| --------- | --- | ---------------- | ------------------- | --------------- |
| C (found) | 50  | Yes              | Yes                 | Found at (3, 0) |
| D (found) | 50  | Yes              | Yes                 | Found at (3, 0) |

- Both versions show that starting at bottom-left is as effective when you invert the movement rules.

---

## 🔑 Takeaways

- Staircase search works from any corner, as long as you adjust move directions to follow the sorted order.
- Bottom-left start moves **up/right**, top-right start moves **left/down**.
- This flexibility allows searching from whichever corner is most intuitive for the application.

---

Next: I’ll explore more advanced matrix operations, such as spiral generation and dynamic programming patterns on matrices.
