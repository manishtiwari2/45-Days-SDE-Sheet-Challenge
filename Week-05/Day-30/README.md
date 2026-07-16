# Day 30

📅 Date: 30 June 2026

## Problems Solved

### 1. String to Integer (atoi)

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Implemented the string parsing process manually.

- Ignored leading whitespaces.
- Determined the sign of the number.
- Parsed consecutive digits.
- Checked for integer overflow during construction.
- Returned the appropriate integer value or overflow boundary.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(1)

### Key Learning

Carefully handling edge cases such as whitespace, signs, invalid characters, and overflow is essential in parsing problems.

---

### 2. Longest Common Prefix

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Used the first string as the initial prefix.

- Compared the prefix with every string.
- Shrunk the prefix until it matched the current string.
- Returned the remaining common prefix.

### Complexity

- Time Complexity: O(N × M)
- Space Complexity: O(1)

Where:
- N = Number of strings
- M = Length of the shortest string

### Key Learning

Repeatedly reducing the candidate prefix leads to a simple and efficient solution.

---

### 3. Rabin-Karp Algorithm

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Implemented Rolling Hash.

- Computed hash values for the pattern and first window.
- Compared hashes while sliding the window.
- Verified characters whenever hashes matched.
- Updated the rolling hash efficiently.

### Complexity

- Average Time Complexity: O(N + M)
- Worst Case: O(N × M)
- Space Complexity: O(1)

### Key Learning

Rolling Hash significantly reduces unnecessary character comparisons while enabling efficient pattern matching.

---

## Concepts Practiced

- String Parsing
- Overflow Handling
- Prefix Matching
- Rolling Hash
- String Hashing
- Pattern Matching
- Sliding Window
- Character Processing

---

## Day Summary

Today's problems focused on advanced string manipulation and pattern matching.

- Implemented robust string parsing with overflow handling.
- Solved prefix matching using iterative reduction.
- Learned Rabin-Karp algorithm and rolling hash for efficient substring search.

These problems strengthened my understanding of string algorithms commonly asked in coding interviews.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 96
- Days Completed: 30/45