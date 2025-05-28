# 📘 Day 19: Completing the Arrays Assignment — 3Sum (Q5)

Over the last three days I’ve worked through the Apna College arrays sheet:

- **Day 17**: Q1 (Duplicates) & Q2 (Rotated Search)
- **Day 18**: Q3 (Best Time to Buy & Sell Stock) & Q4 (Trapping Rain Water)
- **Day 19**: Q5 (3Sum)

Today’s challenge is the final question—finding all unique triplets that sum to zero. Let’s dive in!

---

## The 3Sum Problem

**Task**: Given an integer array `nums`, find all unique triplets `[a, b, c]` where `a + b + c == 0`.

- Triplets must not repeat, and order within each triplet should be non-descending.
- Edge cases: empty array or fewer than 3 elements → return an empty list.

---

## 🌱 Method 1: Brute-Force Triples + Dedupe

**My thinking**: Let me start with the simplest idea—check every combination of three elements, then filter out duplicates at the end.

1. **Nested Loops**: Three loops (`i`, `j`, `k`) to test every possible trio.
2. **Check Sum**: If `nums[i] + nums[j] + nums[k] == 0`, add `[nums[i], nums[j], nums[k]]` to a result list.
3. **Remove Duplicates**: Wrap the list in a `LinkedHashSet`, then back to a list to keep unique triplets in the order I found them.

```text
for i in 0..n-3:
  for j in i+1..n-2:
    for k in j+1..n-1:
      if nums[i]+nums[j]+nums[k] == 0:
        add [nums[i], nums[j], nums[k]] to results
results = unique(results)  # via LinkedHashSet
return results
```

- **Performance**: O(n³) time, O(n) extra space for dedupe.
- **Why I tried it**: It’s the most straightforward translation of the problem statement.
- **When I’d use it**: On small inputs or to confirm correctness before optimizing.

---

## 🌲 Method 2: Sort + Two-Pointer Pairing

**My refinement**: I know sorting can help skip duplicates and speed up pair searches—so I combined sorting with a two-pointer scan.

1. **Sort** `nums`.
2. **Fix** an element at index `i`, then use two pointers `left = i+1` and `right = n-1` to find `left + right == -nums[i]`.
3. **Skip Duplicates**: After finding a triplet, move `left` and `right` past any equal neighbors.

```text
sort(nums)
for i in 0..n-3:
  if i>0 and nums[i]==nums[i-1]: continue  # skip same base value
  target = -nums[i]
  left = i+1, right = n-1
  while left < right:
    sum = nums[left] + nums[right]
    if sum == target:
      add [nums[i], nums[left], nums[right]]
      move left++ past duplicates, right-- past duplicates
    else if sum < target:
      left++
    else:
      right--
return results
```

- **Performance**: O(n²) time, O(log n) or O(n) space (depending on sort implementation).
- **Why it clicks**: Sorting plus two-pointer is a familiar pattern that handles both sum and duplicates elegantly.
- **When I’d use it**: On larger inputs—this is my go-to in interviews.

---

---

## 📊 Quick Reference

| Question           | Best Method           | Time Complexity | Space Complexity |
| ------------------ | --------------------- | --------------- | ---------------- |
| Q1: Duplicates     | HashSet Lookup        | O(n)            | O(n)             |
| Q2: Rotated Search | Pivot + Binary Search | O(log n)        | O(1)             |
| Q3: Stock I        | One-Pass Greedy Scan  | O(n)            | O(1)             |
| Q4: Rain Trap      | Two-Pointer Technique | O(n)            | O(1)             |
| Q5: 3Sum           | Sort + Two-Pointer    | O(n²)           | O(log n)¹        |

> ¹Space for sorting; binary search pointers only use O(1).

---

## 🗒️ Quick Summaries

- **Q1: Contains Duplicate** — Track seen values in a HashSet to spot repeats in one pass.
- **Q2: Search in Rotated Array** — Find the pivot or use a modified binary search to identify the sorted half.
- **Q3: Best Time to Buy & Sell Stock** — Maintain the lowest buy price and update the max profit as you scan.
- **Q4: Trapping Rain Water** — Use two pointers moving inward to accumulate water based on the current boundary.
- **Q5: 3Sum** — Sort the array, then fix one element and use two pointers to find complementary pairs.

---

## 🔑 My Takeaways

- Starting simple (brute-force) confirmed my logic before I optimized.
- Sorting + two-pointer scales to bigger arrays and keeps code concise.
- Proper duplicate-skipping (either via sets or pointer moves) is vital for correctness.

That completes my Apna College array assignment—onward to new challenges! 🚀
