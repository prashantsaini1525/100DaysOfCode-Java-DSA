# 100 Days Of Code - Log

### Day 1: May 07, 2025

**Today's Progress**: Learned how to create arrays in Java, took input using Scanner, printed values, and passed the array to a method to observe changes.

**Thoughts:** It was exciting to start with arrays. Understanding how to manipulate them and observe changes through methods was insightful.

**Link to work:** [Day_01](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_01)

### Day 2: May 08, 2025

**Today's Progress**: Learned linear search in Java—stepped through each element to find a target value, counted how many checks it took, and returned the index (or –1 if not found).

**Thoughts**: Linear search helped me understand the importance of algorithm efficiency. It's motivating to see how these basic algorithms work.

**Link(s) to work**: [Day_02](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_02)

### Day 3: May 09, 2025

**Today's Progress**: Learned to find the largest, second largest, and smallest elements in an array, calculate the sum of all elements, and implement binary search in Java.

**Thoughts** Diving deeper into array operations and binary search has been challenging but rewarding. Each concept builds upon the last, and I'm gaining confidence.

**Link(s) to work**: [Day_03](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_03)

### Day 4: May 10, 2025

**Today's Progress**: Learned Reversed an array by swapping elements using a two-pointer technique, generated all unique pairs in an array with nested loops, and calculated the total number of pairs in Java both programmatically and via a combinatorial formula.

**Thoughts** This deep dive into two-pointer methods and nested loops strengthened my understanding of in-place algorithms and reinforced how mathematical reasoning can validate code outputs. Feeling more confident about array manipulations! 💪

**Link(s) to work**: [Day_04](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_04)

### Day 5: May 11, 2025

**Today's Progress**: Implemented a method to print all subarrays of a given array in Java. This includes:

- **Single-element subarrays**: Each individual element of the array.

- **Multi-element subarrays**: Subarrays containing at least two elements. This is achieved by starting the inner loop (`j`) from `i + 1`, ensuring each subarray has at least two elements.

- **Sum of each subarray**: Calculated and printed the sum of elements for each subarray.

- **Maximum and minimum of each subarray**: For each subarray, determined and printed the maximum and minimum values.

**Thoughts** This exercise enhanced my understanding of array manipulation and the importance of nested loops in generating subarrays. It also reinforced the significance of calculating sum, maximum, and minimum values for each subarray, which is crucial for various algorithmic problems. 💪

**Link(s) to work**: [Day_05](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_05)

### Day 6: May 12, 2025

**Today's Progress**: Went full brute-force! Generated every possible subarray, printed each one, and tracked both the maximum and minimum subarray sums in Java using triple nested loops. 🚀

**Highlights**:

- Built three nested loops to collect subarrays and calculate their sums on the fly.
- Maintained `maxSum` and `minSum` variables initialized to extreme values to capture global highs and lows.
- Printed each subarray with its sum for clear, step-by-step validation.

**Thoughts**: Diving into brute-force solidifies the foundations before moving to optimizations. Understanding the mechanics of each loop iteration fuels smarter algorithm design later! 💪

**Link(s) to work:** [Day_06](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_06)

### Day 7: May 13, 2025

**Today's Progress**: Applied the prefix sum approach to efficiently calculate maximum and minimum subarray sums, printing each prefix max, prefix min, and both values together in Java with quadratic time complexity.

**Detailed Explanation**:

- **Prefix Array Construction**: Created a `prefix[]` array where `prefix[i]` equals the sum of `numbers[0]` through `numbers[i]`, computed in a single O(n) pass.
- **Subarray Sum Retrieval**: For each start index `i` and end index `j` (i ≤ j), computed the subarray sum in O(1) as `prefix[j] - (i > 0 ? prefix[i-1] : 0)`.
- **Tracking Extremes**:

  - **If-Statements**: Initially, compared `currSum` with `maxSum` and `minSum` using `if` checks to update extremes.
  - **Math Utility Shortcuts**: Refactored using `maxSum = Math.max(maxSum, currSum)` and `minSum = Math.min(minSum, currSum)` for cleaner, more concise updates.

- **Combined Reporting**: Inside the loops, printed current subarray sum alongside updated prefix max/min for real-time insight.

**Thoughts**: Using prefix sums sliced down redundant summations and deepened my grasp of cumulative techniques. Introducing Java’s `Math.max`/`Math.min` methods made the code more elegant and readable. Visualizing how prefix max and min evolve sharpened my intuition for more advanced sliding window and Kadane’s algorithms next! ⚡️

