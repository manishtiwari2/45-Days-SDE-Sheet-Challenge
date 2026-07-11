# Day 21

📅 Date: 21 June 2026

## Problems Solved

### 1. Median of Two Sorted Arrays

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Solved using Binary Search on Partition.

- Always performed Binary Search on the smaller array.
- Partitioned both arrays such that the left partition contained half of the total elements.
- Validated the partition using boundary elements.
- Calculated the median based on odd/even total length.

### Complexity

- Time Complexity: O(log(min(N, M)))
- Space Complexity: O(1)

### Key Learning

A partition-based Binary Search can solve problems involving two sorted arrays without merging them.

---

### 2. K-th Element of Two Sorted Arrays

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Extended the Median of Two Sorted Arrays technique.

- Binary searched on the smaller array.
- Maintained exactly K elements in the left partition.
- Used partition validity checks to locate the K-th element.

### Complexity

- Time Complexity: O(log(min(N, M)))
- Space Complexity: O(1)

### Key Learning

Many partition-based Binary Search problems differ only in how the partition size is determined.

---

### 3. Allocate Minimum Pages

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Applied Binary Search on Answer.

- Search space:
  - Low = Maximum pages in a single book.
  - High = Sum of all pages.
- Used a greedy helper function to determine whether allocation was possible within K students.
- Minimized the maximum pages assigned to any student.

### Complexity

- Time Complexity: O(N × log(Sum))
- Space Complexity: O(1)

### Key Learning

Binary Search on Answer combines a monotonic search space with a greedy feasibility check.

---

### 4. Aggressive Cows

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Applied Binary Search on Answer.

- Sorted stall positions.
- Binary searched the minimum possible distance.
- Greedily placed cows while maintaining the required minimum distance.
- Maximized the minimum distance between any two cows.

### Complexity

- Time Complexity: O(N logN + N log(MaxDistance))
- Space Complexity: O(1)

### Key Learning

Maximization problems can often be solved by Binary Searching the answer and validating feasibility greedily.

---

## Concepts Practiced

✔ Binary Search on Partition

✔ Binary Search on Answer

✔ Greedy Validation

✔ Partition Logic

✔ Search Space Design

✔ Answer Space Optimization

✔ Monotonic Functions

✔ Two Sorted Arrays

---

## Day Summary

Today's session focused entirely on advanced Binary Search techniques.

The four problems demonstrated two powerful Binary Search patterns:

### Pattern 1 — Binary Search on Partition

- Median of Two Sorted Arrays
- K-th Element of Two Sorted Arrays

### Pattern 2 — Binary Search on Answer

- Allocate Minimum Pages
- Aggressive Cows

The biggest takeaway was understanding that Binary Search is not limited to searching sorted arrays—it can also optimize answers whenever the search space exhibits a monotonic property.

---

## Statistics

Problems Solved Today: 4

Total Problems Solved So Far: 68

Days Completed: 21/45

---
