# 📘 Understanding Subarrays in Java

## 🧠 What is a Subarray?

A **subarray** is a contiguous portion of an array. For example, given the array `[1, 2, 3]`, the subarrays include:

- `[1]`
- `[1, 2]`
- `[1, 2, 3]`
- `[2]`
- `[2, 3]`
- `[3]`

Understanding subarrays is fundamental in various algorithmic problems, such as finding the maximum subarray sum, checking for subarrays with a given sum, etc.

## 🛠️ Approach: Brute Force

This Java program uses a **brute-force** approach to print all possible contiguous subarrays of a given array. The method involves:

1. **Outer Loop (`start` index):** Iterates from the beginning to the end of the array.
2. **Middle Loop (`end` index):** Iterates from the `start` index to the end of the array.
3. **Inner Loop (`k` index):** Iterates from the `start` to the `end` index, printing each element to form a subarray.

This method ensures that all possible subarrays are covered.

## ⏱️ Time and Space Complexity

- **Time Complexity:** O(n³)
  - There are O(n²) pairs of start and end indices.
  - For each pair, printing the subarray takes O(n) time in the worst case.
  - Total time complexity is O(n²) * O(n) = O(n³).

- **Space Complexity:** O(1)
  - The algorithm uses a constant amount of extra space, regardless of the input size.

## 📄 Java Code

```java
public class SubArray {

    public static void printSubarrays(int[] numbers) {
        int n = numbers.length;
        // Iterate over all possible starting indices
        for (int start = 0; start < n; start++) {
            // Iterate over all possible ending indices for each start
            for (int end = start; end < n; end++) {
                // Print elements from start to end indices
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println(); // Newline after each subarray
            }
            System.out.println("-------------------"); // Separator after each set of subarrays starting at 'start'
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
```

## 🔍 Example Output

Given the input array: `[2, 4, 6, 8, 10]`

The program will output:

```
2 
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10 
-------------------
4 
4 6 
4 6 8 
4 6 8 10 
-------------------
6 
6 8 
6 8 10 
-------------------
8 
8 10 
-------------------
10 
-------------------
```

Each group of subarrays starting with the same `start` index is separated by a line of dashes for clarity.

## 📌 Key Concepts

- **Subarrays vs. Subsequences:**
  - *Subarrays* are contiguous sequences within the array.
  - *Subsequences* can be non-contiguous but maintain the order of elements.

- **Number of Subarrays:**
  - An array of size `n` has `n*(n+1)/2` possible subarrays.

## ⚠️ Limitations

- **Performance:**
  - Due to its O(n³) time complexity, this approach is inefficient for large arrays.

- **Optimization:**
  - For specific problems like finding the maximum subarray sum, more efficient algorithms like Kadane's Algorithm can be used, which operates in O(n) time.

## ✅ Recommendations

- **Educational Use:**
  - This code is excellent for learning purposes to understand how subarrays can be generated.

- **Practical Applications:**
  - For performance-critical applications, consider implementing more efficient algorithms tailored to the specific problem.

---