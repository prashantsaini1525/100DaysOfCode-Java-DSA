# 📘 Day 13: Trapping Rain Water — Brute-Force Breakdown

A straightforward, step-by-step guide to the **brute-force** approach for trapping rain water. Handy for understanding the basics before optimizing!

---

## 🌟 At a Glance

- **Core Idea**: For each bar, scan all bars to its left and right to find the highest boundaries, then calculate trapped water.
- **Time**: O(n²) — two nested scans per bar.
- **Space**: O(1) — uses only counters and pointers.

---

## 🤔 Why It Works

1. For a given bar at position `i`, any water above it is limited by the highest bars on its left and right.
2. By explicitly scanning both sides for each `i`, you ensure you find the true boundaries.
3. Once you know `leftMax` and `rightMax`, water at `i` = `min(leftMax, rightMax) – height[i]`.

---

## 📝 Pseudocode

```text
ans = 0
for i in 0 to n-1:
  leftMax = 0
  rightMax = 0

  for j from i down to 0:
    leftMax = max(leftMax, height[j])

  for k from i to n-1:
    rightMax = max(rightMax, height[k])

  waterLevel = min(leftMax, rightMax)
  ans += waterLevel - height[i]

return ans
```

---

## 💻 Java Implementation

```java
public class TrappingRainWater {
    public static int trappedRainWater(int[] height) {
        int trappedWater = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            int leftMax = 0;
            int rightMax = 0;

            // find max to the left
            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(leftMax, height[j]);
            }
            // find max to the right
            for (int k = i; k < n; k++) {
                rightMax = Math.max(rightMax, height[k]);
            }

            // accumulate trapped water
            trappedWater += Math.min(leftMax, rightMax) - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedRainWater(height)); // 6
    }
}
```

---

## 🛠️ Pros & Cons

- **Pros**

  - Super simple to understand
  - Good for small inputs or initial learning

- **Cons**

  - O(n²) time makes it impractical for large arrays
  - Inefficient compared to optimized methods

---

_End of Day 13 Notes!_
