# 📘 Day 23: Insertion Sort Deep Dive

On Day 23 of my #100DaysOfCode journey, I focused on **Insertion Sort**, exploring three variations:

1. **Basic Insertion Sort** — sorts in increasing order by shifting elements.
2. **Insertion Sort with Swap Counting** — same logic but tracks how many shifts (swaps) occur.
3. **Insertion Sort in Decreasing Order with Swap Count** — flips comparison to sort in reverse while counting shifts.

Below is **my narrative for each variant**, including how it works, pseudocode, examples, performance, and insights.

---

## 🌟 Why Insertion Sort?

- **Intuitive for small or nearly sorted arrays** — like sorting a hand of cards.
- **Adaptive** — runs in O(n) time on already sorted data.
- **In-place** and **stable**, maintaining relative order of equal elements.

**Key traits**:

- Time Complexity:

  - Best Case: O(n) when the array is already sorted.
  - Average & Worst Case: O(n²).

- Space Complexity: O(1) (only a few extra variables).
- Stability: Stable by default.

---

## 🌱 Variant 1: Basic Insertion Sort (Increasing Order)

**My approach**:

1. Traverse from index `1` to `n − 1`.
2. Let `key = arr[i]`. Initialize `prev = i − 1`.
3. While `prev >= 0` and `arr[prev] > key`, shift `arr[prev]` to `arr[prev + 1]` and decrement `prev`.
4. After finding the correct spot, set `arr[prev + 1] = key`.
5. Repeat until the array is fully sorted.

```plaintext
for i in 1..n-1:
  key = arr[i]
  prev = i - 1
  while prev >= 0 and arr[prev] > key:
    arr[prev + 1] = arr[prev]
    prev--
  arr[prev + 1] = key
```

**Step-by-step example on** `[5, 4, 1, 3, 2]`:

- **Pass 1 (i = 1)**: `key = 4`, compare with `5`, shift `5` → `[5, 5, 1, 3, 2]`, insert `4` → `[4, 5, 1, 3, 2]`.
- **Pass 2 (i = 2)**: `key = 1`, shift `5` → `[4, 5, 5, 3, 2]`, shift `4` → `[4, 4, 5, 3, 2]`, insert `1` → `[1, 4, 5, 3, 2]`.
- **Pass 3 (i = 3)**: `key = 3`, shift `5` → `[1, 4, 5, 5, 2]`, shift `4` → `[1, 4, 4, 5, 2]`, insert `3` → `[1, 3, 4, 5, 2]`.
- **Pass 4 (i = 4)**: `key = 2`, shift `5` → `[1, 3, 4, 5, 5]`, shift `4` → `[1, 3, 4, 4, 5]`, shift `3` → `[1, 3, 3, 4, 5]`, insert `2` → `[1, 2, 3, 4, 5]`.

**Final Result**: `[1, 2, 3, 4, 5]`

**Performance**:

- Time: O(n²) average & worst, O(n) best.
- Space: O(1).

**When to use**: Small or nearly sorted arrays, or teaching purposes to illustrate adaptive sorting.

---

## 🌲 Variant 2: Insertion Sort with Swap Counting

**What I added**: A **swap (shift) counter** to measure how many moves occur.

1. Initialize `swapCount = 0`.
2. For each `i` from `1` to `n − 1`, set `key = arr[i]` and `prev = i − 1`.
3. While `prev >= 0` and `arr[prev] > key`, shift and increment `swapCount`:

   ```plaintext
   arr[prev + 1] = arr[prev]
   swapCount++
   prev--
   ```

4. Insert `key` at `arr[prev + 1]`.
5. After the loop, print `swapCount`.

```plaintext
swapCount = 0
for i in 1..n-1:
  key = arr[i]
  prev = i - 1
  while prev >= 0 and arr[prev] > key:
    arr[prev + 1] = arr[prev]
    swapCount++
    prev--
  arr[prev + 1] = key
print "Total swaps: " + swapCount
```

**Example on** `[5, 4, 1, 3, 2]`:

- Pass 1: shift `5` (swapCount = 1), insert `4`.
- Pass 2: shift `5` (2), shift `4` (3), insert `1`.
- Pass 3: shift `5` (4), shift `4` (5), shift `3` (6), insert `3`.
- Pass 4: shift `5` (7), shift `4` (8), shift `3` (9), shift `2` (10), insert `2`.

**Total swaps = 10**

**Performance**:

- Time: O(n²), counts shifts.
- Space: O(1).

**When to use**: Analyzing how sorted the array is; benchmarking and understanding input characteristics.

---

## 🔄 Variant 3: Insertion Sort (Decreasing Order with Swap Count)

**My variation**: Flip comparison to sort in reverse and count shifts.

1. Initialize `swapCount = 0`.
2. For `i` from `1` to `n − 1`, set `key = arr[i]`, `prev = i − 1`.
3. While `prev >= 0` and `arr[prev] < key`, shift and increment `swapCount`:

   ```plaintext
   arr[prev + 1] = arr[prev]
   swapCount++
   prev--
   ```

4. Insert `key` at `arr[prev + 1]`.
5. Print `swapCount`.

```plaintext
swapCount = 0
for i in 1..n-1:
  key = arr[i]
  prev = i - 1
  while prev >= 0 and arr[prev] < key:
    arr[prev + 1] = arr[prev]
    swapCount++
    prev--
  arr[prev + 1] = key
print "Total swaps: " + swapCount
```

**Example on** `[5, 4, 1, 3, 2]`:

- Pass 1: `key = 4`, no shifts (swapCount = 0), insert → `[5, 4, 1, 3, 2]`.
- Pass 2: `key = 1`, no shifts (array is decreasing), insert → `[5, 4, 1, 3, 2]`.
- Pass 3: `key = 3`, shift `1` (swapCount = 1), insert → `[5, 4, 3, 1, 2]`.
- Pass 4: `key = 2`, shift `1` (2), insert → `[5, 4, 3, 2, 1]`.

**Total swaps = 2**

**Final Result**: `[5, 4, 3, 2, 1]`

**Performance**:

- Time: O(n²).
- Space: O(1).

**When to use**: When a reverse-sorted array is needed; analyzing input disorder in descending context.

---

## 📊 Quick Comparison

| Variant                                | Time  | Space | Shift Behavior                            |
| -------------------------------------- | ----- | ----- | ----------------------------------------- |
| Basic Insertion Sort                   | O(n²) | O(1)  | Shifts until key is placed                |
| Insertion Sort w/ Swap Count           | O(n²) | O(1)  | Counts each shift; reveals input disorder |
| Insertion Sort (Desc, with Swap Count) | O(n²) | O(1)  | Shifts for descending insertion; counts   |

---

## 🔑 Key Takeaways

- **Insertion Sort** is adaptive and efficient for small or nearly sorted data.
- Counting shifts shines light on how unsorted the array originally was.
- Flipping comparison for descending order changes shift patterns and resulting order.
- All versions operate in-place with O(1) space but O(n²) time worst-case.

Tomorrow: I’ll explore **Insertion Sort** with different methods and optimizations—diving deeper into its variations and performance! 🚀
