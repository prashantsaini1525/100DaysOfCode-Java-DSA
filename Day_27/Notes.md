# 📘 Day 27: Solving Descending Sort Question with Bubble Sort & Selection Sort

**Question**: Use the following sorting algorithms to sort an array in **DESCENDING** order:

> a. Bubble Sort
> b. Selection Sort
> c. Insertion Sort
> d. Counting Sort

You can use this example array: `[3, 6, 2, 1, 8, 7, 4, 5, 3, 1]`.

On Day 27 of my #100DaysOfCode journey, I tackled parts (a) and (b) of the above question—implementing both **Bubble Sort** and **Selection Sort** to sort the array in descending order and counting how many swaps each did. Tomorrow I will complete parts (c) and (d) using **Insertion Sort** and **Counting Sort**.

Tracking swap counts helped me compare how these two O(n²) algorithms perform on the same input.

---

## 🌟 Why Count Swaps?

- **Measure disorder**: The number of swaps quantifies how far an array is from being sorted descending.
- **Compare algorithms**: Even though both sorts have O(n²) complexity, swap counts reveal which does more work for this specific input.
- **Build intuition**: Beginners can see exactly how many element moves are required as the algorithm progresses.

Both Bubble Sort and Selection Sort run in O(n²) time and O(1) extra space. Counting swaps doesn’t change their big‑O classification but adds visibility into their inner workings.

---

## 🌀 Bubble Sort (Part a)

**High-Level Explanation (Descending Order)**:

1. Repeatedly traverse the array, comparing each pair of adjacent elements.
2. If a given element is **smaller** than the next element (for descending), swap them so the larger value “bubbles” toward the front.
3. After each full pass, the smallest element among the unsorted portion ends up at the end.
4. We repeat this process for `n−1` passes.
5. We keep a `swap` counter that increments every time we swap two adjacent elements.

**Step-by-Step on `[3, 6, 2, 1, 8, 7, 4, 5, 3, 1]`**:

1. **Initialize**: `swap = 0`.
2. **Pass 1 (turn = 0)**: Compare indices 0 & 1: `(3,6)` → swap → `[6,3,2,1,8,7,4,5,3,1]`, `swap = 1`.

   - Next: `(3,2)` → no swap.
   - `(2,1)` → no swap.
   - `(1,8)` → swap → `[6,3,2,8,1,7,4,5,3,1]`, `swap = 2`.
   - Continue until end of pass: by the final comparison, `8` has moved forward but not yet fully front; after all 9 comparisons, `8` ends up at index 4.

3. **Pass 2 (turn = 1)**: Now skip last index (where the smallest from pass 1 sits). Compare pairs from index 0 to 8, swapping whenever left < right. Continue updating `swap`.
4. **Continue for passes 0 through 8**: After 9 passes, array is fully descending: `[8,7,6,5,4,3,3,2,1,1]`.
5. **Final Swap Count**: The code prints `Total number of swaps: X`, showing exactly how many adjacent swaps were needed.

**Key Takeaways**:

- The inner loop runs for `arr.length − 1 − turn` iterations, shrinking each pass because the last `turn` elements are already in correct position.
- Swap counting happens only when `if (arr[j] < arr[j+1])` is true (for descending).
- For nearly sorted descending data, you can exit early by checking if `swap` stayed zero during a pass.

---

## 🌲 Selection Sort (Part b)

**High-Level Explanation (Descending Order)**:

1. Think of two segments: a sorted prefix (initially empty) and an unsorted suffix (initially the entire array).
2. For each index `i` from 0 to `n−2`, assume `minPos = i`.
3. Scan the unsorted segment from `i+1` to `n−1`; whenever you find an element larger than `arr[minPos]`, update `minPos = currentIndex`.
4. After scanning, swap `arr[minPos]` with `arr[i]`, and increment `swap`. This places the next-largest element at index `i`.
5. Repeat until the prefix is fully sorted in descending order.

**Step-by-Step on `[3, 6, 2, 1, 8, 7, 4, 5, 3, 1]`**:

