# 📘 Day 52: Apna College Assessment (5 Questions)

Today I solved the **Apna College 5‑question bit manipulation assessment**. This file contains the official **questions** and the **Apna College solutions** in Java (my own solutions are in the repo but not shown here).

---

## Q1 — Check if a Number is a Power of Two

**Question:**  Given an integer `n`, check whether it is a power of two.

**Apna College Solution (Java):**

```java
public static boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}
```

---

## Q2 — Count Set Bits in an Integer

**Question:**  Given an integer `n`, count the number of set bits (`1`s) in its binary representation.

**Apna College Solution (Java):**

```java
public static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        count += (n & 1);
        n >>= 1;
    }
    return count;
}
}
```

---

## Q3 — Find the Single Number

**Question:**  In an array where every element appears twice except one, find the element that appears only once.

**Apna College Solution (Java):**

```java
public static int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
        result ^= num;
    }
    return result;
}
```

---

## Q4 — Generate All Subsets (Powerset)

**Question:**  Given an array of integers, print all possible subsets.

**Apna College Solution (Java):**

```java
public static void printSubsets(int[] arr) {
    int n = arr.length;
    int total = 1 << n;
    for (int mask = 0; mask < total; mask++) {
        for (int j = 0; j < n; j++) {
            if ((mask & (1 << j)) != 0) {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
    }
}
```

---

## Q5 — Fast Exponentiation

**Question:**  Implement fast exponentiation (`a^b`) using binary exponentiation.

**Apna College Solution (Java):**

```java
public static int fastExpo(int a, int n) {
    int ans = 1;
    while (n > 0) {
        if ((n & 1) != 0) {
            ans = ans * a;
        }
        a = a * a;
        n >>= 1;
    }
    return ans;
}
```

---

*Prepared as part of Day 52 of #100DaysOfCode*
