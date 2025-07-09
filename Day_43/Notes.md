# Human-Friendly Guide to String Compression in Java

## What's the Idea?

Imagine you're trying to compress repeated characters in a string.
For example:

- `aaabbcccdd` becomes `a3b2c3d2`
- `abcd` stays `abcd` (no repetition)

This method saves space if the string has many repeating letters.

## When Do We Use This?

You can use this to:

- Reduce the size of a string (if it has many repeats)
- Analyze patterns (like how often letters appear consecutively)
- Improve performance in certain algorithms by working with a shorter string

## How Does the Logic Work?

Let’s break it down:

1. Loop through each character of the string.
2. Count how many times the current character repeats in a row.
3. Add the character to a new result string.
4. If it repeated more than once, add the count next to it.

### For example:

Input: `aaabbc`

- Start with `a`, it's repeated 3 times → Add `a3`
- Then comes `b`, repeated 2 times → Add `b2`
- Finally, `c` appears once → Add `c`

Final Output: `a3b2c`

## Important Notes

- If there are no consecutive repeats, you just get the original string (e.g., `abcd`).
- We're not removing any letters, just adding numbers **only when** there's repetition.

## Key Concepts Used:

| Concept         | Description                                  |
| --------------- | -------------------------------------------- |
| Looping (`for`) | To go through the string                     |
| StringBuilder   | Efficiently builds the new compressed string |
| `charAt(i)`     | Gets the character at index `i`              |
| Counters        | To count repeating characters                |

## Time & Space Complexity

- **Time:** O(n), since we go through the string once
- **Space:** O(n), because we create a new string

---

_This logic was implemented using your code as reference, and simplified here for clearer understanding._
