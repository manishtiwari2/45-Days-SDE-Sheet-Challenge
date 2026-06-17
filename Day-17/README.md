# Day 17

📅 Date: 17 June 2026

## Problems Solved

### 1. Subset Sums

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used recursion with the Pick / Not Pick pattern.

For every element:

- Include it in the current subset sum.
- Exclude it from the current subset sum.

Stored all possible subset sums and sorted the final result.

### Complexity

- Time Complexity: O(2^n)
- Space Complexity: O(2^n)

### Key Learning

Subset generation forms the foundation of recursion and backtracking.

---

### 2. Subsets II

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Sorted the array to bring duplicates together.

Generated subsets using backtracking while skipping duplicate elements at the same recursion level.

### Complexity

- Time Complexity: O(2^n)
- Space Complexity: O(2^n)

### Key Learning

Sorting and duplicate skipping are essential techniques when generating unique combinations.

---

### 3. Combination Sum

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Used recursion and backtracking.

At every step:

- Pick the current element and stay at the same index.
- Skip the current element and move ahead.

Elements could be reused multiple times.

### Complexity

- Time Complexity: Exponential
- Space Complexity: O(target)

### Key Learning

Allowing reuse of elements changes the recursion tree significantly.

---

### 4. Combination Sum II

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Sorted the array.

Used backtracking while:

- Avoiding duplicate combinations.
- Allowing each element to be used only once.

Skipped repeated elements at the same recursion level.

### Complexity

- Time Complexity: Exponential
- Space Complexity: O(n)

### Key Learning

Careful duplicate handling is necessary to avoid repeated combinations.

---

### 5. Palindrome Partitioning

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Generated all possible partitions recursively.

Only continued recursion when the current substring was a palindrome.

Stored every valid partition.

### Complexity

- Time Complexity: O(n × 2^n)
- Space Complexity: O(n)

### Key Learning

Backtracking combined with validation checks can efficiently explore valid solution spaces.

---

### 6. Permutation Sequence

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Initially considered generating all permutations.

Optimized using the Factorial Number System:

- Determined which block contains the kth permutation.
- Selected digits directly without generating all permutations.

### Complexity

- Time Complexity: O(n²)
- Space Complexity: O(n)

### Key Learning

Mathematical observations can sometimes replace expensive recursive generation.

---

## Concepts Practiced

✔ Recursion

✔ Backtracking

✔ Pick / Not Pick Pattern

✔ Subset Generation

✔ Combination Generation

✔ Duplicate Handling

✔ Palindrome Checking

✔ Factorial Number System

✔ Pruning

---

## Day Summary

Today's problems focused on building a strong foundation in recursion and backtracking.

The biggest takeaway was understanding how different recursive patterns emerge from small modifications in decision making:

- Pick / Not Pick
- Reuse / No Reuse
- Duplicate Skipping
- Partitioning
- Direct Mathematical Construction

These patterns are widely used in advanced backtracking problems such as N-Queens, Sudoku Solver, Rat in a Maze, and Word Search.

---

## Statistics

Problems Solved Today: 6

Total Problems Solved So Far: 54

Days Completed: 17/45

---

## Screenshots

### Subset Sums

![Subset Sums](./screenshots/subset-sums.png)

### Subsets II

![Subsets II](./screenshots/subsets-ii.png)

### Combination Sum

![Combination Sum](./screenshots/combination-sum.png)

### Combination Sum II

![Combination Sum II](./screenshots/combination-sum-ii.png)

### Palindrome Partitioning

![Palindrome Partitioning](./screenshots/palindrome-partitioning.png)

### Permutation Sequence

![Permutation Sequence](./screenshots/permutation-sequence.png)