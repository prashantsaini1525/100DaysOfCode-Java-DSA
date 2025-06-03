# 📘 Day 25: Mastering Java’s Inbuilt Sort

On Day 25 of my #100DaysOfCode journey, I explored how to let Java do the heavy lifting with its **built-in sorting methods**. Instead of writing custom sorting algorithms, I used:

- **`Arrays.sort(...)`** for arrays (primitive and object).
- **`Collections.sort(...)`** for lists.

These methods are:

- **Reliable**: Java’s standard library is battle-tested and handles many edge cases.
- **Optimized**: Under the hood, they use Dual-Pivot Quicksort for primitives and TimSort for objects and lists—both run in roughly O(n log n).
- **Convenient**: A single line of code replaces dozens of lines of manual sorting logic.

---

## 🌟 What Is In-Built Sorting?

When we talk about inbuilt sorting in Java, we mean using these two main APIs:

1. **`Arrays.sort(...)`** – Works on arrays of primitive types (like `int[]`, `double[]`) and object types (like `String[]`, `Integer[]`, or any array of `Comparable` objects).
2. **`Collections.sort(...)`** – Works on any `List<E>`, such as `ArrayList<String>` or `LinkedList<Person>`. Elements must implement `Comparable` or you must provide a `Comparator`.

**Why use these instead of writing your own sort?**

- **No Reinventing the Wheel**: Java’s library methods are robust and handle tricky edge cases for you.
- **Focus on Logic**: Spend time on the actual problem you’re solving, not on sorting mechanics.
- **Team Consistency**: Using standard methods makes code readable and maintainable for everyone.

---

## 💡 Why Built-In Sorts Shine

- **Performance**:

  - Primitives (`int[]`, `double[]`) use a tuned **Dual-Pivot Quicksort**. It’s usually O(n log n) and rarely degrades to O(n²).
  - Object arrays (`String[]`, `Integer[]`) and lists (`List<E>`) use **TimSort**, a hybrid of merge sort and insertion sort. TimSort shines on partially sorted data and always runs in O(n log n).

- **Stability**:

  - For object sorts and list sorts (TimSort), equal elements keep their original order—crucial when you need to sort by multiple criteria.

- **Simplicity**:

  - One method call sorts the data in place. No need to handle index bounds or pivot selection manually.

---

## 🔍 Under the Hood (Simplified)

1. **Primitives (`int[]`, `double[]`)**

   - Java picks two “pivot” values, splits the array into three parts (less than first pivot, between pivots, greater than second pivot), and sorts each part recursively.
   - Typically O(n log n); space overhead is only O(log n) from recursion.

2. **Objects & Lists (`String[]`, `List<Person>`)**

   - Java finds already-ordered “runs” in the data, merges those runs like a merge sort, and uses insertion sort to finish up small unsorted gaps.
   - Always O(n log n) time, but often faster when data is nearly sorted.
   - Uses extra space O(n) to merge runs, but that’s usually fine for most applications.

> **Key point**: You don’t have to memorize the exact algorithm. Just know that Java’s library sorts are fast and reliable.

---

## 🚀 Performance Cheat‑Sheet

| Method                         | Average Time | Worst Time | Extra Space | Stable? | Use Case                         |
| ------------------------------ | ------------ | ---------- | ----------- | ------- | -------------------------------- |
| `Arrays.sort(primitive array)` | O(n log n)   | O(n²)      | O(log n)    | No      | Simple ascending sort on `int[]` |
| `Arrays.sort(object array)`    | O(n log n)   | O(n log n) | O(n)        | Yes     | Sorting `String[]`, `Integer[]`  |
| `Collections.sort(list)`       | O(n log n)   | O(n log n) | O(n)        | Yes     | Sorting any `List<Comparable>`   |

> **Stable?**: If two elements compare as equal, a stable sort keeps their original order. Useful when sorting by multiple fields.

---

## 🛠️ Quick‑Start Code Recipes

