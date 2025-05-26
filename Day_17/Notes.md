# 📘 Day 17: Arrays Assignment – My Deep Dive into Duplicates & Rotated Search

Today is Day 17 of my #100DaysOfCode, and I tackled two important array challenges from my Apna College assignment:

1. **Detecting Duplicates**: Checking if any number appears more than once.
2. **Searching in a Rotated Sorted Array**: Finding a target in a shifted-up array.

I’m going to explain **how I approached each problem**, the **intuition** behind my methods, and **when** I’d pick each one.

---

## 1️⃣ Detecting Duplicates: How I Made Sure My List Was Unique

_I asked myself:_ “Does any value in `nums` show up at least twice?” Here’s how I solved it three ways:

### 🌱 Method 1: Pairwise Comparison (Brute Force)

- **My approach**: For each element, I compared it with every other element until I found a match.
- **Why it works**: This guarantees I’ll spot a duplicate if one exists.
- **When I’d use it**: On small arrays or to quickly test logic.

> **In my own words**: “I take the first number and check it against the rest, then move to the second, and so on, until a duplicate pops up.”

**Pros**: Ultra-simple.
**Cons**: O(n²) time—too slow for big arrays.

---

### 🌲 Method 2: Sort & Check Neighbors

- **My approach**: I sorted the array, then scanned for adjacent equal elements.
- **Why it works**: Sorting brings duplicates side by side, so one linear scan suffices.
- **When I’d use it**: On medium-sized arrays when I can modify the input.

> **In my own words**: “I reorder the list, then walk through once—if two neighbors match, I’ve found a duplicate.”

**Pros**: O(n log n) time, easy to code.
**Cons**: Alters the input order, still not linear time.

---

### 🌳 Method 3: HashSet for Instant Lookup

- **My approach**: I kept a `HashSet` of seen values. On each element, I checked membership before adding.
- **Why it works**: A set lookup is O(1) average, so I catch duplicates immediately.
- **When I’d use it**: On large arrays where speed matters and extra memory is okay.

> **In my own words**: “I keep a list of names that passed through the door; if someone shows up twice, I catch them.”

**Pros**: O(n) time.
**Cons**: O(n) space for the set.

---

## 2️⃣ Searching in a Rotated Array: My Two-Step Strategies

_I asked myself:_ “Given a sorted array that’s been rotated, how do I find `target` in O(log n)?”

### 🌱 Method 1: One-Pass Modified Binary Search

- **My approach**: At each midpoint, I determined which half was still sorted. Then I decided where the target might lie.
- **Why it works**: Even a rotated array has one sorted half, letting me discard half the search space.
- **When I’d use it**: When I want a single-pass solution without extra steps.

> **In my own words**: “I peek at both ends and the middle: if the left half is in order and my target fits there, I zoom in; otherwise I go right.”

**Pros**: O(log n) on average, no extra array.
**Cons**: Edge cases with duplicates can slow it down.

---

### 🌲 Method 2: Pivot-Find + Classic Binary Search

- **My approach**: First, I located the smallest element (pivot). That split the array into two normal sorted segments. Then I ran binary search on the appropriate segment.
- **Why it works**: By finding the “break point,” I reduce the problem to two standard searches.
- **When I’d use it**: When I need guaranteed O(log n) performance and clear separation of steps.

> **In my own words**: “I find where the list ‘resets’—that’s the pivot—then I know exactly which half contains my target, so I use a normal binary search there.”

**Pros**: Pure O(log n), easy to reason about.
**Cons**: Slightly more code and two phases.

---

## 📝 My Key Takeaways

- I balance **simplicity** vs. **performance**: pick brute force for tiny data, hashing for speed, sorting for middle ground.
- Rotated arrays can still be tamed by always finding the sorted portion.
- Explaining code with analogies—party guest lists, sock drawers, hall passes—makes it easier for others (and me!) to remember.

That’s Day 17—arrays feel like old friends now! 🎉
