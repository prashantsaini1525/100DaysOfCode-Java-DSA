# 📘 Day 8: Kadane’s Algorithm — Bringing It All Together

After mastering triple-loop brute force (Day 6) and prefix sums (Day 7), you’re ready for the _ultimate speed boost_: Kadane’s algorithm. This guide knits those earlier ideas into one smooth pass through your array.

---

## 🔄 Quick Recap: Building Blocks

- **Day 6 – Brute Force:** Checked every possible subarray with three loops (O(n³)) to find max/min sums.
- **Day 7 – Prefix Sums:** Precomputed running totals so each subarray sum took O(1), cutting loops to two (O(n²)).

Both approaches taught you to:

1. **Enumerate** slices of your array.
2. **Aggregate** their sums.
3. **Optimize** repeated work.

Now let’s see how Kadane’s merges these ideas into one pass.

---

## 🌟 The Key Insight: Keep or Reset

Think of your subarray sum like a scoring streak:

- **Current Streak (`currentSum`)**: Total score you’re building right now.
- **Best Streak (`maxSum`)**: Highest score you’ve ever reached.

As you visit each number in your array:

1. **Add** it to `currentSum`.
2. If `currentSum` ever **drops below zero**, it’s hurting your future streak—so **reset** it to 0.
3. **Update** `maxSum` with whichever is bigger: the old best or the new `currentSum`.

This simple rule replaces nested loops with a single sweep and just two variables:

- **Time**: O(n)
- **Space**: O(1)

---

## 🚀 Walkthrough with Code

Working array for today:

```java
int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
```

```java
// Time: O(n) | Space: O(1)
int maxSum = Integer.MIN_VALUE;  // Your best streak so far
int currentSum = 0;              // Streak you’re building now

for (int num : numbers) {
    currentSum += num;           // Add today’s number
    if (currentSum < 0) {        // If the streak sours...
        currentSum = 0;          // ...reset and start fresh
    }
    maxSum = Math.max(maxSum, currentSum);  // Record new best if any
}

System.out.println("Max Subarray Sum is: " + maxSum);
```

> With this array, Kadane’s finds `[4, -1, -2, 1, 5]` for a sum of **7**.

---

## 💡 Why This Feels Natural

- **You’re still tracking sums**—just without extra storage or loops.
- **Resetting negative sums** mirrors prefix-sum subtraction in Day 7 but happens on the fly.
- **One pass** means lightning-fast performance.

---

## 🔮 Tomorrow: Handling All-Negative Arrays

Next, we’ll tweak Kadane’s so it picks the _least negative_ number when every element is below zero. Stay tuned!
