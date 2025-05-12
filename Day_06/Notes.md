# 📘 Brute-Force Subarray Techniques in Java

Whether you’re taking your first steps into algorithms or revisiting the fundamentals, this guide will walk you through the simplest way to explore every contiguous segment (subarray) of an array. We’ll cover:

* **What brute-force means** and why it’s a great starting point.
* **The subarray concept** in everyday language.
* **Complexity insights** without confusing math.
* **A focused code example** to illustrate the core ideas.
* **When to reach for something more efficient.**

---

## 🧠 Brute-Force: The No-Mystery Approach

At its heart, brute force is about being thorough: you look at **every** possible candidate and pick the best one. In the world of subarrays, that means:

1. **Pick a start point** (from index 0 up to the end).
2. **Pick an end point** at or after the start.
3. **Grab and inspect** the slice between those two points.

It’s like checking every possible route on a map—even the scenic, traffic-filled ones—to guarantee you don’t miss the fastest path.

## 🔍 Subarrays Made Simple

A subarray is just a contiguous “slice” of your original array. Imagine sliding a window along your list of numbers—each window position shows one subarray. For an array of length *n*, there are roughly *n × (n+1)/2* windows in total. That formula just counts all the ways you can choose a start and an end.

## ⏱️ Time & Space at a Glance

* **Time Complexity: O(n³)**

  * **Why?** Two loops to set the start/end, and a third loop to inspect each slice.
* **Space Complexity: O(1)**

  * **Why?** We only use a handful of counters and sums—no extra arrays or lists.

Don’t let O(n³) scare you: for learning or tiny inputs, brute force is more than enough!

---

## 🚀 Example: Brute-Force in Action (Your Code)

Let’s see **your** first brute-force implementation for the *maximum subarray sum*, cleaned up slightly for clarity. This is the code you wrote:

```java
// Time Complexity: O(n^3)
// Space Complexity: O(1)
public class MaxSubArraySum {

    public static void maxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest integer

        // Enumerate every subarray from i to j
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                // Sum elements between i and j inclusive
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                // Keep track of the largest sum found
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubArraySum(numbers);
    }
}
```

* **currSum** resets for every new subarray.
* **maxSum** starts at `Integer.MIN_VALUE` so any real sum will be larger.
* **Three nested loops**: start index (*i*), end index (*j*), then summation (*k*).

You can rely on this structure to handle any array, and it directly mirrors the brute-force approach described above.

## ✅ When to Switch Gears

Brute force is your best teacher. It makes you think clearly about what you’re trying to accomplish. But if you find yourself working with large datasets, these ideas pave the way toward more advanced—and **much faster**—techniques (hello, Kadane’s algorithm!).

Keep this note handy as a quick refresher, then dive deeper when you’re ready to bend runtime down from O(n³) toward O(n).