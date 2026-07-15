# Day 28

📅 Date: 28 June 2026

## Problems Solved

### 1. Online Stock Span

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Used a Monotonic Decreasing Stack.

- Stored pairs of `(price, span)`.
- While the current price was greater than or equal to the stack's top price, merged their spans.
- Pushed the current price along with its computed span.

### Complexity

- Time Complexity: O(N) Amortized
- Space Complexity: O(N)

### Key Learning

Storing additional information (span) inside the stack avoids repeatedly traversing previous elements and gives an amortized O(1) solution.

---

### 2. Maximum of Minimum for Every Window Size

**Platform:** GeeksforGeeks

**Difficulty:** Hard

### Approach

Solved using Monotonic Stack.

- Computed Previous Smaller Element (PSE).
- Computed Next Smaller Element (NSE).
- Determined the maximum window length where each element is the minimum.
- Filled answers for each window size.
- Propagated remaining values from larger window sizes to smaller ones.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Nearest Smaller Element concepts can solve advanced window optimization problems in linear time.

---

### 3. The Celebrity Problem

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used Stack Elimination.

- Initially pushed every person into the stack.
- Compared two people at a time.
- Eliminated one person based on the "knows" relationship.
- Verified the final candidate by checking:
  - They know nobody.
  - Everyone knows them.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Candidate elimination is a powerful strategy that reduces the search space before final verification.

---

## Concepts Practiced

✔ Monotonic Stack

✔ Previous Smaller Element

✔ Next Smaller Element

✔ Stock Span

✔ Window Optimization

✔ Candidate Elimination

✔ Stack-Based Problems

---

## Day Summary

Today's session focused on advanced stack-based interview problems.

Solved Online Stock Span using an optimized monotonic stack, tackled the challenging Maximum of Minimum for Every Window Size using Previous and Next Smaller Elements, and implemented the Celebrity Problem using stack-based candidate elimination followed by verification.

These problems strengthened my understanding of monotonic stacks and elimination techniques frequently used in coding interviews.

---

## Statistics

Problems Solved Today: 3

Total Problems Solved So Far: 91

Days Completed: 28/45