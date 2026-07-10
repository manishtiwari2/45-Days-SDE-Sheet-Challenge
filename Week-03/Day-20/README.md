# Day 20

📅 Date: 20 June 2026

## Problems Solved

### 1. Median in a Row-wise Sorted Matrix

**Platform:** GeeksforGeeks

**Difficulty:** Hard

### Approach

Used Binary Search on the answer space instead of searching within the matrix.

- Identified the minimum and maximum possible values.
- Applied Binary Search over the value range.
- For every mid value, counted how many elements were less than or equal to it using Upper Bound in each row.
- Narrowed the search space until the median was found.

### Complexity

- Time Complexity: O(log(Max-Min) × N × logM)
- Space Complexity: O(1)

### Key Learning

Binary Search can be applied on the answer instead of array indices when the search space is monotonic.

---

### 2. Find Nth Root of M

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Applied Binary Search over the possible root values.

For every candidate:

- Calculated midⁿ carefully.
- Stopped multiplication early whenever the value exceeded M to avoid overflow.
- Compared the result with M and adjusted the search range.

### Complexity

- Time Complexity: O(logM × N)
- Space Complexity: O(1)

### Key Learning

Overflow handling is crucial when implementing mathematical binary search problems.

---

### 3. Single Element in a Sorted Array

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Used Binary Search based on index parity.

Observations:

- Before the unique element, pairs start at even indices.
- After the unique element, this pattern breaks.

Used this property to discard half of the search space at every step.

### Complexity

- Time Complexity: O(logN)
- Space Complexity: O(1)

### Key Learning

Index parity can reveal hidden ordering properties in sorted arrays.

---

### 4. Search in Rotated Sorted Array

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Solved in two phases.

1. Located the pivot (minimum element) using Binary Search.
2. Performed Binary Search on the appropriate sorted half.

### Complexity

- Time Complexity: O(logN)
- Space Complexity: O(1)

### Key Learning

Even after rotation, Binary Search remains applicable by first identifying the pivot.

---

## Concepts Practiced

✔ Binary Search on Answer

✔ Binary Search on Arrays

✔ Upper Bound

✔ Matrix Searching

✔ Mathematical Binary Search

✔ Overflow Prevention

✔ Pivot Detection

✔ Index Parity Observation

---

## Day Summary

Today's problems focused entirely on advanced Binary Search techniques.

Instead of simply searching for an element, Binary Search was applied in different ways:

- Searching over the answer space
- Searching mathematical values
- Exploiting sorted pair properties
- Finding pivots in rotated arrays

These problems strengthened my understanding that Binary Search is a powerful optimization technique far beyond searching sorted arrays.

---

## Statistics

Problems Solved Today: 4

Total Problems Solved So Far: 64

Days Completed: 20/45

---

## Screenshots

### Median in a Row-wise Sorted Matrix

![Median Matrix](./screenshots/median-row-wise-sorted-matrix.png)

### Find Nth Root of M

![Nth Root](./screenshots/nth-root-of-m.png)

### Single Element in a Sorted Array

![Single Element](./screenshots/single-element-sorted-array.png)

### Search in Rotated Sorted Array

![Search Rotated Array](./screenshots/search-rotated-sorted-array.png)