# Day 36

📅 Date: 06 July 2026

## Problems Solved

### 1. Preorder, Inorder and Postorder in One Traversal

**Platform:** Coding Ninjas

**Difficulty:** Medium

### Approach

Performed all three traversals using a single iterative traversal.

- Used a stack storing each node along with its traversal state.
- State 1 → Preorder
- State 2 → Inorder
- State 3 → Postorder
- Visited every node exactly once while producing all three traversals.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Using traversal states allows generating preorder, inorder, and postorder traversals in a single pass.

---

### 2. Vertical Order Traversal

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Used BFS with coordinate tracking.

- Assigned each node a row and column.
- Stored nodes in nested TreeMaps ordered by column and row.
- Used a PriorityQueue to resolve nodes sharing the same position.
- Constructed the answer column by column.

### Complexity

- Time Complexity: O(N log N)
- Space Complexity: O(N)

### Key Learning

Maintaining row, column, and value ordering is essential for correctly implementing vertical traversal.

---

### 3. Root to Leaf Paths

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Applied DFS with backtracking.

- Maintained the current root-to-node path.
- Added a copy of the path when reaching a leaf node.
- Removed the current node during backtracking.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Backtracking enables efficient generation of all root-to-leaf paths without unnecessary copying.

---

### 4. Maximum Width of Binary Tree

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Performed level order traversal using indexed nodes.

- Assigned virtual indices similar to a complete binary tree.
- Normalized indices at each level to avoid overflow.
- Calculated width as the difference between the first and last index at every level.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Virtual indexing provides an elegant way to compute the maximum width even when the tree contains missing nodes.

---

## Concepts Practiced

- Binary Trees
- DFS
- BFS
- Stack
- Queue
- Backtracking
- Vertical Traversal
- Level Order Traversal
- Coordinate Mapping
- TreeMap
- Priority Queue

---

## Day Summary

Today's problems focused on advanced binary tree traversal techniques and tree views.

- Generated preorder, inorder, and postorder traversals in a single iterative pass.
- Solved vertical traversal using BFS with coordinate mapping.
- Generated all root-to-leaf paths using DFS and backtracking.
- Computed the maximum width of a binary tree using indexed level order traversal.

These problems strengthened my understanding of traversal optimization, coordinate-based tree algorithms, and BFS/DFS applications in binary trees.

---

## Statistics

- Problems Solved Today: 4
- Total Problems Solved So Far: 115
- Days Completed: 36/45