# Update Ith Bit in Java

## Introduction

Updating a bit means **modifying the value of a specific bit** (0 or 1) in a number’s binary representation.

We can:

* **Set** a bit → make it `1`
* **Clear** a bit → make it `0`
* **Update** a bit → set it to a new value (`0` or `1`)

---

## Methods

### 1. Set Ith Bit

* Formula: `n | (1 << i)`
* Shifts `1` to the `i`-th position and performs OR.
* Ensures that bit at position `i` becomes `1`.

```java
int setIthBit(int n, int i) {
    return n | (1 << i);
}
```

### 2. Clear Ith Bit

* Formula: `n & ~(1 << i)`
* Shifts `1` to `i`-th position, negates it, then ANDs.
* Ensures that bit at position `i` becomes `0`.

```java
int clearIthBit(int n, int i) {
    return n & ~(1 << i);
}
```

### 3. Update Ith Bit

There are **two approaches**:

#### Approach A (Using set/clear methods)

```java
int updateIthBit(int n, int i, int newBit) {
    if (newBit == 0) return clearIthBit(n, i);
    else return setIthBit(n, i);
}
```

#### Approach B (Direct Formula)

1. Clear the ith bit.
2. Place the new bit at position `i`.

```java
int updateIthBit(int n, int i, int newBit) {
    n = n & ~(1 << i);      // clear ith bit
    int bitMask = newBit << i; // shift newBit into place
    return n | bitMask;     // update
}
```

---

## Step-by-Step Example

Let’s update **10 (1010 in binary)**:

### Example 1: Update 1st bit → `1`

```
  n      = 1010 (10)
  i      = 1
  newBit = 1

Step 1: Clear ith bit → 1010 & ~(0010) = 1010
Step 2: Set new bit   → 1010 | 0010 = 1010
Result = 10
```

### Example 2: Update 2nd bit → `1`

```
  n      = 1010 (10)
  i      = 2
  newBit = 1

Step 1: Clear ith bit → 1010 & ~(0100) = 1010
Step 2: Set new bit   → 1010 | 0100 = 1110
Result = 14
```

### Example 3: Update 3rd bit → `0`

```
  n      = 1010 (10)
  i      = 3
  newBit = 0

Step 1: Clear ith bit → 1010 & ~(1000) = 0010
Step 2: Set new bit   → 0010 | 0000 = 0010
Result = 2
```

---

## Key Takeaways

* **Set** a bit → `n | (1 << i)`
* **Clear** a bit → `n & ~(1 << i)`
* **Update** a bit → `n & ~(1 << i) | (newBit << i)`

✅ Efficient way to directly control individual bits.

---

## Use Cases

* Modifying flags in system programming.
* Low-level optimization (e.g., graphics, networking).
* Memory-efficient toggling of values.

---

## Conclusion

Updating a bit is simply a **combination of clearing + setting** at the desired position.
Using masks with `<<`, `|`, `&`, and `~`, we can precisely control any bit in a number.