**Link(s) to work:** [Day_07](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_07)

### Day 8: May 14, 2025

**Today's Progress**: Stepped into the world of efficient algorithms with **Kadane’s Algorithm**! Solved the **maximum subarray sum problem** in linear time **O(n)** using a single loop and constant space. 🚀

**Highlights**:

- Used a single pass to **track running sum (`currentSum`)** and **update the best sum (`maxSum`)** seen so far.
- Learned that if `currentSum` drops below 0, it's better to **restart** the subarray from the next index.
- Applied `Math.max()` to constantly compare and store the best subarray result on the fly.
- Realized why Kadane’s is a **game-changer** compared to brute-force and prefix methods—it’s clean, fast, and elegant!

**Thoughts**: Kadane’s Algorithm blew my mind with its simplicity and power. After wrestling with O(n²) and O(n³) methods, solving the same problem in O(n) feels like upgrading to superhero mode. Tomorrow, I’ll learn how Kadane’s works with **all-negative arrays**. 💪

**Link(s) to work:** [Day_08](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_08)

### Day 9: May 15, 2025

**Today's Progress**: Took Kadane’s Algorithm to the **next level** by applying it to arrays with **all negative numbers**. Gained clarity on why initializing with the **first element** is crucial when negative values dominate. 💡

**Highlights**:

- Applied a refined version of Kadane’s Algorithm tailored for **all-negative arrays**.
- Learned that initializing both `currentSum` and `maxSum` with the **first element** handles edge cases properly.
- Compared two clean implementations using `Math.max()` to dynamically choose between restarting or continuing the subarray.
- Reinforced the principle that even in negative-only arrays, the **least negative** number is the correct answer.

**Thoughts**: Handling edge cases is where real understanding begins. Today’s lesson showed how a powerful algorithm like Kadane’s can still trip you up if the initial values aren’t carefully chosen. Tomorrow, I’ll look into printing subarrays along with their max sums.

**Link(s) to work:** [Day_09](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_09)

### Day 10: May 16, 2025

**Today's Progress**: Implemented the Trapping Rain Water solution in Java using auxiliary `leftMax[]` and `rightMax[]` arrays to achieve linear time **O(n)** and linear space **O(n)**. Validated that the sample elevation map `{4, 2, 0, 6, 3, 2, 5}` traps **11** units of water in total.

**Thoughts**: Correcting my initial output reinforced the importance of manual verification and test-case walkthroughs. Precomputing boundary arrays simplifies the core logic, and next I’ll refine this further with a two-pointer method to reduce space to **O(1)**.

**Link(s) to work**: [Day_10](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_10/01_TrappingRainWater_Concept_01)

### Day 11: May 17, 2025

**Today's Progress**: Solved the Trapping Rain Water problem on a new elevation map `{0,1,0,2,1,0,1,3,2,1,2,1}` using the two-array boundary approach in Java. Confirmed that the algorithm correctly computes **6** units of trapped water for this input.

**Thoughts**: Walking through each index of the array and comparing `leftMax[i]` and `rightMax[i]` really cemented my understanding of how boundary preprocessing drives the solution. Seeing the result match the expected 6 units strengthened my confidence. Next, I’ll implement the optimized two-pointer version to bring space down to O(1)!

**Link(s) to work**: [Day_11](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_11)

### Day 12: May 18, 2025

**Today's Progress**: Re‐solved the Trapping Rain Water problem on `{0,1,0,2,1,0,1,3,2,1,2,1}` using the **two-pointer** technique in Java. Instead of extra arrays, I maintained `leftMax` and `rightMax` on the fly and moved two pointers inward, achieving **O(n)** time and **O(1)** space.

**Thoughts**: This approach feels sleeker—no auxiliary arrays cluttering memory. By always advancing the pointer on the smaller side and updating its max boundary, I ensure each element’s trapped water is calculated precisely. It reinforces how two-pointer patterns can optimize both speed and space. Next, I’ll practice more two-pointer problems like “Container With Most Water” and “3Sum.”

**Link(s) to work**: [Day_12](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_12)

### Day 13: May 19, 2025

**Today's Progress**: Implemented the Trapping Rain Water solution using the **brute-force** approach in Java. For each bar, I scanned left and right to find the maximum boundaries, then computed the trapped water at that index. Verified that the sample elevation map `{0,1,0,2,1,0,1,3,2,1,2,1}` still yields **6** units of total trapped water.

