# 📘 Day 9: Kadane’s for All-Negative Arrays — Making the Best of the Worst

After mastering Kadane’s linear-time power in mixed arrays (Day 8), today we tackle the trickiest edge case: **arrays where every element is negative**. Let’s see why the usual reset-to-zero rule fails and how a small tweak fixes it.

---

## 🔄 Quick Recap: Standard Kadane’s (Day 8)

* **Current Streak (`currentSum`)**: Add each number; reset to 0 if you go negative.
* **Best Streak (`maxSum`)**: The highest `currentSum` seen so far.
* **Key Insight**: Dropping negative partial sums keeps the streak healthy.

This shines when you have at least one positive number. But what if you don’t?

---

## ❌ Why the Naïve Approach Breaks

```java
int maxSum = Integer.MIN_VALUE;
int currentSum = 0;
for (int num : numbers) {
    currentSum += num;
    if (currentSum < 0) currentSum = 0;  // <– resets everything
    maxSum = Math.max(maxSum, currentSum);
}
```

* **Problem**: If all numbers are negative, `currentSum` is always reset to 0, and `maxSum` ends up 0—wrong! We need the "least negative" number, not zero.

---

## 🌟 The Fix: Initialize with the First Element

1. **Seed** both `currentSum` and `maxSum` with `numbers[0]`.
2. **Loop** from index 1, choosing either to

   * **Start fresh** at `numbers[i]`, or
   * **Extend** the streak via `currentSum + numbers[i]`.
3. **Update** `maxSum` with the better of itself or the new `currentSum`.

```java
int maxSum = numbers[0];
int currentSum = numbers[0];
for (int i = 1; i < numbers.length; i++) {
    currentSum = Math.max(numbers[i], currentSum + numbers[i]);
    maxSum = Math.max(maxSum, currentSum);
}
System.out.println("Max Subarray Sum: " + maxSum);
```

* **Result**: Even if every `num` is negative, you’ll pick the highest one.

---

## ⏱️ Time & Space

* **Time**: O(n) — one pass.
* **Space**: O(1) — only two extra variables.

---

## 🚀 Try It Yourself

* Test with `int[] numbers = {-8, -3, -6, -2, -5, -4};` — you should get **-2**.
* Compare against the brute-force or prefix methods to see how much work you save.

---

## 🔮 Next Steps

* **Printing Subarrays**: How to list the actual subarray contributing to `maxSum`.
* **Variants**: Kadane’s for circular arrays or 2D matrices.

Keep this guide as your go-to when every number feels like a challenge—because even in the negatives, you can find the best possible outcome! 🚀
