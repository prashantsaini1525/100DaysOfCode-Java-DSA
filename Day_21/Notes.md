# 📘 Day 21: Selection Sort Deep Dive

Day 21 of my #100DaysOfCode journey was all about **Selection Sort**, one of the first stepping-stones after Bubble Sort. I explored two main flavors:

1. **Standard Selection Sort**: Picking the minimum each pass and placing it in its correct spot.
2. **Selection Sort with Swap Counting**: Adding a counter to understand how many actual exchanges happen.

Below is **my narrative of each approach**, including pseudocode, a step-by-step walkthrough, and key insights.

---

## 🌟 Why I Chose Selection Sort Next

- After Bubble Sort, I wanted a sort method that still uses simple comparisons but requires fewer swaps.
- Selection Sort does exactly that: it finds the smallest element in the “unsorted” region and moves it into place.
- It’s an in-place O(n²) algorithm that helps me see how swaps relate to initial array disorder.

---

## 🌱 Method 1: Standard Selection Sort

**My mental model**: Imagine scanning a deck of face-up cards, each time finding the smallest card and moving it to the front, gradually building a sorted set at the left.

1. **Iterate** `i` from `0` to `n − 2`. The index `i` marks the boundary between the sorted (left) and unsorted (right) portions.
2. **Find** `minPos`, the index of the smallest element between `i` and `n − 1`.
3. **Swap** the value at `minPos` with the value at `i`. Now the smallest unsorted element is in its final position.
4. **Repeat** for the next `i`, shrinking the unsorted region by one.

```plaintext
for i in 0..n-2:
  minPos = i
  for j in i+1..n-1:
    if arr[j] < arr[minPos]:
      minPos = j
  swap(arr[i], arr[minPos])
```

**Step-by-step example** on `[5, 4, 1, 3, 2]`:

- **Pass 1 (i = 0)**: unsorted = `[5,4,1,3,2]`. Smallest is `1` at index 2. Swap with index 0 ⇒ `[1, 4, 5, 3, 2]`.
- **Pass 2 (i = 1)**: unsorted = `[4,5,3,2]`. Smallest is `2` at index 4. Swap ⇒ `[1, 2, 5, 3, 4]`.
- **Pass 3 (i = 2)**: unsorted = `[5,3,4]`. Smallest is `3` at index 3. Swap ⇒ `[1, 2, 3, 5, 4]`.
- **Pass 4 (i = 3)**: unsorted = `[5,4]`. Smallest is `4` at index 4. Swap ⇒ `[1, 2, 3, 4, 5]`.
- **Pass 5 (i = 4)**: only `[5]` remains—already sorted.

By the end, the array is `[1, 2, 3, 4, 5]`.

**Performance**:

- Time: Always O(n²), because each pass does a full scan of the remaining unsorted portion.
- Space: O(1), since we swap in-place.

**When I’d use this**:

- To demonstrate sorting fundamentals.
- On small arrays or data that’s already nearly sorted, since it only performs n−1 swaps.

---

## 🌲 Method 2: Selection Sort with Swap Counting

**Why I added a swap counter**: I wanted to measure how “unsorted” the input was by counting how many actual exchanges happen.

1. Initialize `swapCount = 0`.
2. Loop `i` from `0` to `n − 2`:

   - Find `minPos` among indices `i..n − 1`.
   - If `minPos != i`, swap `arr[i]` and `arr[minPos]`, and **increment** `swapCount`.

3. Return `swapCount` after sorting.

```plaintext
swapCount = 0
for i in 0..n-2:
  minPos = i
  for j in i+1..n-1:
    if arr[j] < arr[minPos]:
      minPos = j
  if minPos != i:
    swap(arr[i], arr[minPos])
    swapCount++
return swapCount
```

**Example on `[5, 4, 1, 3, 2]`**:

- Pass 1: swap with `1` ⇒ `swapCount = 1`.
- Pass 2: swap with `2` ⇒ `swapCount = 2`.
- Pass 3: swap with `3` ⇒ `swapCount = 3`.
- Pass 4: swap with `4` ⇒ `swapCount = 4`.
- Pass 5: no swap (only one left).

At the end, `swapCount = 4`. That matches exactly how many times the array was rearranged.

**Performance**:

- Time: Still O(n²) (finding `minPos` is the bottleneck).
- Space: O(1).
- The difference is just that we check `minPos != i` and count only real swaps.

**When I’d use this**:

- To analyze how “shuffled” different inputs are.
- When I want accurate swap metrics in unit tests or performance write‑ups.

---

## 📊 Quick Reference

| Method                         | Time  | Space | Swap Behavior                             |
| ------------------------------ | ----- | ----- | ----------------------------------------- |
| Standard Selection Sort        | O(n²) | O(1)  | Exactly n−1 swaps (even if redundant)     |
| Selection Sort w/ Swap Counter | O(n²) | O(1)  | Counts only real swaps when `minPos != i` |

---

## 🔑 Key Takeaways

- Selection Sort finds the smallest unsorted element each pass and moves it into place—simple to understand but O(n²).
- Counting swaps helps reveal how sorted (or unsorted) the input was initially.
- Both variations are in-place, making Selection Sort suitable for memory-constrained environments but not for very large datasets.

**Next up**: On Day 22, I’ll compare Selection Sort to **Insertion Sort**, to see how one extra comparison strategy changes performance and behavior. 🚀
