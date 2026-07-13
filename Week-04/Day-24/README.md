# Day 24

📅 Date: 24 June 2026

## Problems Solved

### 1. Valid Parentheses

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Used a Stack to keep track of opening brackets.

- Push every opening bracket.
- For every closing bracket, verify it matches the top of the stack.
- If it doesn't match or the stack is empty, the string is invalid.
- At the end, the stack must be empty.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Stack is the ideal data structure for problems involving matching symbols and nested structures.

---

### 2. Next Greater Element

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used a Monotonic Decreasing Stack.

- Traverse the array from right to left.
- Remove all elements smaller than or equal to the current element.
- The remaining top of the stack is the Next Greater Element.
- Push the current element into the stack.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Monotonic stacks efficiently solve nearest greater/smaller element problems by ensuring each element is pushed and popped at most once.

---

### 3. Sort a Stack

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Solved recursively without using any extra data structure.

- Remove the top element recursively.
- Sort the remaining stack.
- Insert the removed element back into its correct sorted position.

### Complexity

- Time Complexity: O(N²)
- Space Complexity: O(N)

### Key Learning

Recursion can simulate an auxiliary stack by leveraging the function call stack, making it useful for recursive sorting and backtracking problems.

---

## Concepts Practiced

✔ Stack

✔ Monotonic Stack

✔ Balanced Parentheses

✔ Next Greater Element

✔ Recursion

✔ Recursive Stack Manipulation

✔ Function Call Stack

---

## Day Summary

Today's session focused entirely on Stack-based problem solving.

Started with validating balanced parentheses, moved to solving the Next Greater Element problem using a Monotonic Stack, and finally implemented recursive stack sorting without using any additional data structures.

These problems reinforced both iterative and recursive applications of stacks commonly asked in coding interviews.

---

## Statistics

Problems Solved Today: 3

Total Problems Solved So Far: 78

Days Completed: 24/45