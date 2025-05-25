# 📘 Day 16: Best Time to Buy & Sell Stock II — Streamlined Swing Capture

Today’s focus is LeetCode 122 again, but with an even more concise twist: capture every upward day-to-day swing in one simple loop.

---

## 🌟 What You’ll Learn

- How to catch each positive price jump with minimal bookkeeping.
- Why this single-pass trick runs in **O(n)** time using **O(1)** extra space.
- How trimming down conditions makes your code cleaner and just as effective.

---

## 🤔 The Intuition

- **Every Rise Counts**: If today’s price is higher than yesterday’s, you pocket the difference immediately—no need to track a separate start price.
- **Greedy in Action**: By summing these tiny gains, you end up with the maximum total profit across as many trades as you like.
- **Cleaner Logic**: Only one `if` check and one accumulator—easy to explain and hard to mess up.

> 💡 **Analogy**: Think of riding a staircase—every time you step up, you collect the step’s height as profit.

---

## 📝 Pseudocode

```text
maxProfit = 0
for each day from 2 to n:
  if price[day] > price[day-1]:
    maxProfit += price[day] - price[day-1]
return maxProfit
```

- **Read**: Compare each day to the previous; add any positive difference right away.

---

## 🎯 Why It Works for Newbies & Pros

1. **Simplicity**: One loop, one condition, one variable—ideal for beginners to grasp.
2. **Optimality**: Proven mathematically to match the best possible sequence of buy/sell trades when there’s no transaction limit.
3. **Interview-Ready**: Instantly explainable: “I just sum every upward move.”

---

## ⚖️ Pros & Cons

- **Pros**

  - Ultra-minimal code—easy to remember
  - Single-pass, constant space
  - Perfect clarity for whiteboard interviews

- **Cons**

  - Only fits the unlimited-trades scenario
  - Doesn’t adapt if fees, cooldowns, or limits are introduced

---

_End of Day 16 Notes!_
