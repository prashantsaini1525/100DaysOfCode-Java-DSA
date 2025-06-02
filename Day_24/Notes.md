# 📘 Day 24: Refining Insertion Sort with Swap Counters

On Day 24 of my #100DaysOfCode journey, I refined **Insertion Sort** by focusing on **efficient swap counting** through two approaches:

1. **Insertion Sort returning swap count via local counter** — method returns the number of shifts performed.
2. **Insertion Sort with static swapCount variable** — using a class-level counter to accumulate shifts.

Below is **my overview** of both implementations, highlighting key logic, pseudocode, and insights (code details summarized).

---

## 🌟 Why Count Shifts in Insertion Sort?

- **Analyze disorder**: Counting shifts reveals how unsorted the input array is.
- **Benchmark algorithms**: Shift metrics help compare performance across inputs.
- **Understand overhead**: Highlights the cost of moving elements in insertion sort.

**Key traits**:

- Both versions maintain Insertion Sort’s time complexity (O(n²) worst-case, O(n) best-case) and in-place, stable behavior.
- Swap (shift) counts provide concrete metrics for algorithm analysis.

---

## 🌱 Variant 1: Local Swap Counter

**Logic Overview**:

- Use a local integer `swap` inside the `insertionSort` method to count each shift.

- For each index `i` from 1 to n−1:

  1. Store `key = arr[i]` and set `prev = i − 1`.

  2. While `prev >= 0` and `arr[prev] > key`:

     - Shift `arr[prev]` to `arr[prev + 1]`, increment `swap`, and decrement `prev`.

  3. Place `key` at `arr[prev + 1]`.

- Return `swap` to get total shift count.

**Pseudocode**:

```plaintext
function insertionSort(arr):
  swap = 0
  for i from 1 to length(arr) − 1:
    key = arr[i]
    prev = i − 1
    while prev ≥ 0 and arr[prev] > key:
      arr[prev + 1] = arr[prev]
      swap = swap + 1
      prev = prev − 1
    arr[prev + 1] = key
  return swap
```

**Insights**:

- Encapsulating `swap` locally allows multiple calls without side effects.
- Returning the count lets main functions handle printing or further analysis.

---

## 🌲 Variant 2: Static `swapCount` Variable

**Logic Overview**:

- Declare a static integer `swapCount` at class scope.
- Run insertion sort similarly, but increment `swapCount` for each shift.
- After sorting, return or print `swapCount`.

**Pseudocode**:

```plaintext
static swapCount = 0
function insertionSort(arr):
  for i from 1 to length(arr) − 1:
    key = arr[i]
    prev = i − 1
    while prev ≥ 0 and arr[prev] > key:
      arr[prev + 1] = arr[prev]
      swapCount = swapCount + 1
      prev = prev − 1
    arr[prev + 1] = key
  return swapCount
```

**Insights**:

- Using a static counter simplifies method signature but requires resetting `swapCount` before each run.
- Convenient for quick diagnostics but can lead to stale values if not managed.

---

## 🔑 Key Takeaways

- Both variants correctly count shifts in insertion sort, providing metrics on input disorder.
- **Local counter** ensures no leftover state between calls and is safer for testing.
- **Static counter** offers easy access but requires careful reset management.
- Insertion Sort remains O(n²) worst-case, O(n) best-case, and stable; shift counting does not affect the algorithm’s complexity.

Tomorrow: I’ll learn **inbuilt sort concept** and write code for inbuilt sort. 🚀