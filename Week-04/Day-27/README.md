# Day 27

📅 Date: 27 June 2026

## Problems Solved

### 1. Rotten Oranges

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Solved using Multi-Source BFS.

- Inserted all initially rotten oranges into a queue.
- Counted the number of fresh oranges.
- Processed the queue level by level, where each level represents one minute.
- Converted adjacent fresh oranges into rotten oranges.
- Continued until no fresh oranges remained or the queue became empty.

### Complexity

- Time Complexity: O(R × C)
- Space Complexity: O(R × C)

### Key Learning

Multi-Source BFS is an effective approach when multiple starting points spread simultaneously.

---

### 2. Largest Rectangle in Histogram

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Used a Monotonic Increasing Stack.

- Traversed all bars while maintaining increasing heights.
- Whenever a smaller height was encountered, calculated the maximum rectangle using the popped height.
- Added a virtual bar of height 0 at the end to process all remaining bars.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Monotonic stacks efficiently compute nearest smaller elements and are widely used in histogram and rectangle problems.

---

### 3. Sliding Window Maximum

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Used a Monotonic Decreasing Deque.

- Stored indices of useful elements.
- Removed indices outside the current window.
- Removed smaller elements from the back since they can never become the maximum.
- The front of the deque always represented the maximum element of the current window.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(K)

### Key Learning

A monotonic deque maintains window maximums in linear time, making it ideal for sliding window optimization.

---

### 4. Min Stack

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Maintained a stack storing both:

- Current value
- Minimum value up to that point

Each push stores the minimum seen so far, allowing constant-time retrieval of the minimum element.

### Complexity

- Push: O(1)
- Pop: O(1)
- Top: O(1)
- GetMin: O(1)
- Space Complexity: O(N)

### Key Learning

Storing auxiliary information alongside each element enables efficient retrieval of aggregate properties like minimum values.

---

## Concepts Practiced

✔ Multi-Source BFS

✔ Queue

✔ Monotonic Stack

✔ Monotonic Deque

✔ Sliding Window

✔ Histogram Problems

✔ Stack Design

✔ Auxiliary Data Structures

---

## Day Summary

Today's problems focused on advanced applications of queues and stacks.

Implemented Multi-Source BFS for grid traversal, solved histogram and sliding window optimization problems using monotonic data structures, and designed a Min Stack supporting constant-time minimum retrieval.

These problems reinforced important interview patterns involving BFS, monotonic stacks, deques, and custom data structure design.

---

## Statistics

Problems Solved Today: 4

Total Problems Solved So Far: 88

Days Completed: 27/45