# Day 40

📅 Date: 10 July 2026

## Problems Solved

### 1. Symmetric Tree

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Used recursive mirror checking.

- Compared the left and right subtrees simultaneously.
- Verified that both nodes existed and had the same value.
- Recursively compared:
  - Left subtree of the left node with the right subtree of the right node.
  - Right subtree of the left node with the left subtree of the right node.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Mirror symmetry can be verified efficiently by recursively comparing opposite child nodes.

---

### 2. Flatten Binary Tree to Linked List

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Flattened the tree in-place using an iterative Morris-style traversal.

- Traversed the tree using a pointer.
- For every node with a left child:
  - Located the rightmost node of the left subtree.
  - Connected it to the original right subtree.
  - Moved the left subtree to the right.
  - Set the left child to `null`.
- Continued along the right pointers.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(1)

### Key Learning

Tree restructuring can be performed in-place by rewiring pointers without using recursion or an auxiliary stack.

---

### 3. Children Sum Property

**Platform:** GeeksforGeeks

**Difficulty:** Easy

### Approach

Validated the Children Sum Property using recursion.

- Treated null nodes and leaf nodes as valid.
- Calculated the sum of existing children.
- Compared the current node's value with the children's sum.
- Recursively verified the left and right subtrees.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Recursive validation is well-suited for checking structural properties across every node in a binary tree.

---

## Concepts Practiced

- Binary Trees
- Recursion
- Mirror Trees
- Tree Transformation
- In-place Pointer Manipulation
- Morris-style Traversal
- Children Sum Property

---

## Day Summary

Today's problems focused on recursive validation and in-place binary tree transformations.

- Verified tree symmetry using mirror recursion.
- Flattened a binary tree into a linked list using pointer manipulation.
- Checked the Children Sum Property recursively across the tree.

These problems strengthened my understanding of recursive tree algorithms and efficient in-place tree modifications.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 129
- Days Completed: 40/45