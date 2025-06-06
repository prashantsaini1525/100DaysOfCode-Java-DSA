# 📘 Day 28: Solving Descending Sort with Insertion Sort & Counting Sort

**Question**: Use the following sorting algorithms to sort an array in **DESCENDING** order:

> a. Bubble Sort
> b. Selection Sort
> c. Insertion Sort
> d. Counting Sort

On Day 27, I solved parts (a) and (b) with Bubble Sort and Selection Sort. Today, on Day 28 of my #100DaysOfCode journey, I tackled parts (c) and (d): **Insertion Sort** and **Counting Sort** to sort `[3, 6, 2, 1, 8, 7, 4, 5, 3, 1]` in descending order. Additionally, I counted the number of shifts or placements to compare “work done” across algorithms.

---

## 🌟 Why Track Shifts and Counts?

- **Measure algorithm effort**: Counting how many times we move elements (shifts in Insertion Sort, placements in Counting Sort) gives a deeper insight beyond just big-O notation.
- **Compare efficiency**: Even with the same input and target (descending order), different sorts require different amounts of work.
- **Build intuition**: For beginners, seeing the actual counts helps understand which algorithm does more or fewer data movements.

---

## 📝 Insertion Sort with Shift Counter (Part c)

### How It Works (Descending Order)

1. We start from the second element (index 1) and take it as the “current” value (`curr`).
2. We compare `curr` with each element to its left and shift left elements **down** (to the right) as long as they are **smaller** than `curr` (because we want larger values up front). Each shift counts as one “shift.”
3. After shifting, we insert `curr` into its correct position.
4. We repeat this for `i = 1` through `n−1`, counting every single shift.

**Key difference** for descending: in the comparison inside the inner loop, we use `while (prev >= 0 && arr[prev] < curr)` to move smaller elements out of the way.

### Step-by-Step on `[3, 6, 2, 1, 8, 7, 4, 5, 3, 1]`

1. **Initialization**: `shiftCount = 0`.
2. **i = 1** (`curr = 6`, `prev = 0`): Compare `arr[0] = 3` vs. `6` → since `3 < 6`, shift `3` right: `arr = [3, 3, 2, ...]`, `shiftCount = 1`.

   - Insert `6` at `arr[0]` → `arr = [6, 3, 2, 1, 8, 7, 4, 5, 3, 1]`.

3. **i = 2** (`curr = 2`, `prev = 1`): Compare `3 < 2`? No (3 ≥ 2), so no shifts. Insert `2` at `arr[2]` (no movement).
4. **i = 3** (`curr = 1`, `prev = 2`): Compare `2 < 1`? No. No shifts.
5. **i = 4** (`curr = 8`, `prev = 3`): Compare `1 < 8` → shift 1 right (`shiftCount = 2`), then compare `2 < 8` → shift 2 (`shiftCount = 3`), `3 < 8` → shift 3 (`shiftCount = 4`), `6 < 8` → shift 6 (`shiftCount = 5`). Insert `8` at front: `arr = [8, 6, 3, 2, 1, 7, 4, 5, 3, 1]`.
6. **Continue** systematically for `i = 5, 6, 7, 8, 9`. Each time, compare `curr` to all left elements that are smaller, shift them one by one, incrementing `shiftCount`.
7. **Final sorted array**: `[8, 7, 6, 5, 4, 3, 3, 2, 1, 1]`.
8. **Total shifts**: Printed as `Total swaps: S` (though they’re really shifts, not swap with a neighbor). This count shows how many single-element moves occurred.

**Insights**:

- If an element is already in correct descending position, no shifts occur for that iteration.
- Insertion Sort tends to shift many elements when a large `curr` leaps to the front, so shift count spikes when very large items appear later in the array.

---

## 🔢 Counting Sort in Descending Order (Part d)

### How It Works (Descending Order)

