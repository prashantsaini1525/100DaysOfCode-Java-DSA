# 📘 Day 10: Trapping Rain Water — Prefix & Suffix Boundaries Simplified

A quick, clear guide to the **Prefix/Suffix Maximum Arrays** method for trapping rain water in **O(n)** time and **O(n)** space. Perfect both for newcomers learning the idea and for experienced coders looking for a concise reference.

---

## 🌟 At a Glance

- **Core Idea**: At any bar `i`, water accumulates up to the shorter of the highest bars on its left and right.
- **Formula**:

  ```text
  waterAt(i) = min(maxHeightLeft[i], maxHeightRight[i]) - height[i]
  ```

- **Performance**: Single-pass scans to build boundary arrays, then one more pass to sum water.

---

## 🤔 Why This Works (Newbie-Friendly Explanation)

Imagine each bar as a pillar.

- Water pools between pillars but can’t overflow the shorter neighbor.
- By precomputing the tallest pillar to the left and right of each position, you instantly know your “container height.”

> 🔑 **Analogy**: Think of two walls forming a well—water can’t rise higher than the lower wall.

---

## 📝 Step-by-Step Pseudocode

```text
1. Let n = height.length
2. Create arrays leftMax[n], rightMax[n]

// Build boundaries
3. leftMax[0] = height[0]
4. for i from 1 to n-1:
     leftMax[i] = max(height[i], leftMax[i-1])

5. rightMax[n-1] = height[n-1]
6. for i from n-2 down to 0:
     rightMax[i] = max(height[i], rightMax[i+1])

// Gather water
7. trappedWater = 0
8. for i from 0 to n-1:
     trappedWater += min(leftMax[i], rightMax[i]) - height[i]

9. return trappedWater
```

---

## 💻 Java Implementation (Clean & Modular)

```java
public class TrappingRainwater {

    // Build prefix maximums
    private static int[] buildLeftMax(int[] h) {
        int n = h.length;
        int[] left = new int[n];
        left[0] = h[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(h[i], left[i-1]);
        }
        return left;
    }

    // Build suffix maximums
    private static int[] buildRightMax(int[] h) {
        int n = h.length;
        int[] right = new int[n];
        right[n-1] = h[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i] = Math.max(h[i], right[i+1]);
        }
        return right;
    }

    // Main trap function
    public static int trap(int[] height) {
        int n = height.length;
        int[] leftMax = buildLeftMax(height);
        int[] rightMax = buildRightMax(height);
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Water = " + trap(height)); // 6
    }
}
```

- **Time**: O(n) — three simple sweeps.
- **Space**: O(n) — two auxiliary arrays.

---

## 🛠️ Pros & Cons (Inside Code)

```java
// Pros:
// 1. Easy to understand & code structure
// 2. Deterministic one-pass builds for boundaries
// 3. Serves as a clear stepping stone to the two-pointer method

// Cons:
// 1. Uses O(n) extra space for auxiliary arrays
// 2. Slight overhead in managing two arrays
// 3. Not ideal for memory-constrained environments
```

---

## 🚀 Alternatives to Explore Later

- **Two-Pointer**: O(1) space, same O(n) time—skip arrays by updating boundaries on the fly.
- **Monotonic Stack**: Useful when you need explicit boundary pairs.
- **Dynamic Segment Tree**: When heights change frequently.

---

## 📅 Day 11 Preview: Testing & Refactoring

Tomorrow, you’ll:

1. Write unit tests for edge cases (flat, single bar, large random).
2. Profile performance for `n` up to 10⁶.
3. Refactor further into reusable utilities.

Keep this up on GitHub for anyone—new or veteran—to quickly grasp trapping rain water! 🌧️☔️
