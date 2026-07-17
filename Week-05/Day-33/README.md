# Day 33

📅 Date: 03 July 2026

## Problems Solved

### 1. Binary Tree Inorder Traversal

**Platform:** GeeksforGeeks

**Difficulty:** Easy

### Approach

Implemented recursive inorder traversal.

- Traverse the left subtree.
- Visit the current node.
- Traverse the right subtree.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

Where:
- N = Number of nodes
- H = Height of the tree

### Key Learning

Recursive inorder traversal naturally follows the Left → Root → Right order and is the foundation for BST-related problems.

---

### 2. Binary Tree Preorder Traversal

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Implemented recursive preorder traversal.

- Visit the current node.
- Traverse the left subtree.
- Traverse the right subtree.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Preorder traversal is useful for tree serialization and copying tree structures.

---

### 3. Binary Tree Postorder Traversal

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Implemented recursive postorder traversal.

- Traverse the left subtree.
- Traverse the right subtree.
- Visit the current node.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Postorder traversal is widely used for deletion, evaluation, and bottom-up tree processing.

---

### 4. Morris Inorder Traversal

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Implemented Morris Traversal to perform inorder traversal without recursion or an explicit stack.

- Traversed the tree using temporary threaded links.
- Visited nodes when no left child existed or after restoring threads.
- Restored the original tree structure after traversal.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(1)

### Key Learning

Morris Traversal achieves inorder traversal in constant auxiliary space by temporarily modifying tree pointers.

---

## Concepts Practiced

- Binary Trees
- Tree Traversals
- Inorder Traversal
- Preorder Traversal
- Postorder Traversal
- Recursion
- Morris Traversal
- Threaded Binary Trees

---

## Day Summary

Today's focus was on fundamental binary tree traversal techniques.

- Implemented recursive inorder, preorder, and postorder traversals.
- Learned Morris Traversal to achieve inorder traversal with O(1) auxiliary space.
- Strengthened understanding of recursive tree processing and traversal order.

These problems built a solid foundation for more advanced binary tree and binary search tree algorithms.

---

## Statistics

- Problems Solved Today: 4
- Total Problems Solved So Far: 106
- Days Completed: 33/45