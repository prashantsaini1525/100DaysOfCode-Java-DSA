# 📘 Brute-Force Subarray Algorithms in Java

## 🧠 What is a Brute-Force Algorithm?

A **brute-force algorithm** is an exhaustive search technique that systematically explores all possible candidates until the solution is found ([GeeksforGeeks](https://www.geeksforgeeks.org/brute-force-approach-and-its-pros-and-cons)). It is straightforward but often inefficient for large inputs.

## 🔍 What is a Subarray?

A **subarray** is a contiguous portion of an array. An array of length *n* has $\frac{n(n+1)}{2}$ possible subarrays, counting every pair of start and end indices (i ≤ j).

## 🛠️ Approach: Enumerating and Summing Subarrays

We use three nested loops:

1. **Outer Loop (i)**: chooses the start index of the subarray.
2. **Middle Loop (j)**: chooses the end index (≥ i).
3. **Inner Loop (k)**: sums elements between i and j.

This guarantees every contiguous subarray is evaluated.

### ⏱️ Time Complexity: O(n³)

* O(n²) start/end pairs × O(n) summation = O(n³).

### 📦 Space Complexity: O(1)

* Only constant extra variables (`currSum`, `maxSum`, `minSum`, counters) are used.

---

## 1️⃣ Max Subarray Sum (Q1)

**Goal:** Find the maximum-sum contiguous subarray.

```java
// Time: O(n^3), Space: O(1)
public class MaxSubArraySum {
    public static void maxSubArraySum(int[] numbers) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println("Sum [" + i + ".." + j + "] = " + currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println("-------------------");
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        maxSubArraySum(numbers);
    }
}
```

**Explanation:**

* Two loops to define subarray bounds, one to sum.
* Updates `maxSum` when a larger sum is found.

---

## 2️⃣ Min Subarray Sum (Q2)

**Goal:** Find the minimum-sum contiguous subarray.

```java
// Time: O(n^3), Space: O(1)
public class MinSubArraySum {
    public static void minSubArraySum(int[] numbers) {
        int currSum;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println("Sum [" + i + ".." + j + "] = " + currSum);
                if (currSum < minSum) {
                    minSum = currSum;
                }
            }
            System.out.println("-------------------");
        }
        System.out.println("Min Sum : " + minSum);
    }

    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        minSubArraySum(numbers);
    }
}
```

**Explanation:**

* Identical enumeration, but tracks smallest sum via `minSum`.

---

## 3️⃣ Max, Min, and Total Count (Q3)

**Goal:** Print each subarray with its sum, and track max, min, and total count.

```java
// Time: O(n^3), Space: O(1)
public class MaxSubArraySum {
    public static void maxSubArraySum(int[] numbers) {
        int ts = 0;               // Total subarray count
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + (k == j ? "" : ", "));
                    currSum += numbers[k];
                }
                System.out.println("] -> Sum: " + currSum);
                if (currSum > maxSum) maxSum = currSum;
                if (currSum < minSum) minSum = currSum;
                ts++;
            }
            System.out.println("-------------------");
        }
        System.out.println("Max Sum : " + maxSum);
        System.out.println("Min Sum : " + minSum);
        System.out.println("Total subarrays printed: " + ts);
    }

    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        maxSubArraySum(numbers);
    }
}
```

**Explanation:**

* Adds `ts` counter.
* Prints each subarray bracketed, then updates max, min, and count.

---

## 4️⃣ Handling Different Input (Q4)

**Goal:** Same as Q3 but with different test arrays.

```java
// Time: O(n^3), Space: O(1)
public class MaxSubArraySum {
    public static void maxSubArraySum(int[] numbers) {
        int ts = 0;
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + (k == j ? "" : ", "));
                    currSum += numbers[k];
                }
                System.out.println("] -> Sum: " + currSum);
                if (currSum > maxSum) maxSum = currSum;
                if (currSum < minSum) minSum = currSum;
                ts++;
            }
            System.out.println("-------------------");
        }
        System.out.println("Max Sum : " + maxSum);
        System.out.println("Min Sum : " + minSum);
        System.out.println("Total subarrays printed: " + ts);
    }

    public static void main(String[] args) {
        // Test with all negatives or mixed
        int[] numbers = {-8, 3};
        maxSubArraySum(numbers);
    }
}
```

**Explanation:**

* Demonstrates behavior when all values are negative or mixed.
* The algorithm still enumerates every subarray correctly.

---

## 📌 Key Takeaways

* Brute-force is easy to implement but only suitable for small n.
* Always verify boundaries (inclusive loops) and initialize extremes properly.
* For larger inputs, consider optimized approaches (e.g., Kadane’s in O(n)).
