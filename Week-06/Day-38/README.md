# Day 39

📅 Date: 09 July 2026

## Problems Solved

### 1. Binary Tree Maximum Path Sum

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Used postorder DFS to compute the maximum gain from each subtree.

- Ignored negative subtree contributions by taking `max(0, gain)`.
- Calculated the path passing through the current node.
- Updated the global maximum path sum.
- Returned the maximum gain that could be extended to the parent.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

For path sum problems, each recursive call should return the maximum contribution to its parent while separately maintaining the best complete path.

---

### 2. Construct Binary Tree from Preorder and Inorder Traversal

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Reconstructed the tree recursively.

- Used preorder traversal to identify the root.
- Stored inorder indices in a HashMap for constant-time lookup.
- Divided the inorder array into left and right subtrees.
- Built both subtrees recursively.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Combining preorder traversal with inorder indexing enables reconstruction of the original binary tree in linear time.

---

### 3. Construct Binary Tree from Inorder and Postorder Traversal

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Built the tree recursively starting from the end of the postorder array.

- Selected the current root from postorder.
- Located the root in the inorder traversal.
- Constructed the right subtree before the left subtree.
- Repeated recursively until the tree was reconstructed.

### Complexity

- Time Complexity: O(N²) *(Current implementation due to linear inorder search)*
- Space Complexity: O(H)

### Key Learning

When reconstructing from inorder and postorder traversals, the right subtree must be built before the left because postorder is processed from the end.

> **Note:** This implementation can be optimized to **O(N)** by storing inorder indices in a HashMap.

---

## Concepts Practiced

- Binary Trees
- DFS
- Postorder Traversal
- Tree Reconstruction
- Divide and Conquer
- HashMap
- Recursive Tree Construction
- Maximum Path Sum

---

## Day Summary

Today's problems focused on advanced binary tree recursion and reconstruction techniques.

- Computed the maximum path sum using postorder DFS and subtree gains.
- Reconstructed binary trees from preorder-inorder and inorder-postorder traversals.
- Practiced divide-and-conquer strategies for recursive tree construction.

These problems strengthened my understanding of recursive tree algorithms, traversal relationships, and efficient tree reconstruction techniques.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 126
- Days Completed: 39/45