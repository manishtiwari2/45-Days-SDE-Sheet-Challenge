# Day 22

📅 Date: 22 June 2026

## Problems Solved

### 1. Implement Max Heap

**Platform:** Coding Problem

**Difficulty:** Medium

### Approach

Implemented a Max Heap from scratch using an ArrayList.

Operations implemented:

- Push (Insertion)
- Pop (Deletion of Maximum)
- Peek
- Size

Insertion uses **Heapify Up**, while deletion uses **Heapify Down** to maintain the Max Heap property.

### Complexity

- Push: O(log N)
- Pop: O(log N)
- Peek: O(1)
- Size: O(1)

### Key Learning

Understanding heap implementation from scratch strengthens the foundation for Priority Queue based interview problems.

---

### 2. Kth Largest Element in an Array

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Maintained a Min Heap of size K.

- Insert every element into the heap.
- If heap size exceeds K, remove the smallest element.
- After processing all elements, the heap root represents the K-th largest element.

### Complexity

- Time Complexity: O(N log K)
- Space Complexity: O(K)

### Key Learning

Keeping only the K most relevant elements is often more efficient than sorting the entire array.

---

### 3. Choose K Elements With Maximum Sum

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

- Combined values into custom Pair objects.
- Sorted pairs based on nums1.
- Processed equal values together.
- Maintained a Min Heap containing the largest K values from nums2.
- Stored prefix answers before inserting the current group's elements.

### Complexity

- Time Complexity: O(N log N + N log K)
- Space Complexity: O(N + K)

### Key Learning

Combining sorting with Priority Queues enables efficient solutions for advanced offline query problems.

---

## Concepts Practiced

✔ Heap Implementation

✔ Heapify Up

✔ Heapify Down

✔ Priority Queue

✔ Min Heap

✔ Max Heap

✔ Top-K Problems

✔ Greedy + Heap

✔ Sorting with Custom Comparator

✔ Offline Processing

---

## Day Summary

Today's focus was on Heap and Priority Queue based problems.

The session started by implementing a Max Heap from scratch, reinforcing the internal working of heaps instead of relying solely on Java's PriorityQueue.

The remaining problems demonstrated practical applications of heaps:

- Maintaining Top-K elements efficiently.
- Combining sorting and heaps for optimized processing.
- Using custom data structures to solve complex greedy problems.

---

## Statistics

Problems Solved Today: 3

Total Problems Solved So Far: 71

Days Completed: 22/45

---
