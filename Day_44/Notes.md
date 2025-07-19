# 📘 Day 44: Solving 5 Java String Questions – Practice + Logic Breakdown

Today, I solved five beginner-to-intermediate level string questions in Java. Each problem was approached with both **my own solution** and, where applicable, cross-checked against the official solution from the Alpha Course (Shradha Didi). Below is a combined and human-friendly explanation of each.

---

## 🧮 Q1. Count Lowercase Vowels in a String

### 🔹 Goal:

Count how many times lowercase vowels (a, e, i, o, u) appear in a given string.

### ✅ My Approach:

* Loop through each character in the string.
* Use simple if-checks for vowels.

```java
int count = 0;
for (int i = 0; i < input.length(); i++) {
    char ch = input.charAt(i);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
    }
}
```

### 🧠 Time Complexity: O(n)

### 💾 Space Complexity: O(1)

---

## 🤔 Q2. Output of `equals()` on Strings

```java
String str = "ShradhaDidi";
String str1 = "ApnaCollege";
String str2 = "ShradhaDidi";
System.out.print(str.equals(str1) + " " + str.equals(str2));
```

### 🔍 Answer:

```
false true
```

* `equals()` checks **content**. `str` ≠ `str1`, but `str` == `str2`.

---

## 🔄 Q3. Output of String Replacement

```java
String str = "ApnaCollege".replace("l", "");
System.out.println(str);
```

### 🔍 Answer:

```
ApnaCoege
```

* All 'l' characters are removed.

---

## 🔁 Q4. Are Two Strings Anagrams?

### 🔹 Goal:

Check if two strings are anagrams (same characters, different order).

### ✅ My Approach:

* If lengths differ, return false.
* Sort both strings, compare equality.

```java
char[] a1 = s1.toCharArray();
char[] a2 = s2.toCharArray();
Arrays.sort(a1);
Arrays.sort(a2);
return Arrays.equals(a1, a2);
```

### 🧠 Time Complexity: O(n log n) due to sorting

### 💾 Space Complexity: O(n) for the char arrays

---

## 🔤 Q5. \[String Compression]

Already documented on **Day 43**.

---

## ✅ Key Takeaways

* Simple string problems often build intuition for bigger DSA challenges.
* Knowing how `equals()`, `replace()`, and `charAt()` behave is essential.
* For comparison logic, always know when to use sorting (as in anagrams).

**Great day of string-focused Java practice!**
