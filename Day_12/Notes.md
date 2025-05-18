# 📘 Day 12: Trapping Rain Water — Two-Pointer Magic

A friendly, bite-sized guide to the **two-pointer** approach that traps rain water in **O(n)** time and **O(1)** space. Perfect for jotting down in your #100DaysOfCode notes!

---

## 🌟 At a Glance

* **Two pointers** (`L`, `R`) start at the ends of the height array.
* Track the **highest wall so far** on each side: `leftMax`, `rightMax`.
* Always move the pointer under the shorter wall—you know the other side’s boundary is tall enough.
* **Water at each step** = `currentBoundary – currentHeight`.

---

## 🤔 Why It Works

1. Water can only fill up to the shorter boundary.
2. By advancing the smaller side, you’re guaranteed the opposite side holds water up to that height.
3. You update your max boundaries as you go—no extra arrays needed.

---

## 📝 Pseudocode

```text
left = 0, right = n - 1
leftMax = 0, rightMax = 0
ans = 0

while left <= right:
  if height[left] <= height[right]:
    if height[left] >= leftMax:
      leftMax = height[left]
    else:
      ans += leftMax - height[left]
    left++
  else:
    if height[right] >= rightMax:
      rightMax = height[right]
    else:
      ans += rightMax - height[right]
    right--
return ans
```

---

## 💻 Java Implementation

```java
public class TrappingRainWater {
  public static int trappedRainWater(int[] h) {
    int left = 0, right = h.length - 1;
    int leftMax = 0, rightMax = 0, water = 0;

    while (left <= right) {
      if (h[left] <= h[right]) {
        if (h[left] >= leftMax) leftMax = h[left];
        else water += leftMax - h[left];
        left++;
      } else {
        if (h[right] >= rightMax) rightMax = h[right];
        else water += rightMax - h[right];
        right--;
      }
    }
    return water;
  }

  public static void main(String[] args) {
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trappedRainWater(height)); // 6
  }
}
```

---

## 🛠️ Pros & Cons

* **Pros**

  * Single pass, constant space
  * Clean pointer logic
* **Cons**

  * Pointer moves can feel tricky at first
  * Must handle edge cases carefully

---
