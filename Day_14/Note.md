# 📘 Day 14: Best Time to Buy & Sell Stocks

Whether you’re just starting out or a seasoned coder, this guide shows you how to squeeze the most profit from a single buy-and-sell move—no fancy math required.

---

## 🌟 What You’ll Learn

- How to spot the lowest buy price as you scan through stock prices.
- How to calculate potential profit on the fly and keep track of your best deal.
- Why this simple, one-pass trick runs in **O(n)** time with **O(1)** extra space.

---

## 🤔 The Intuition

1. **Buy Low, Sell High**: Imagine you’re browsing prices day by day. Always remember the cheapest ticket you’ve seen.
2. **Instant Profit Check**: At each new price, ask: “If I sell now, how much would I make?”
3. **Keep the Best**: If today’s profit beats everything before, lock it in—otherwise, move on.

> 💡 **Think of it like chasing a high score**: each day you update your “best profit” if you beat your personal record.

---

## ⚡️ Step-by-Step

1. **Start Fresh**: Set `minPrice` to something huge (so any real price is lower), and `maxProfit` to 0.
2. **Walk Through Prices**: For each `price` in your list:

   - If `price < minPrice`, you’ve found a new best buy, so update `minPrice`.
   - Else, compute `profit = price - minPrice`. If `profit > maxProfit`, update `maxProfit`.

3. **End of the Line**: When you finish, `maxProfit` holds the answer

---

## 📝 Pseudocode

```text
minPrice = ∞
maxProfit = 0

for price in prices:
  if price < minPrice:
    minPrice = price
  else if (price - minPrice) > maxProfit:
    maxProfit = price - minPrice

return maxProfit
```

---

## 🎯 Why It’s Perfect for Interviews

- **Fast**: Only one loop—ideal when they ask “optimize this.”
- **Memory-Light**: Just two variables—no big arrays or complex data structures.
- **Easy to Explain**: The story of “track the cheapest buy, update best profit” is crystal clear.

---

_Keep this cheat sheet handy and breeze through LeetCode 121 and interview whiteboards!_
