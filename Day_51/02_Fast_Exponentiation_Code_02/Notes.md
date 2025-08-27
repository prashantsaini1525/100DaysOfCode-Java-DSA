# 🚀 Fast Exponentiation (Binary Exponentiation)

## 🔹 Concept

Fast Exponentiation is an **efficient way to calculate powers** like `a^n` using the idea of:

* Squaring the base (`a = a * a`)
* Reducing the exponent (`n = n >> 1`, i.e., divide by 2)
* Multiply result only when the exponent bit is **1** (`if (n & 1) != 0`)

This method reduces the time complexity from **O(n)** (naive approach) to **O(log n)**.

---

## 🔹 Key Formula

```
while (n > 0):
    if (n is odd): ans = ans * a
    a = a * a   // square the base
    n = n / 2   // right shift (divide by 2)
```

---

## 🔹 Step-by-Step Example 1: 3^5

**Binary Representation of 5 = 101**

1. Start: `ans = 1`, `a = 3`, `n = 5`
2. n = 5 (odd → last bit 1) → ans = 1 \* 3 = 3

   * a = 3 \* 3 = 9
   * n = 5 >> 1 = 2
3. n = 2 (even → last bit 0) → ans unchanged = 3

   * a = 9 \* 9 = 81
   * n = 2 >> 1 = 1
4. n = 1 (odd → last bit 1) → ans = 3 \* 81 = 243

   * a = 81 \* 81 = 6561
   * n = 1 >> 1 = 0 → loop ends

✅ Final Answer = **243**

---

## 🔹 Step-by-Step Example 2: 5^3

**Binary Representation of 3 = 11**

1. Start: `ans = 1`, `a = 5`, `n = 3`
2. n = 3 (odd → last bit 1) → ans = 1 \* 5 = 5

   * a = 25
   * n = 3 >> 1 = 1
3. n = 1 (odd → last bit 1) → ans = 5 \* 25 = 125

   * a = 625
   * n = 1 >> 1 = 0 → loop ends

✅ Final Answer = **125**

---

## 🔹 Java Implementations

### Method 1

```java
public class FastExponentiation {
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // If n is odd
                ans = ans * a;
            }
            a = a * a;  // Square the base
            n = n >> 1; // Divide exponent by 2
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5)); // 243
        System.out.println(fastExpo(5, 3)); // 125
        System.out.println(fastExpo(2, 10)); // 1024
    }
}
```

### Method 2

```java
public class FastExponentiation1 {
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) { // If n is odd
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println("Result: " + fastExpo(a, n)); // 1024
    }
}
```

---

## 🔹 Complexity

* **Time Complexity:** O(log n)
* **Space Complexity:** O(1)

✅ Much faster than multiplying `a` `n` times!
