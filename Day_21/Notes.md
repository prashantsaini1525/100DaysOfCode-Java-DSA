# 📘 Day 21: Lecture 4 – Selection Sort

On Day 21 of my #100DaysOfCode, I dove into **Selection Sort**, a stepping‑stone from Bubble Sort that minimizes swaps by always choosing the smallest unsorted element and placing it in its rightful position.

---

## Lecture 4: Selection Sort

Imagine you have a messy deck of cards and you want to pick out the smallest card one by one and place each in its correct position. **Selection Sort** works just like that: it repeatedly finds the smallest (or largest) unsorted item and moves it to its final sorted spot.

---

## How Selection Sort Works Step by Step

1. **Start at the beginning** of the list (index 0). Consider this the boundary between sorted and unsorted.
2. **Find the smallest item** in the unsorted portion of the list.
3. **Swap** that smallest item with the first item of the unsorted portion.
4. **Move the boundary** one position to the right.
5. **Repeat** steps 2–4 until the entire list is sorted.

---

### Visual Example 1: `[29, 10, 14, 37, 13]`

- **Pass 1 (i = 0)**:
  - Unsorted portion: indices 0–4 = `[29, 10, 14, 37, 13]`
  - Smallest value: **10** at index 1.
  - Swap with index 0: `[10, 29, 14, 37, 13]`
  - Sorted portion: `[10]`, Unsorted now indices 1–4.

- **Pass 2 (i = 1)**:
  - Unsorted portion: `[29, 14, 37, 13]`.
  - Smallest value: **13** at index 4.
  - Swap with index 1: `[10, 13, 14, 37, 29]`
  - Sorted portion: `[10, 13]`, Unsorted indices 2–4.

- **Pass 3 (i = 2)**:
  - Unsorted portion: `[14, 37, 29]`.
  - Smallest value: **14** at index 2.
  - Swap with index 2: no change `[10, 13, 14, 37, 29]`
  - Sorted portion: `[10, 13, 14]`.

- **Pass 4 (i = 3)**:
  - Unsorted portion: `[37, 29]`.
  - Smallest value: **29** at index 4.
  - Swap with index 3: `[10, 13, 14, 29, 37]`
  - Sorted portion: `[10, 13, 14, 29]`.

- **Pass 5 (i = 4)**:
  - Only one element `[37]` remains; already sorted.

**Result after pass 5**: `[10, 13, 14, 29, 37]`

---

## Pseudocode

```plaintext
function selectionSort(array):
    n = length of array
    for i from 0 to n - 2:
        minIndex = i
        for j from i + 1 to n - 1:
            if array[j] < array[minIndex]:
                minIndex = j
        if minIndex != i:
            swap array[i] and array[minIndex]
``` 

- **Explanation**:
  - `minIndex` tracks the position of the smallest element in the unsorted part.
  - After the inner loop, if `minIndex` changed, we swap the elements.

---

## Time & Space Complexity

- **Time (Best, Average & Worst Case)**: O(n²) — always performs full scans of the unsorted remainder.
- **Space**: O(1) — sorts the array in-place with only constant extra variables.

---

## Pros & Cons

**Pros**:

- Very intuitive and easy to implement.
- Makes at most n – 1 swaps, which is ideal when swap cost is high.
- Requires no additional memory beyond the input array.

**Cons**:

- Always O(n²) time, even if the list is already partly sorted.
- Not adaptive—performs the same work regardless of initial order.
- Inefficient on large datasets compared to O(n log n) sorts.

---

### Visual Example 2: `{5, 4, 1, 3, 2}`

- **Pass 1 (i = 0)**:
  - `[5, 4, 1, 3, 2]` → smallest **1** at index 2 → swap with index 0 → `[1, 4, 5, 3, 2]`

- **Pass 2 (i = 1)**:
  - `[4, 5, 3, 2]` → smallest **2** at index 4 → swap with index 1 → `[1, 2, 5, 3, 4]`

- **Pass 3 (i = 2)**:
  - `[5, 3, 4]` → smallest **3** at index 3 → swap with index 2 → `[1, 2, 3, 5, 4]`

- **Pass 4 (i = 3)**:
  - `[5, 4]` → smallest **4** at index 4 → swap with index 3 → `[1, 2, 3, 4, 5]`

- **Pass 5 (i = 4)**:
  - `[5]` remains—sorted.

**Final Result**: `[1, 2, 3, 4, 5]`

---

## When & Why to Use Selection Sort

- **Small datasets**: straightforward for small arrays.
- **Write-limited scenarios**: minimal number of swaps.
- **Educational purposes**: helps illustrate the selection concept before moving to more complex sorts.

---

## Next Step: Selection Sort Variant – Descending Order

On the next iteration, I’ll implement a **descending-order Selection Sort**, flipping the comparison logic to repeatedly select the *largest* unsorted element and move it to the front. This will deepen my understanding of how minor tweaks in the inner comparison can reverse the sort direction while preserving in-place efficiency.