1. **Initialize**: `swap = 0`, `i = 0`, `minPos = 0` (value = `3`).
2. **Find max in unsorted**: Compare `3` to each element to its right. When checking `6`, since `6 > 3`, set `minPos = 1`. Later, at `8` (index 4), `8 > 6`, so `minPos = 4`. No number is larger than `8`, so end with `minPos = 4`.
3. **Swap**: Exchange `arr[4] (8)` with `arr[0] (3)` → `[8,6,2,1,3,7,4,5,3,1]`, `swap = 1`.
4. **Next iteration**: `i = 1`, `minPos = 1` (value = `6`).

   - Scan indices 2–9; find `7` at index 5 (`7 > 6`), so `minPos = 5`.
   - Swap `arr[5] (7)` with `arr[1] (6)` → `[8,7,2,1,3,6,4,5,3,1]`, `swap = 2`.

5. **Continue** for i = 2 through 8: each time, find the largest in the unsorted segment, swap it into position `i`, increment `swap`.
6. After 9 iterations, array is sorted: `[8,7,6,5,4,3,3,2,1,1]`.
7. **Final Swap Count**: Prints `Number of swaps: Y` when done.

**Key Takeaways**:

- Selection Sort performs exactly one swap per outer iteration (`n−1` swaps total) because it always swaps `arr[minPos]` with `arr[i]`, even if `minPos == i`.
- To avoid unnecessary swaps when `minPos == i`, add a check:

  ```java
  if (minPos != i) {
      swap elements;
      swap++;
  }
  ```

- Swaps move the next-largest element directly into the sorted prefix, which produces fewer total swaps than Bubble Sort on very unsorted data.

---

## ⚖️ Bubble Sort vs. Selection Sort: Swap Count Comparison

Using the same input, you’ll usually see different swap counts:

- **Bubble Sort** swaps whenever any adjacent pair is out of order. An element may move multiple positions via successive adjacent swaps, leading to a potentially large swap count (up to O(n²) swaps in the worst case).
- **Selection Sort** does at most one swap per iteration (so exactly `n−1` swaps total if you count even the trivial ones). This can be far fewer than Bubble Sort on the same data if the data is very unsorted.

**Insight**: If minimizing swap operations (e.g., because a swap is expensive), Selection Sort can be preferable—even though its comparison count is the same big‑O as Bubble Sort.

---

## ⚠️ Common Pitfalls & Tips

1. **Loop Bounds**:

   - In Bubble Sort, ensure the inner loop is `for (int j = 0; j < arr.length − 1 − turn; j++)`. Forgetting `− turn` means you keep rechecking already-sorted trailing elements.
   - In Selection Sort, make sure to swap **after** you finish scanning for `minPos`—not inside the inner scan loop.

2. **Comparison Direction**:

   - To switch both algorithms from **descending** to **ascending**, reverse the comparison operators:

     - **Bubble Sort**: `if (arr[j] > arr[j+1]) swap;`
     - **Selection Sort**: `if (arr[minPos] > arr[j]) minPos = j;`

3. **Counting Swaps Wisely**:

   - In Selection Sort, only increment `swap` when `minPos != i`, to avoid counting meaningless swaps.

4. **Stability Considerations**:

   - Bubble Sort is **stable**: equal elements remain in their original relative order because you only swap when strictly out of order.
   - Selection Sort (as implemented) is **not stable**: swapping can reorder equal elements arbitrarily.

5. **Early Exit in Bubble Sort**:

   - For nearly sorted descending arrays, add a `boolean swapped` flag at the start of each pass. If after an entire pass no swaps occur, you can break early because the array is already sorted.

---

## 🔑 Key Takeaways

- **Bubble Sort**: O(n²) time, stable, potentially many swaps (adjacent), early-exit optimization possible.
- **Selection Sort**: O(n²) time, not stable by default, exactly `n−1` swaps (or fewer if optimized), direct swaps of min (or max) element.
- **Swap Counting**: Reveals how much actual data movement each algorithm does. Helps compare “work” beyond just big-O notation.
- **Tomorrow’s Plan**: Use **Insertion Sort** (part c) and **Counting Sort** (part d) to solve the same descending order question—tracking shifts or counts similarly.

---

## 📝 Quick Quiz

1. Why might Selection Sort perform fewer swaps than Bubble Sort on the same unsorted array?
2. How would you modify Bubble Sort to detect a fully sorted (descending) array early?
3. Explain why Selection Sort is not stable by default, and how you could change it to become stable.

---

_That’s a wrap for Day 27! I completed parts (a) and (b) of the descending sort question. Tomorrow, I’ll tackle the same question using Insertion Sort and Counting Sort._
