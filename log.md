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

* Applied a refined version of Kadane’s Algorithm tailored for **all-negative arrays**.
* Learned that initializing both `currentSum` and `maxSum` with the **first element** handles edge cases properly.
* Compared two clean implementations using `Math.max()` to dynamically choose between restarting or continuing the subarray.
* Reinforced the principle that even in negative-only arrays, the **least negative** number is the correct answer.

**Thoughts**: Handling edge cases is where real understanding begins. Today’s lesson showed how a powerful algorithm like Kadane’s can still trip you up if the initial values aren’t carefully chosen. Tomorrow, I’ll look into printing subarrays along with their max sums.

**Link(s) to work:** [Day\_09](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_09)

### Day 10: May 16, 2025

**Today's Progress**: Implemented the Trapping Rain Water solution in Java using auxiliary `leftMax[]` and `rightMax[]` arrays to achieve linear time **O(n)** and linear space **O(n)**. Validated that the sample elevation map `{4, 2, 0, 6, 3, 2, 5}` traps **11** units of water in total.

**Thoughts**: Correcting my initial output reinforced the importance of manual verification and test-case walkthroughs. Precomputing boundary arrays simplifies the core logic, and next I’ll refine this further with a two-pointer method to reduce space to **O(1)**.

**Link(s) to work**: [Day_10](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_10/01_TrappingRainWater_Concept_01)

### Day 11: May 17, 2025

**Today's Progress**: Solved the Trapping Rain Water problem on a new elevation map `{0,1,0,2,1,0,1,3,2,1,2,1}` using the two-array boundary approach in Java. Confirmed that the algorithm correctly computes **6** units of trapped water for this input.

**Thoughts**: Walking through each index of the array and comparing `leftMax[i]` and `rightMax[i]` really cemented my understanding of how boundary preprocessing drives the solution. Seeing the result match the expected 6 units strengthened my confidence. Next, I’ll implement the optimized two-pointer version to bring space down to O(1)!

**Link(s) to work**: [Day_11](https://github.com/prashantsaini1525/100DaysOfCode-Java-DSA/tree/main/Day_11)