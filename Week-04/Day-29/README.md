# Day 29

📅 Date: 29 June 2026

## Problems Solved

### 1. Longest Palindromic Substring

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Used the Expand Around Center technique.

- Considered every character as the center of an odd-length palindrome.
- Considered every pair of adjacent characters as the center of an even-length palindrome.
- Expanded outward while characters matched.
- Updated the longest palindrome whenever a longer one was found.

### Complexity

- Time Complexity: O(N²)
- Space Complexity: O(1)

### Key Learning

Every palindrome has a center. Expanding around each possible center provides an efficient solution without extra space.

---

### 2. Reverse Words in a String

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Traversed the string from the end.

- Ignored extra spaces.
- Identified each word by moving backwards.
- Appended words in reverse order.
- Ensured exactly one space between consecutive words.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Reverse traversal eliminates the need to reverse individual words or use stack-based solutions.

---

### 3. Roman to Integer

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Traversed the string from left to right.

- Converted every Roman symbol to its integer value.
- If the current value was smaller than the next value, subtracted it.
- Otherwise, added it to the answer.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(1)

### Key Learning

Subtractive notation in Roman numerals can be handled by comparing the current symbol with the next symbol.

---

## Concepts Practiced

- Strings
- Two Pointers
- Expand Around Center
- Greedy Traversal
- Character Mapping
- String Manipulation

---

## Day Summary

Today's problems focused on different string processing techniques.

- Solved palindrome detection using center expansion.
- Practiced efficient reverse traversal for sentence manipulation.
- Learned Roman numeral conversion using greedy comparison.

These problems strengthened my understanding of string traversal, pointer manipulation, and pattern recognition.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 93
- Days Completed: 29/45