**Thoughts**: Although this method runs in **O(n²)** time due to nested scans, it reinforced my understanding of boundary conditions and water-level calculation. Walking through each index manually gave me deeper insight before moving on to more optimized techniques. Next up: revisit two-pointer and compare performance on larger datasets.

**Link(s) to work**: [Day_13](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_13)

### Day 14: May 21, 2025

**Today's Progress**: Implemented LeetCode 121 “Best Time to Buy and Sell Stock” in Java using two efficient approaches:

- **Method 1**: Tracked the minimum price seen so far (`buyPrice`) and, for each day, calculated `profit = prices[i] - buyPrice`; updated `maxProfit` when `profit` was higher.
- **Method 2**: First updated `buyPrice` whenever a lower price appeared, then computed `profit = prices[i] - buyPrice` and updated `maxProfit`.

Both methods run in **O(n)** time and **O(1)** space.

**Thoughts**: This problem reinforced the greedy paradigm—always buy at the lowest price before selling. Tracking the minimum price and updating profit in one pass makes the solution both simple and optimal. Next, I’ll explore multi-transaction stock problems.

**Link(s) to work**: [Day_14](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_14)

### Day 15: May 23, 2025

**Today's Progress**: Solved LeetCode 122 — _Best Time to Buy & Sell Stock II_ in Java with two one-pass greedy strategies to handle unlimited transactions:

- **Method 1**: Traverse from day 1 to n–1, and whenever `prices[i] > prices[i-1]`, add `prices[i] – prices[i-1]` to `totalProfit`. This captures every small upward swing.
- **Method 2**: Maintain a `startPrice` initialized to `prices[0]`. For each day `i`, if `prices[i] > startPrice` add the difference to `totalProfit`, then update `startPrice = prices[i]`. This “moving window” style yields the same sum of gains.

Both approaches run in **O(n)** time and **O(1)** space, efficiently accumulating all positive daily gains.

**Thoughts**: Summing each tiny profit rather than seeking global valleys and peaks makes the solution both elegant and foolproof. Seeing that two slightly different loops produce identical results deepened my appreciation for greedy patterns. Next, I’ll explore variations with transaction fees and cooldown periods.

**Link(s) to work**: [Day_15](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_15)

### Day 16: May 25, 2025

**Today's Progress**: Revisited LeetCode 122 — _Best Time to Buy & Sell Stock II_, this time implementing the **cleanest** and most **streamlined** version of the greedy solution. Instead of tracking start prices or making complex decisions, I simply summed every upward swing between consecutive days.

- **Approach**: If `prices[i] > prices[i-1]`, I immediately added `prices[i] - prices[i-1]` to the total profit.
- **Efficiency**: Runs in **O(n)** time and **O(1)** space with just one loop, one condition, and one accumulator. It’s lightning-fast and crystal clear.

**Thoughts**: I loved how elegant and minimalistic this version is—perfect for interviews or quick implementations. The “every step up is profit” mindset simplifies everything and reinforces how greedy logic can be both powerful and easy to grasp.

**Link(s) to work**: [Day_16](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_16)

### Day 17: May 26, 2025

**Today's Progress**

- Solved two array problems from Apna College:
  1. **Duplicate Check** (3 methods)
  2. **Rotated Array Search** (2 methods)

**What I Learned**

- **Duplicate Check**:
  - Brute-force is simple but slow (O(n²)).
  - Sorting lets you spot repeats by checking neighbors (O(n log n)).
  - A HashSet tracks seen values instantly (O(n)).
- **Rotated Search**:
  - You can do a single modified binary search by identifying the sorted half.
  - Finding the rotation pivot and then doing a normal binary search also works in pure O(log n).

**Key Takeaway**  
Pick the simplest approach that meets your performance needs, and use the array’s inherent order to guide your search.

**Link(s) to work**: [Day_17](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_17)

### Day 18: May 27, 2025

**Today's Progress**

- Solved LeetCode 121 (Best Time to Buy & Sell Stock) with a one-pass greedy scan.
- Solved LeetCode 42 (Trapping Rain Water) using three methods: boundary arrays, two-pointer, and condensed two-pointer.

**What I Learned**

- For Stock I, track the lowest buy price before each day to achieve O(n)/O(1).
- For Rain Water, start with the clear DP array approach, then refine to the memory-efficient two-pointer variants.
- Numbering methods (Method 1, 2, 3) keeps my notes organized and easy to follow.

**Link(s) to work** [Day_18](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_18)

### Day 19: May 28, 2025

**Today's Progress**

