# Day 31

📅 Date: 01 July 2026

## Problems Solved

### 1. Minimum Insertions to Form a Palindrome

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Converted the problem into finding the Longest Palindromic Subsequence (LPS).

- Reversed the original string.
- Computed the Longest Common Subsequence (LCS) between the string and its reverse.
- Calculated the minimum insertions as:
  
  Minimum Insertions = Length of String − Length of LPS

### Complexity

- Time Complexity: O(N²)
- Space Complexity: O(N²)

### Key Learning

Many palindrome problems can be transformed into LCS problems by reversing the original string.

---

### 2. Find the Index of the First Occurrence in a String

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Implemented the Knuth-Morris-Pratt (KMP) algorithm.

- Constructed the LPS (Longest Prefix Suffix) array.
- Used the LPS array to skip unnecessary comparisons.
- Returned the starting index of the first occurrence.

### Complexity

- Time Complexity: O(N + M)
- Space Complexity: O(M)

### Key Learning

The LPS array enables efficient pattern matching by avoiding redundant character comparisons.

---

### 3. KMP Pattern Searching

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Applied the complete KMP pattern matching algorithm.

- Built the LPS array for the pattern.
- Traversed the text using two pointers.
- Recorded every occurrence of the pattern.
- Reused the LPS array after each successful match to continue searching efficiently.

### Complexity

- Time Complexity: O(N + M)
- Space Complexity: O(M)

### Key Learning

KMP performs linear-time pattern matching by preprocessing the pattern and intelligently skipping matched prefixes.

---

## Concepts Practiced

- Dynamic Programming
- Longest Common Subsequence
- Longest Palindromic Subsequence
- String Matching
- KMP Algorithm
- LPS Array
- Pattern Searching

---

## Day Summary

Today's problems focused on advanced string algorithms and dynamic programming.

- Solved palindrome transformation using LCS.
- Implemented KMP for efficient substring search.
- Extended KMP to locate all pattern occurrences within a text.

These problems strengthened my understanding of dynamic programming, preprocessing techniques, and efficient pattern matching algorithms.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 99
- Days Completed: 31/45