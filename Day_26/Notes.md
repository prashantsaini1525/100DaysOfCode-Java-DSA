# 📘 Day 26: Implementing and Understanding Counting Sort

On Day 26 of my #100DaysOfCode journey, I learned and implemented **Counting Sort**, a non-comparison–based sorting algorithm well-suited for integer arrays with a known (and not-too-large) maximum value. Instead of comparing elements pairwise, Counting Sort:

1. **Tallies** how many times each number appears (using a `count[]` array).
2. **Rebuilds** the sorted array by iterating over the tallied counts.

Below, I’ll explain the key concepts, walk through a step-by-step example, highlight pitfalls, and share insights to help beginners understand why and how Counting Sort works.

---

## 🌟 What Is Counting Sort?

Counting Sort sorts integers by:

1. **Finding the maximum value** in the array to size the `count[]` array.
2. **Tallying** occurrences of each integer into `count[value]`.
3. **Overwriting** the original array in ascending order by reading `count[]` from index 0 to `maxValue`, placing each number `i` exactly `count[i]` times.

**Why does this matter?**

- It’s **non-comparison–based**: no element-to-element comparisons.
- It runs in **O(n + k)** time, where:

  - **n** = number of elements in the input array.
  - **k** = (maximum value in the array + 1).

- It uses **O(k)** extra space for the count array.

---

## 🚀 When to Use Counting Sort

- **Data Type**: Only works on **non-negative integers** (e.g., 0, 1, 2, …).
- **Range Constraint**: The maximum value (`maxVal`) shouldn’t be extremely large compared to `n`. If `k ≫ n`, you’ll allocate a huge count array and waste memory.
- **Stability**: The basic refill method is stable if you iterate `count[]` in ascending order and refill forwards.

**Ideal Scenarios**:

- Sorting exam scores from 0 to 100.
- Counting frequency of small-range keys (e.g., ages 0–120).
- Any time you need a guaranteed O(n + k) performance for integer keys.

---

## 🔍 Step-By-Step Example

Let’s sort `arr = [1, 4, 1, 3, 2, 4, 3, 7]` using Counting Sort.

1. **Find `maxVal`**:

   - Scan the array once. Here, `maxVal = 7`.

2. **Initialize `count` array** of size `maxVal + 1 = 8`:

   ```
   count = [0, 0, 0, 0, 0, 0, 0, 0];
   ```

3. **Tally counts**:

   - For each element `x` in `arr`, do `count[x]++`.
   - After scanning:

     ```
     count = [0, 2, 1, 2, 2, 0, 0, 1];
     // Explanation:
     // Two 1’s at indices arr[0] and arr[2] → count[1] = 2
     // One 2 → count[2] = 1
     // Two 3’s → count[3] = 2
     // Two 4’s → count[4] = 2
     // One 7 → count[7] = 1
     ```

4. **Rebuild the original array**:

   - Initialize an index pointer `j = 0` for `arr`.
   - For `i` from `0` to `maxVal`:

     - While `count[i] > 0`, set `arr[j] = i`, increment `j`, decrement `count[i]`.

   - Step-by-step rebuild:

     1. `i = 0`: `count[0] = 0`, nothing to place.
     2. `i = 1`: `count[1] = 2` → place two 1’s: `arr[0] = 1, arr[1] = 1`.
        Now `j = 2`, `count[1] = 0`.
     3. `i = 2`: `count[2] = 1` → place one 2: `arr[2] = 2`.
        Now `j = 3`, `count[2] = 0`.
     4. `i = 3`: `count[3] = 2` → place two 3’s: `arr[3] = 3, arr[4] = 3`.
        Now `j = 5`, `count[3] = 0`.
     5. `i = 4`: `count[4] = 2` → place two 4’s: `arr[5] = 4, arr[6] = 4`.
        Now `j = 7`, `count[4] = 0`.
     6. `i = 5,6`: `count[5] = count[6] = 0`, skip.
     7. `i = 7`: `count[7] = 1` → place one 7: `arr[7] = 7`.
        Now `j = 8`, `count[7] = 0`.

   - **Result**: `arr` becomes `[1, 1, 2, 3, 3, 4, 4, 7]`.

**Insight**: We never compare `arr` elements directly. We simply tally occurrences and refill.

---

## 🛠️ Core Code Explanation (Summarized)

```java
public class CountingSort {
    public static void countingSort(int[] arr) {
        // 1. Find the maximum value to size the count array
        int maxVal = Integer.MIN_VALUE;
        for (int num : arr) {
            maxVal = Math.max(maxVal, num);
        }

        // 2. Initialize count array of size maxVal + 1
        int[] count = new int[maxVal + 1];

        // 3. Tally each element
        for (int num : arr) {
            count[num]++;
        }

        // 4. Rebuild the array in sorted order
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};
        System.out.println("Original Array:");
        printArr(arr);
        countingSort(arr);
        System.out.println("Sorted Array:");
        printArr(arr);
    }
}
```

- **Step 1**: We scan once to find `maxVal`.
- **Step 2**: We allocate `count[maxVal + 1]` and initialize to zeros.
- **Step 3**: We make one more pass to tally frequencies.
- **Step 4**: We iterate `count[]` from `0` to `maxVal`, refill in ascending order—placing each integer `i` exactly `count[i]` times.

**Time Complexity**: O(n + k)
**Space Complexity**: O(k)
(where `n` = number of elements, `k` = `maxVal + 1`)

---

## ⚠️ Common Pitfalls & Tips

1. **Huge maximum value (`maxVal ≫ n`)**

   - If your array’s maximum integer is very large relative to `n`, the count array becomes big and wastes memory.
   - For sparse or large ranges, consider other sorts (e.g., Radix Sort or Quick Sort).

2. **Negative numbers**

   - Basic Counting Sort assumes non-negative values (0 to `maxVal`).
   - To handle negatives, you can shift all values by `|minVal|` (e.g., if `minVal = -5`, add 5 to all elements before counting).

3. **Stability**

   - The refill-as-you-go approach is stable if you only refill forwards.
   - If you wanted to track original positions (for a stable multi-key sort), you’d need a cumulative count array and fill from the end.

---

## 📝 Quick Quiz

1. **Why does Counting Sort run in O(n + k) time?**

   - We make one scan to find `maxVal` (O(n)), one to tally frequencies (O(n)), and one to rebuild (O(k + n)) at most.
   - Combined, that’s O(n + k).

2. **How would you adapt Counting Sort to handle negative values?**

   - Find both `minVal` and `maxVal`.
   - Shift all numbers by `|minVal|` to make them non-negative.
   - Allocate `count[maxVal - minVal + 1]`.

3. **What’s the trade-off compared to Quick Sort (O(n log n))?**

   - Counting Sort is faster when `k` is small (O(n + k) can be near O(n)).
   - But if `k` (range) is much larger than `n`, you waste space and time zeroing out a large `count[]`.

---

_Counting Sort is a powerful tool when you have integer data with a limited range. Practice implementing it on different datasets to see how the time and space trade-offs play out!_