1. As usual, find the maximum value `maxVal` to size the `count[]` array.
2. Tally frequencies: for each number `x` in `arr`, do `count[x]++`.
3. **Rebuild** the original array by reading `count[]` from **highest index down to zero**. For each `i`, place `i` into `arr` exactly `count[i]` times.

**Note**: In Day 26, we rebuilt in ascending order. Today, flipping the loop direction to go from `count.length−1` down to `0` gives us descending order.

### Step-by-Step on `[1, 4, 1, 3, 2, 4, 3, 7]`

1. **Find `maxVal` = 7**.
2. **Initialize** `count[8] = [0,0,0,0,0,0,0,0]`.
3. **Tally** frequencies:

   - Two 1’s → `count[1] = 2`.
   - One 2 → `count[2] = 1`.
   - Two 3’s → `count[3] = 2`.
   - Two 4’s → `count[4] = 2`.
   - One 7 → `count[7] = 1`.
     Final `count = [0,2,1,2,2,0,0,1]`.

4. **Rebuild in descending order**:

   - Start `i = 7`: `count[7] = 1` → place one `7` in `arr[0]`.
   - `i = 6`: `count[6] = 0` → skip.
   - `i = 5`: `count[5] = 0` → skip.
   - `i = 4`: `count[4] = 2` → place two `4`’s at `arr[1], arr[2]`.
   - `i = 3`: `count[3] = 2` → place two `3`’s at `arr[3], arr[4]`.
   - `i = 2`: `count[2] = 1` → place `2` at `arr[5]`.
   - `i = 1`: `count[1] = 2` → place two `1`’s at `arr[6], arr[7]`.
   - `i = 0`: `count[0] = 0` → skip.
     Final sorted array: `[7, 4, 4, 3, 3, 2, 1, 1]`.

**Count Placements**: We’re not counting “swaps” here but rather the total number of element placements equals `n` (each array element is overwritten exactly once). The real measure is the size of `count[]` (which is `maxVal + 1`).

**Insights**:

- Counting Sort is excellent when you need guaranteed O(n + k) speed, as long as `k` (range) isn’t huge.
- Flipping the rebuild loop from ascending to descending is all it takes to change sort direction.

---

## ⚠️ Common Pitfalls & Tips

1. **Insertion Sort**:

   - Forgetting to reset `prev` or using the wrong comparison (`>` vs `<`) will break descending behavior.
   - Counting “swaps” vs. “shifts”: We’re really shifting elements right; no true two-element swap happens.

2. **Counting Sort**:

   - Allocating `count[]` of size `maxVal + 1` can be wasteful if `maxVal` is large relative to `n`.
   - Make sure to iterate from `count.length−1` down to `0` to get descending order.

3. **Negative Values**:

   - Basic Counting Sort assumes non-negative integers. To handle negatives, shift values by `|minVal|` as before.

4. **Stability**:

   - Insertion Sort is **stable**: equal elements maintain their original order because we only shift until `prev < curr`.
   - Counting Sort, as implemented (rebuilding by overwriting positions), is **stable** if you fill placements carefully from right to left for equal values. But our simple rebuild from high to low preserves relative order of identical keys.

---

## 🔑 Key Takeaways

- **Insertion Sort (descending)**: O(n²), O(1) space, counts shifts; best for nearly sorted data but costly on very unsorted arrays.
- **Counting Sort (descending)**: O(n + k), O(k) space; fast when `k` is small, but memory-heavy if `k` is large.
- Tracking shifts or placements helps visualize each algorithm’s actual work beyond big-O notation.
- Tomorrow: I’ll consolidate sorting methods and start tackling more advanced O(n log n) sorts.

---

## 📝 Quick Quiz

1. **Why does Insertion Sort track “shifts” instead of “swaps” when implementing descending order?**
2. **Explain how you modify the rebuild phase in Counting Sort to get descending order.**
3. **When would you choose Counting Sort over Insertion Sort on descending data, and why?**

---

_Keep practicing and pay attention to how many times you move data—algorithmic efficiency is more than just big-O!_
