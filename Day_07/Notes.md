# 📘 Day 7: Friendly Guide to Prefix-Sum Subarrays in Java

Whether you’re just dipping your toes into algorithms or you’ve been swimming in code for years, prefix sums offer a neat trick to speed up subarray calculations. Here’s a down-to-earth walkthrough that speaks to both beginners and seasoned devs.

---

## 🌟 Why Prefix Sums? A Quick Analogy

Imagine you’re hiking uphill and you want to know how much elevation you’ve gained at any point. You could:

1. **Brute-force check** every step: slow and clumsy.
2. **Keep a running total** as you climb: much faster.

Prefix sums are like keeping that running elevation log. Once you’ve stored your "height so far" at each step, you can instantly find out the gain between any two points without retracing your steps.

---

## 🚀 How It Works, Step by Step

1. **Build the Prefix Array**

   * Create an array `prefix[]` the same length as your input.
   * Walk through the original numbers once, adding each new value to the previous total.

   ```java
   int prefix[] = new int[n];
   prefix[0] = numbers[0];
   for (int i = 1; i < n; i++) {
       prefix[i] = prefix[i - 1] + numbers[i];
   }
   ```

2. **Get Any Subarray Sum in O(1)**

   * To get the sum from index `i` to `j`, ask: "What’s total up to `j` minus total up to `i-1`?"
   * Special case: if `i` is 0, the sum is just `prefix[j]`.

   ```java
   int currSum = (i == 0) ? prefix[j]
                            : prefix[j] - prefix[i - 1];
   ```

3. **Track Max & Min**

   * Kick off `maxSum = Integer.MIN_VALUE` and `minSum = Integer.MAX_VALUE`.
   * As you check each `(i, j)` pair, update:

     ```java
     maxSum = Math.max(maxSum, currSum);
     minSum = Math.min(minSum, currSum);
     ```
   * No more clunky `if`-trees—just two expressive method calls.

---

## 📋 Complete Code Snippet

```java
// Time: O(n^2), Space: O(n)
public class PrefixSubarraySums {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        int n = numbers.length;

        // 1) Build prefix sums
        int[] prefix = new int[n];
        prefix[0] = numbers[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // 2) Initialize extremes
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        // 3) Check every subarray
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
                minSum = Math.min(minSum, currSum);
            }
        }

        // 4) Show results
        System.out.println("Max Subarray Sum: " + maxSum);
        System.out.println("Min Subarray Sum: " + minSum);
    }
}
```

---

## 💡 Pro Tips & Next Steps

* **When to Use**: Perfect for medium-sized arrays (n up to \~10⁴) when an O(n²) approach is acceptable.
* **Memory Trade-Off**: You allocate an extra O(n) array for speedy lookups instead of repeated sums.
* **What’s Next?**

  * ✨ **Up Next: Kadane’s Algorithm** — an O(n), O(1) space method to find the maximum subarray sum in one pass. Stay tuned for a deep dive tomorrow!

Keep this guide as your friendly cheat sheet. See you in the Kadane’s tutorial! 🚀
