# Day 23

📅 Date: 23 June 2026

## Problems Solved

### 1. Implement Stack Using Array

**Platform:** Coding Problem

**Difficulty:** Easy

### Approach

Implemented a Stack from scratch using an array.

Supported operations:

- Push
- Pop
- Peek
- isEmpty
- isFull

Maintained a `top` pointer to track the current top element.

### Complexity

- Push: O(1)
- Pop: O(1)
- Peek: O(1)
- Space Complexity: O(N)

### Key Learning

Learned how stack operations are implemented internally using arrays and pointer manipulation.

---

### 2. Implement Queue Using Array

**Platform:** Coding Problem

**Difficulty:** Easy

### Approach

Implemented a Queue using an array.

Supported operations:

- Enqueue
- Dequeue
- Front
- Rear
- isEmpty
- isFull

For deletion, elements were shifted to maintain queue order.

### Complexity

- Enqueue: O(1)
- Dequeue: O(N)
- Front: O(1)
- Rear: O(1)
- Space Complexity: O(N)

### Key Learning

Understood the limitations of a simple array-based queue and why circular queues are preferred in practice.

---

### 3. Implement Stack Using Queue

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Used a single Queue.

- Push new element.
- Rotate previous elements behind it.
- Front of the queue always represents the top of the stack.

### Complexity

- Push: O(N)
- Pop: O(1)
- Top: O(1)
- Space Complexity: O(N)

### Key Learning

Simulated LIFO behavior using FIFO operations through queue rotation.

---

### 4. Implement Queue Using Stacks

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Used two stacks.

- First stack handles insertion.
- Second stack handles deletion.
- Transfer elements only when the second stack becomes empty.

### Complexity

- Push: O(1)
- Pop: Amortized O(1)
- Peek: Amortized O(1)
- Space Complexity: O(N)

### Key Learning

Learned the lazy transfer technique that enables efficient queue implementation using stacks.

---

## Concepts Practiced

✔ Stack

✔ Queue

✔ Array Implementation

✔ Queue Rotation

✔ Two Stack Technique

✔ LIFO

✔ FIFO

✔ Amortized Analysis

---

## Day Summary

Today's focus was on understanding the internal implementation of fundamental data structures instead of relying on built-in libraries.

Implemented both Stack and Queue from scratch using arrays and explored how one data structure can be simulated using another:

- Stack using Queue
- Queue using Stacks

These problems strengthened my understanding of data structure design, operation complexities, and interview implementation patterns.

---

## Statistics

Problems Solved Today: 4

Total Problems Solved So Far: 75

Days Completed: 23/45