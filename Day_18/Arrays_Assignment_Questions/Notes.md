# 📘 Day 18: Continuing the Array Assignment — Q3 & Q4

Yesterday I tackled the first two questions on my Apna College sheet. Today, I solved:

3. **Best Time to Buy & Sell Stock** (LeetCode 121)
4. **Trapping Rain Water** (LeetCode 42)

Next up: Question 5 tomorrow!

---

## 1️⃣ Best Time to Buy & Sell Stock

**What jumped out at me**: I only get one buy and one sell. So I just need to remember the cheapest day so far and see if selling today would beat my best profit.

### Method 1: One-Pass Greedy Scan

1. **Maintain** two variables: `buyPrice` (initialized to ∞) and `maxProfit` (initialized to 0).
2. **Iterate** through each `price` in the array:

   - If `price < buyPrice`, update `buyPrice`.
   - Else, calculate `profit = price - buyPrice` and update `maxProfit` if `profit` is higher.

3. **Return** `maxProfit`.

```text
buyPrice = ∞
maxProfit = 0
for price in prices:
  if price < buyPrice:
    buyPrice = price
  else if price - buyPrice > maxProfit:
    maxProfit = price - buyPrice
return maxProfit
```

**Why it clicks**: One pass, constant memory—track the best buy before each potential sell.

---

## 2️⃣ Trapping Rain Water

**The challenge**: Bars represent walls holding water—how much water sits on top when it stops raining? I tackled this in three serialized methods:

### Method 1: Boundary Arrays (DP)

- **Steps**:

  1. Build `leftMax[]`: highest bar from the start to each index.
  2. Build `rightMax[]`: highest bar from the end to each index.
  3. For each index `i`, add `min(leftMax[i], rightMax[i]) - height[i]` to the total water.

- **Performance**: O(n) time, O(n) space.

```text
compute leftMax[]
compute rightMax[]
totalWater = 0
for i in 0..n-1:
  totalWater += min(leftMax[i], rightMax[i]) - height[i]
return totalWater
```

**When I’d use it**: Clear boundary logic, great for initial understanding.

---

### Method 2: Two-Pointer Scan

- **Steps**:

  1. Initialize pointers `L=0`, `R=n-1`, and trackers `leftMax=0`, `rightMax=0`, `water=0`.
  2. While `L < R`:

     - If `height[L] < height[R]`: update `leftMax`, add `leftMax - height[L]`, then `L++`.
     - Else: update `rightMax`, add `rightMax - height[R]`, then `R--`.

  3. Return `water`.

- **Performance**: O(n) time, O(1) space.

```text
L=0, R=n-1, leftMax=0, rightMax=0, water=0
while L < R:
  if height[L] < height[R]:
    leftMax = max(leftMax, height[L])
    water += leftMax - height[L]
    L++
  else:
    rightMax = max(rightMax, height[R])
    water += rightMax - height[R]
    R--
return water
```

**When I’d use it**: Memory-tight scenarios.

---

### Method 3: Condensed Two-Pointer

- **Variation**: Start `lMax=height[0]`, `rMax=height[n-1]`, then move pointers and update in one step.
- **Key change**: Combine updating max and adding water into fewer lines.
- **Performance**: O(n) time, O(1) space.

```text
l=0, r=n-1, lMax=height[0], rMax=height[n-1], water=0
while l < r:
  if lMax < rMax:
    l++
    lMax = max(lMax, height[l])
    water += lMax - height[l]
  else:
    r--
    rMax = max(rMax, height[r])
    water += rMax - height[r]
return water
```

**When I’d use it**: After mastering two-pointer, for concise code.

---

## 🔑 My Key Insights

- **Stock I**: Track the lowest buy before each day for max profit in O(n)/O(1).
- **Water Trap**: Start with DP arrays to learn, then switch to two-pointer for optimal memory use.
- **Serialization**: Labeling methods (Method 1, 2, 3) helps keep my notes organized and clear.

That wraps up Day 18—onward to Day 19! 🚀