Below are beginner-friendly examples. Copy-paste and run them in your Java environment to see how they work.

### 1️⃣ Sort a Primitive Array in Ascending Order

```java
int[] scores = {88, 95, 72, 100, 89};
Arrays.sort(scores);
System.out.println(Arrays.toString(scores));
// Output: [72, 88, 89, 95, 100]
```

- **What’s happening?** Java applies Dual-Pivot Quicksort to rearrange the array in place.

### 2️⃣ Sort an Object Array (e.g., Strings)

```java
String[] names = {"Zara", "Alex", "Mia", "Bob"};
Arrays.sort(names);
System.out.println(Arrays.toString(names));
// Output: [Alex, Bob, Mia, Zara]
```

- **What’s happening?** Java’s TimSort orders strings alphabetically because `String` implements `Comparable<String>`.

### 3️⃣ Sort a List of Integers

```java
List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1));
Collections.sort(list);
System.out.println(list);
// Output: [1, 3, 5, 8]
```

- **What’s happening?** `Collections.sort` calls TimSort under the hood and rearranges the `ArrayList`.

### 4️⃣ Custom Ordering with a Comparator

```java
List<String> fruits = Arrays.asList("apple", "kiwi", "banana", "pear");
fruits.sort(Comparator.comparingInt(String::length));
System.out.println(fruits);
// Output: [kiwi, pear, apple, banana]
```

- **What’s happening?** We pass a lambda that compares strings by their length. Java’s sort method uses this comparison to order the list.

---

## 🌱 Quick Tips with Example Array `{5, 4, 1, 3, 2}`

- **Reverse the entire array** (descending order):
  Use an `Integer[]` (not `int[]`), because `Collections.reverseOrder()` requires objects.

  ```java
  Integer[] arr = {5, 4, 1, 3, 2};
  Arrays.sort(arr, Collections.reverseOrder());
  System.out.println(Arrays.toString(arr));
  // → [5, 4, 3, 2, 1]
  ```

- **Sort a subrange in ascending order**:

  ```java
  int[] arr = {5, 4, 1, 3, 2};
  Arrays.sort(arr, 1, 4);
  System.out.println(Arrays.toString(arr));
  // → [5, 1, 3, 4, 2]
  // Only indices 1 to 3 (exclusive of index 4) get sorted.
  ```

- **Reverse sort a subrange**:

  ```java
  Integer[] arr = {5, 4, 1, 3, 2};
  Arrays.sort(arr, 1, 4, Collections.reverseOrder());
  System.out.println(Arrays.toString(arr));
  // → [5, 3, 1, 4, 2]
  // Indices 1–3 sorted descending; others stay as is.
  ```

> **Pro tip**: Remember that `Arrays.sort(primitive[])` is slightly faster than `Arrays.sort(Object[])` because there’s no autoboxing. However, if you need custom comparators (reverse order, or sorting a custom class), you’ll use the object versions.

---

## ⚠️ Common Gotchas

1. **`Arrays.sort` vs. `Collections.sort`**:

   - `Arrays.sort` works on arrays; `Collections.sort` works on lists. Mixing them up causes compile-time errors.

2. **Autoboxing Overhead**:

   - Sorting `Integer[]` (object array) involves extra overhead compared to `int[]`. If performance is critical and you don’t need a comparator, stick to primitives.

3. **Null Elements**:

   - By default, comparators throw `NullPointerException` if they encounter a `null`. If your array or list can have `null`, provide a custom `Comparator` that handles `null` explicitly.

---

## 📝 Mini Quiz for Students

1. What sorting algorithm does `Arrays.sort(int[])` use, and why is it efficient?
2. Explain why `Collections.sort` is considered a stable sort and when stability matters.
3. Write (in plain English) how you would sort an array of custom `Person` objects first by `age`, then by `name` if ages are equal.

---

_That wraps up Day 25! Let Java’s built-in methods handle sorting so you can focus on solving bigger problems._
