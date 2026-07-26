# Day 35

📅 Date: 05 July 2026

## Problems Solved

### 1. Morris Preorder Traversal

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Implemented Morris Preorder Traversal to traverse the tree without recursion or an explicit stack.

- Visited the current node before traversing the left subtree.
- Created temporary threads to the inorder predecessor.
- Removed threads after revisiting the node to restore the original tree.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(1)

### Key Learning

Morris Traversal enables preorder traversal in constant auxiliary space by temporarily modifying tree links.

---

### 2. Left View of Binary Tree

**Platform:** GeeksforGeeks

**Difficulty:** Easy

### Approach

Used DFS with level tracking.

- Traversed the left subtree before the right subtree.
- Added the first node encountered at every depth to the answer.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Depth-first traversal combined with level information can efficiently generate the left view.

---

### 3. Binary Tree Right Side View

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Performed level order traversal using BFS.

- Processed nodes level by level.
- Stored the last node encountered at each level.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(W)

Where:
- W = Maximum width of the tree.

### Key Learning

Level order traversal naturally identifies visible nodes from the right side.

---

### 4. Find Bottom Left Tree Value

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Applied level order traversal.

- Traversed the tree level by level.
- Recorded the first node at every level.
- The first node of the last level became the answer.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(W)

### Key Learning

The first node encountered at the deepest level represents the bottom-left value.

---

### 5. Top View of Binary Tree

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used BFS with Horizontal Distance (HD).

- Assigned each node a horizontal distance.
- Stored only the first node encountered for every horizontal distance.
- Used a TreeMap to maintain left-to-right ordering.

### Complexity

- Time Complexity: O(N log N)
- Space Complexity: O(N)

### Key Learning

Horizontal distance combined with level order traversal is the standard approach for top view problems.

---

## Concepts Practiced

- Binary Trees
- Morris Traversal
- DFS
- BFS
- Level Order Traversal
- Tree Views
- Horizontal Distance
- TreeMap
- Queue

---

## Day Summary

Today's problems focused on different ways of viewing and traversing binary trees.

- Implemented Morris Preorder Traversal for O(1) space traversal.
- Solved left and right view problems using DFS and BFS.
- Identified the bottom-left node through level order traversal.
- Learned the horizontal distance technique for computing the top view.

These problems strengthened my understanding of traversal strategies and view-based binary tree algorithms.

---

## Statistics

- Problems Solved Today: 5
- Total Problems Solved So Far: 111
- Days Completed: 35/45