# Day 38

📅 Date: 08 July 2026

## Problems Solved

### 1. Lowest Common Ancestor of a Binary Tree

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Used recursive DFS.

- Returned the current node if it matched either target node.
- Recursively searched both left and right subtrees.
- If both recursive calls returned non-null, the current node was the Lowest Common Ancestor.
- Otherwise, propagated the non-null child upward.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

The recursive return values naturally identify the Lowest Common Ancestor without storing parent pointers.

---

### 2. Same Tree

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Compared both trees recursively.

- If both nodes were null, returned true.
- If one node was null or values differed, returned false.
- Recursively compared left and right subtrees.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Tree equality can be verified through synchronized recursive traversal.

---

### 3. Binary Tree Zigzag Level Order Traversal

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Used DFS with level tracking.

- Created a new list whenever a new level was reached.
- Inserted nodes at the end for even levels.
- Inserted nodes at the beginning for odd levels.
- Traversed recursively while maintaining the current level.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Traversal order can be controlled by changing the insertion position without reversing entire levels.

---

### 4. Boundary Traversal of Binary Tree

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Traversed the tree in three phases.

- Added the left boundary excluding leaf nodes.
- Collected all leaf nodes using DFS.
- Added the right boundary in reverse order while excluding leaves.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Breaking the boundary into left boundary, leaves, and right boundary simplifies the implementation while avoiding duplicate nodes.

---

## Concepts Practiced

- Binary Trees
- DFS
- Tree Traversal
- Lowest Common Ancestor
- Tree Comparison
- Zigzag Traversal
- Boundary Traversal
- Recursion

---

## Day Summary

Today's problems focused on recursive binary tree algorithms and specialized traversal patterns.

- Solved Lowest Common Ancestor using recursive DFS.
- Compared two binary trees through synchronized recursion.
- Implemented zigzag traversal using DFS with level-aware insertion.
- Performed boundary traversal by combining left boundary, leaf nodes, and right boundary traversals.

These problems strengthened my understanding of recursive tree algorithms and traversal techniques commonly used in technical interviews.

---

## Statistics

- Problems Solved Today: 4
- Total Problems Solved So Far: 123
- Days Completed: 38/45