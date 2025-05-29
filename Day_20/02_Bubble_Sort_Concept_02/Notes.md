## Lecture 2: Bubble Sort

Imagine you have a row of numbered cards scattered on the floor, and you want to arrange them from smallest to largest. **Bubble Sort** is like repeatedly going down the row, comparing each pair of neighboring cards, and swapping them if they’re in the wrong order. Just like bubbles in water, the largest items “float” to the end of the list with each pass.

---

## How Bubble Sort Works Step by Step

1. **Start at the beginning** of the list.
2. **Compare** the first two items:

   - If the left item is bigger than the right, **swap** them.
   - If not, leave them as they are.

3. **Move one position to the right** and compare the next pair.
4. **Keep going** until you reach the end of the list—at this point, the largest item has “bubbled” up to the last position.
5. **Repeat** the entire process for the rest of the list (ignoring the last item, since it’s already in place).
6. **Stop** when a full pass makes no swaps—that means the list is sorted!

---

### Visual Example

Given the list: `[5, 2, 9, 1, 5]`

- **Pass 1**:

  1. Compare 5 and 2 → swap → `[2, 5, 9, 1, 5]`
  2. Compare 5 and 9 → no swap → `[2, 5, 9, 1, 5]`
  3. Compare 9 and 1 → swap → `[2, 5, 1, 9, 5]`
  4. Compare 9 and 5 → swap → `[2, 5, 1, 5, 9]`

  > End of pass: 9 is in its correct spot.

- **Pass 2**:

  1. Compare 2 and 5 → no swap → `[2, 5, 1, 5, 9]`
  2. Compare 5 and 1 → swap → `[2, 1, 5, 5, 9]`
  3. Compare 5 and 5 → no swap → `[2, 1, 5, 5, 9]`

  > End of pass: second-largest item settled.

- **Pass 3**:

  1. Compare 2 and 1 → swap → `[1, 2, 5, 5, 9]`

  > End of pass: no more swaps needed—list is sorted!

---

## Bubble Sort Pseudocode

```plaintext
function bubbleSort(array):
    n = length of array
    repeat
        swapped = false
        for i from 1 to n - 1:
            if array[i - 1] > array[i]:
                swap array[i - 1] and array[i]
                swapped = true
        n = n - 1  // last item is now in place
    until not swapped
```

---

## Time & Space Complexity

- **Best Case**: O(n) — only one pass if the list is already sorted (no swaps).
- **Average & Worst Case**: O(n²) — when items are in random or reverse order.
- **Space**: O(1) — sorts in place, only a temporary variable for swapping.

---

## Pros & Cons

**Pros**:

- Very simple to understand and implement.
- Great for teaching sorting basics and for small lists.
- Stops early if the list is already sorted, saving work.

**Cons**:

- Slow on large lists compared to efficient algorithms like Merge Sort or Quick Sort.
- Performs many unnecessary swaps when the list is nearly sorted.

---
