# Day 37

📅 Date: 07 July 2026

## Problems Solved

### 1. Binary Tree Level Order Traversal

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Performed Breadth-First Search (BFS).

- Used a queue to process nodes level by level.
- Stored all nodes of the current level before moving to the next.
- Added each level to the final answer.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(W)

Where:
- N = Number of nodes
- W = Maximum width of the tree

### Key Learning

Level Order Traversal is the foundation for many Binary Tree problems involving levels and views.

---

### 2. Maximum Depth of Binary Tree

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Used recursion.

- Computed the height of the left subtree.
- Computed the height of the right subtree.
- Returned one plus the maximum of both heights.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

Where:
- H = Height of the tree

### Key Learning

Tree height problems naturally map to recursive divide-and-conquer solutions.

---

### 3. Diameter of Binary Tree

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Computed height while simultaneously tracking the diameter.

- Calculated the height of left and right subtrees.
- Updated the diameter using `leftHeight + rightHeight`.
- Returned the subtree height to the parent.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Multiple tree properties can often be computed together during a single DFS traversal.

---

### 4. Balanced Binary Tree

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Used postorder DFS.

- Computed subtree heights recursively.
- Returned `-1` immediately if any subtree became unbalanced.
- Checked the height difference at every node.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Returning sentinel values allows early termination and avoids unnecessary traversals.

---

## Concepts Practiced

- Binary Trees
- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Level Order Traversal
- Tree Height
- Diameter of Binary Tree
- Balanced Trees
- Recursion
- Divide and Conquer

---

## Day Summary

Today's problems focused on fundamental binary tree properties and traversals.

- Implemented level order traversal using BFS.
- Calculated the maximum depth through recursive height computation.
- Solved the diameter problem by combining height calculation with DFS.
- Verified tree balance efficiently using postorder traversal and early termination.

These problems strengthened my understanding of recursive tree algorithms and how multiple tree properties can be computed efficiently in a single traversal.

---

## Statistics

- Problems Solved Today: 4
- Total Problems Solved So Far: 119
- Days Completed: 37/45