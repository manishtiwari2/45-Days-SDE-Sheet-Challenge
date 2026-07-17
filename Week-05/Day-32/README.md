# Day 32

📅 Date: 02 July 2026

## Problems Solved

### 1. Valid Anagram

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Used a frequency array to compare character occurrences.

- Counted the frequency of each character in the first string.
- Decremented the frequency while traversing the second string.
- Verified that every frequency returned to zero.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(1)

### Key Learning

Frequency counting provides an optimal solution for anagram verification when the character set is fixed.

---

### 2. Count and Say

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Generated each sequence iteratively.

- Started with the base string `"1"`.
- Counted consecutive identical characters.
- Constructed the next sequence by appending the count followed by the digit.
- Repeated until reaching the required term.

### Complexity

- Time Complexity: O(N × M)
- Space Complexity: O(M)

Where:
- N = Term number
- M = Length of the generated sequence

### Key Learning

Simulation problems often require careful traversal and grouping of consecutive elements.

---

### 3. Compare Version Numbers

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Compared revision numbers one by one.

- Parsed integers between consecutive dots.
- Compared corresponding revision numbers.
- Ignored leading zeros naturally during integer conversion.
- Continued until all revisions were processed.

### Complexity

- Time Complexity: O(N + M)
- Space Complexity: O(1)

### Key Learning

Pointer-based parsing is an efficient alternative to splitting strings, avoiding extra space usage.

---

## Concepts Practiced

- Frequency Array
- String Simulation
- Two Pointers
- String Parsing
- Character Processing
- Sequential Comparison

---

## Day Summary

Today's problems focused on practical string processing techniques.

- Solved anagram verification using frequency counting.
- Implemented the Count and Say sequence through iterative simulation.
- Compared version numbers efficiently using pointer-based parsing.

These problems strengthened my understanding of string manipulation, simulation, and efficient parsing techniques commonly used in coding interviews.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 102
- Days Completed: 32/45