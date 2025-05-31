# 📘 Day 22: Selection Sort Variations Deep Dive

On Day 22 of my #100DaysOfCode, I extended my exploration of **Selection Sort** by experimenting with three versions:

1. **Basic Selection Sort with Always-Swap** — the fundamental in-place sort that swaps once every pass.
2. **Selection Sort Returning Swap Count** — a version that returns the number of swaps performed.
3. **Optimized Selection Sort (Conditional Swap)** — only swaps when the minimum isn’t already in place, yielding a true count of effective swaps.

Below is **my narrative for each variant**, with pseudocode, examples, performance notes, and key insights.

---

## 🌟 Why These Variations?

- After mastering the core Selection Sort, I wanted to see how small tweaks affect swap behavior and metrics.
- By comparing always-swapping versus conditional swapping, I can better understand the relationship between algorithm logic and array disorder.
- Returning metrics (like swap count) from the function makes testing and analysis more flexible.

---

## 🌱 Variant 1: Basic Selection Sort (Always-Swap)

**My approach**:

1. For each index `i` from `0` to `n − 2`, set `minPos = i`.
2. Scan indices `j = i+1` to `n − 1` to find the smallest element’s index.
3. **Swap unconditionally** the element at `minPos` with `arr[i]`, even if `minPos == i`.
4. Repeat until the entire array is sorted.

```plaintext
for i in 0..n-2:
  minPos = i
  for j in i+1..n-1:
    if arr[j] < arr[minPos]:
      minPos = j
  swap(arr[minPos], arr[i])
```

**Step-by-step example** on `[5, 4, 1, 3, 2]`:

- **Pass 1 (i = 0)**: unsorted = `[5,4,1,3,2]`. Smallest is `1` (index 2). Swap ⇒ `[1, 4, 5, 3, 2]`.
- **Pass 2 (i = 1)**: unsorted = `[4,5,3,2]`. Smallest is `2` (index 4). Swap ⇒ `[1, 2, 5, 3, 4]`.
- **Pass 3 (i = 2)**: unsorted = `[5,3,4]`. Smallest is `3` (index 3). Swap ⇒ `[1, 2, 3, 5, 4]`.
- **Pass 4 (i = 3)**: unsorted = `[5,4]`. Smallest is `4` (index 4). Swap ⇒ `[1, 2, 3, 4, 5]`.
- **Pass 5 (i = 4)**: single element `[5]`, swap with itself ⇒ no change.

**Performance**:

- Time: O(n²) always, because of nested scans.
- Space: O(1), in-place swaps.

**When I’d use this**:

- As a baseline for measuring other variants.
- Teaching the core Selection Sort logic without conditional checks.

---

## 🌲 Variant 2: Selection Sort Returning Swap Count

**My modification**:

1. Initialize `swapCount = 0`.
2. For each `i` from `0` to `n − 2`, find `minPos` as before.
3. **Swap unconditionally** `arr[minPos]` with `arr[i]`, then **increment** `swapCount` by 1.
4. After sorting, **return** `swapCount` instead of printing directly.

```plaintext
swapCount = 0
for i in 0..n-2:
  minPos = i
  for j in i+1..n-1:
    if arr[j] < arr[minPos]:
      minPos = j
  swap(arr[minPos], arr[i])
  swapCount++
return swapCount
```

**Example on `[5, 4, 1, 3, 2]`**:

- Pass 1: swap with `1` ⇒ `swapCount = 1`.
- Pass 2: swap with `2` ⇒ `swapCount = 2`.
- Pass 3: swap with `3` ⇒ `swapCount = 3`.
- Pass 4: swap with `4` ⇒ `swapCount = 4`.
- Pass 5: swap with itself (`5`), but still counts ⇒ `swapCount = 5`.

At the end, this variant reports `swapCount = 5`, showing the number of passes.

**Performance**:

- Time: O(n²).
- Space: O(1).
- Provides insight into how many passes are executed (always n − 1).

**When I’d use this**:

- When I want a clear count of how many passes/swaps were performed.
- Useful in unit tests to validate the algorithm performed the expected number of operations.

---

## 🌱 Variant 3: Optimized Selection Sort (Conditional Swap)

**My refinement**:

1. Initialize `swapCount = 0`.
2. For each `i` from `0` to `n − 2`, find `minPos`.
3. **If** `minPos != i`, **swap** `arr[minPos]` and `arr[i]`, and increment `swapCount`. Otherwise, skip swapping.
4. After sorting, return `swapCount`.

```plaintext
swapCount = 0
for i in 0..n-2:
  minPos = i
  for j in i+1..n-1:
    if arr[j] < arr[minPos]:
      minPos = j
  if minPos != i:
    swap(arr[minPos], arr[i])
    swapCount++
return swapCount
```

**Example on `[5, 4, 1, 3, 2]`**:

- Pass 1: swap with `1` ⇒ `swapCount = 1`.
- Pass 2: swap with `2` ⇒ `swapCount = 2`.
- Pass 3: swap with `3` ⇒ `swapCount = 3`.
- Pass 4: swap with `4` ⇒ `swapCount = 4`.
- Pass 5: `minPos == i` (only one left), so **no swap** ⇒ `swapCount` remains 4.

At the end, `swapCount = 4`, reflecting only effective swaps.

**Performance**:

- Time: O(n²).
- Space: O(1).
- Yields an accurate swap count that matches how many elements actually moved.

**When I’d use this**:

- When I need to measure real rearrangements, especially for nearly sorted data.
- To compare how input disorder affects actual swaps versus just passes.

---

## 📊 Quick Reference

| Variant                            | Time  | Space | Swap Behavior                                |
| ---------------------------------- | ----- | ----- | -------------------------------------------- |
| Basic (Always-Swap)                | O(n²) | O(1)  | Exactly n − 1 swaps (one swap per pass)      |
| Returning Swap Count (Always-Swap) | O(n²) | O(1)  | Returns n − 1, counting even redundant swaps |
| Optimized (Conditional Swap)       | O(n²) | O(1)  | Returns actual swaps only when `minPos != i` |

---

## 🔑 Key Takeaways

- Selection Sort is consistent in-place sorting with O(n²) time complexity.
- Unconditional swapping (variants 1 & 2) guarantees n − 1 swaps, even when unnecessary.
- Conditional swapping (variant 3) reduces redundant operations and yields an accurate measure of array disorder.

**Next up**: On Day 23, I’ll explore **Insertion Sort**, comparing its mechanics and performance to Selection Sort. 🚀
