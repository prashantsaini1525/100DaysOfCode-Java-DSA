# 📘 Day 15: Best Time to Buy & Sell Stock II — Greedy Gains

Today we tackle **LeetCode 122**: you can trade as many times as you like (buy one day, sell another), and want to maximize total profit. Let’s break down two equally simple, one-pass strategies that even beginners can master.

---

## 🌟 What You’ll Learn

- How to spot every tiny upward swing in prices and turn it into profit.
- Why summing daily gains works like magic for unlimited trades.
- How two near-identical loops give the same result—learn both styles!

---

## 🤔 The Big Idea

- **Trade Every Rise**: Whenever tomorrow’s price is higher than today’s, buy today and sell tomorrow.
- **Greedy, Day-by-Day**: You don’t need to plan global valleys or peaks—just capture each positive difference.
- **Why It’s Correct**: Summing all positive rises equals the best possible profit you’d get by combining bigger transactions.

---

## 📝 Pseudocode (Method 1)

```text
totalProfit = 0
for i from 1 to n-1:
  if prices[i] > prices[i-1]:
    totalProfit += prices[i] - prices[i-1]
return totalProfit
```

- **Read**: Compare each day to the previous day and add any gain instantly.

---

## 📝 Pseudocode (Method 2)

```text
totalProfit = 0
startPrice = prices[0]
for i from 1 to n-1:
  if prices[i] > startPrice:
    totalProfit += prices[i] - startPrice
  startPrice = prices[i]
return totalProfit
```

- **Read**: Keep a “start” marker at the last price, then treat each new day like a mini transaction if it’s profitable.

---

## 🎯 Why Both Work

1. **Equivalent Gains**: Both loops add up exactly the same positive differences—just a matter of whether you compare to yesterday (`prices[i-1]`) or a moving `startPrice`.
2. **One-Pass & O(1) Space**: Only a couple of counters—runs lightning-fast on any input size.
3. **Beginner-Friendly**: You don’t need fancy data structures or nested loops.

---

## ⚖️ Pros & Cons

- **Pros**

  - Ultra-simple to code and explain
  - Handles unlimited transactions gracefully
  - Perfect for interview quick solutions

- **Cons**

  - Not adaptable if you add transaction fees or cooldown days
  - Only works for unlimited-trade scenarios

---

_Keep this guide close—you’ll breeze through any variation on unlimited stock trades!_