- Wrapped up Apna College arrays assignment with **3Sum** (LeetCode 15) in two ways: brute-force + dedupe, and sort + two-pointer.
- Finalized all five array puzzles over Days 17–19.

**What I Learned**

- **Brute-Force 3Sum** confirms correctness on small inputs before optimizing.
- **Sorting + Two-Pointer** scales to larger arrays, elegantly handling sums and duplicates in O(n²).
- Organizing methods by clarity vs. performance helps choose the right tool.

**Key Insights**

- Always validate with a simple approach before refining.
- Sorting unlocks powerful two-pointer patterns for sum problems.
- Clear duplicate-skipping logic is essential for unique result sets.

**Link(s) to work** [Day_19](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_19/)

### Day 20: May 29, 2025

**Today's Progress**

- Explored Bubble Sort fundamentals.
- Implemented two variants: standard Bubble Sort and Bubble Sort with swap counting.

**What I Learned**

- How repeated adjacent swaps bubble the largest elements to the end.
- Measuring swap count reveals the initial disorder of data.
- Bubble Sort shines as a teaching tool, especially on nearly sorted inputs.

**Link(s) to work** [Day_20](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_20)

### Day 21: May 30, 2025

**Today's Progress**

- Learned Selection Sort in depth with examples and pseudocode.
- Compared it with Bubble Sort to see how it minimizes swaps.
- Understood how Selection Sort works step-by-step on real examples.

**What I Learned**

- Selection Sort always picks the smallest element and places it at the right spot.
- Even though time complexity is still O(n²), it performs fewer swaps than Bubble Sort.
- It's a good sorting choice when swaps are costly.
- Useful on small datasets or for educational understanding of sorting mechanics.

**Link(s) to work** [Day_21](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_21)

### Day 22: May 31, 2025

**Today's Progress**

- Explored three variants of **Selection Sort**:
  1. Basic always-swap version.
  2. Selection Sort returning swap count.
  3. Optimized conditional swap version counting only effective swaps.

**What I Learned**

- Basic Selection Sort always swaps every pass, even if unnecessary.
- Returning swap count helps track operation quantity but counts redundant swaps too.
- Conditional swap optimization reduces unnecessary swaps, reflecting actual disorder.
- All variants run in O(n²) time and use O(1) space.
- Understanding swap behavior deepens insight into sorting mechanics and input array disorder.

**Link(s) to work** [Day_22](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_22)

### Day 23: June 01, 2025

**Today's Progress**

- Implemented **Insertion Sort** in three ways:
  1. Basic insertion (increasing order).
  2. Insertion Sort with swap (shift) counting.
  3. Insertion Sort in decreasing order with swap count.

**What I Learned**

- How Insertion Sort builds a sorted segment by shifting elements.
- Counting shifts reveals how “unsorted” the input is.
- Flipping comparison for descending order changes shift behavior and final order.
- All variants run in O(n²) time but adapt to nearly sorted data in O(n).

**Link(s) to work** [Day_23](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_23)

### Day 24: June 02, 2025

**Today's Progress**

- Refined **Insertion Sort** by adding swap counters in two ways:
  1. Local `swap` variable returned from the method.
  2. Static `swapCount` variable at class scope.
- Ran both versions on sample arrays to compare shift behaviors.

**What I Learned**

- Local counters avoid leftover state and are safer for repeated calls.
- Static counters simplify access but must be reset between runs.
- Counting shifts reveals how “unsorted” an array is.
- Insertion Sort remains O(n²) worst-case, O(n) best-case, and stable.

**Link(s) to work** [Day_24](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_24)

### Day 25: June 03, 2025

**Today's Progress**

- Explored Java’s inbuilt sorting methods:
  - Used `Arrays.sort(int[])` for full-array ascending sort.
  - Sorted subranges with `Arrays.sort(int[], fromIndex, toIndex)`.
  - Applied `Arrays.sort(Integer[], Collections.reverseOrder())` to reverse an array.
  - Leveraged `Collections.sort(List<E>)` and custom comparators on lists.

**What I Learned**

- `Arrays.sort(int[])` uses Dual-Pivot Quicksort (fast, in-place, average O(n log n)).
- Sorting a subrange (`fromIndex` to `toIndex - 1`) lets me sort only part of an array.
- Reverse-order sorting (`Collections.reverseOrder()`) requires object arrays (`Integer[]`) or lists.
- `Collections.sort(List<E>)` uses TimSort (stable, O(n log n), ideal for partially sorted data).
- Built-in methods handle edge cases and optimize performance—letting me focus on problem logic.

**Link(s) to work** [Day_25](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_25)
