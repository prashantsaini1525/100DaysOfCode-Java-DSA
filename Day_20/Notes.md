# 📘 Day 20: Diving into Sorting — Bubble Sort Unwrapped

On Day 20 of my #100DaysOfCode, I explored **sorting fundamentals** and implemented **Bubble Sort** in two flavors:

1. **Standard Bubble Sort** — basic swapping until the list is sorted.
2. **Bubble Sort with Swap Count** — same steps but tracking how many swaps occur.

Let’s break down what I learned, why it works, and when each variant shines.

---

## 🔍 Why Sorting Matters

- **Order Unlocks Efficiency**: Once data is sorted, searching and merging become lightning-fast.
- **Foundation for Algorithms**: Many advanced techniques (binary search, heap operations) assume sorted inputs.
- **Insightful Metrics**: Counting operations—like swaps—helps gauge algorithm behavior on different inputs.

---

## 🌟 Bubble Sort Basics

**Concept**: Repeatedly step through the list, compare adjacent items, and swap them if they’re out of order. Largest unsorted element “bubbles” to its correct spot each pass.

### How I Visualize It

Imagine a row of balloons sorted by size. You keep comparing neighbors and swapping smaller balloons toward the front so the biggest ones drift backward—pass after pass until all balloons line up by size.

---

## 📝 Pseudocode (Standard)

```text
for each pass from 0 to n-2:
  for j from 0 to n-2-pass:
    if arr[j] > arr[j+1]:
      swap(arr[j], arr[j+1])
```

- **Pass Count**: Each outer loop iteration places one more element in its final position.
- **Termination**: After n-1 passes, the array is guaranteed sorted.

**Performance**: O(n²) comparisons and swaps in the worst case, O(1) extra space.

---

## 💡 Bubble Sort with Swap Counter

**Extension**: I added a **swap counter** to measure how many swaps occur during sorting.

1. Initialize `swapCount = 0`.
2. Every time I swap two elements, increment `swapCount`.
3. After sorting, report `swapCount`—a simple metric of how “unsorted” the input was.

```text
swapCount = 0
for each pass i in 0..n-2:
  for j in 0..n-2-i:
    if arr[j] > arr[j+1]:
      swap(arr[j], arr[j+1])
      swapCount++
print swapCount
```

**Insight**: A higher swap count means more disorder in the original list. This helps compare datasets or tune inputs for teaching and analysis.

---

## ✅ When to Use Bubble Sort

- **Learning Tool**: Bubble Sort’s simplicity makes it ideal for understanding how comparisons and swaps work.
- **Nearly Sorted Data**: On almost-sorted lists, Bubble Sort can finish quickly if you add an early-exit check (not covered today).
- **Metrics Experimentation**: Counting swaps or passes gives tangible feedback on algorithm behavior.

**Next Step**: Tomorrow, I’ll explore **Selection Sort** and **Insertion Sort** to compare their trade-offs and get a broader view of O(n²) algorithms.

---

_Keep experimenting and visualizing—sorting is the gateway to efficient algorithms!_
