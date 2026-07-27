# Day 45 🎉

📅 Date: 15 July 2026

## Problems Solved

### 1. Kth Largest Element in an Array

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Solved using the Quickselect algorithm.

- Selected a pivot using partitioning.
- Placed the pivot in its correct sorted position.
- Continued searching only in the relevant half.
- Repeated until the target index was found.

### Complexity

- Average Time Complexity: O(N)
- Worst Time Complexity: O(N²)
- Space Complexity: O(1)

### Key Learning

Quickselect efficiently finds the kth largest element without fully sorting the array.

---

### 2. Sum of Lengths of Distinct Subarrays

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used the Sliding Window technique.

- Maintained a window containing only distinct elements.
- Used a HashSet to track elements inside the window.
- Shrank the window whenever a duplicate appeared.
- Calculated the contribution of every valid window.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Sliding Window combined with a HashSet efficiently handles problems involving distinct subarrays.

---

### 3. Flood Fill

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Performed Depth-First Search (DFS).

- Started from the source cell.
- Recolored every connected cell having the original color.
- Explored all four directions recursively.
- Stopped traversal when boundaries or different colors were encountered.

### Complexity

- Time Complexity: O(M × N)
- Space Complexity: O(M × N)

Where:

- M = Number of rows
- N = Number of columns

### Key Learning

Flood Fill is a classic graph traversal problem that can be solved using either DFS or BFS.

---

## Concepts Practiced

- Quickselect
- Partition Algorithm
- Sliding Window
- HashSet
- Depth-First Search (DFS)
- Graph Traversal
- Matrix Traversal
- Recursion

---

## Day Summary

Successfully completed **Day 45** of the **45-Day SDE Sheet Challenge**.

Today's problems covered three important interview topics:

- Selection algorithms using Quickselect.
- Sliding Window with HashSet for distinct subarray problems.
- DFS-based graph traversal on a matrix using Flood Fill.

These problems reinforced efficient searching techniques, window-based optimization, and graph traversal fundamentals.

---

# 🎯 Challenge Completed

Completed the entire **45-Day Striver SDE Sheet Challenge** by solving **146 coding problems** covering:

- Arrays
- Strings
- Linked Lists
- Stacks & Queues
- Binary Search
- Recursion & Backtracking
- Greedy Algorithms
- Binary Trees
- Binary Search Trees
- Heaps
- Graph Traversal
- Sliding Window
- Advanced Data Structures & Algorithms

This journey significantly strengthened my problem-solving skills, algorithmic thinking, and interview preparation.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved: 146
- Days Completed: **45/45 ✅**