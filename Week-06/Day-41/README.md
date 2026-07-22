# Day 41

📅 Date: 11 July 2026

## Problems Solved

### 1. Populating Next Right Pointers in Each Node

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Used recursive DFS on a perfect binary tree.

- Connected the left child to the right child.
- Connected the right child to the left child of the adjacent node using the parent's `next` pointer.
- Recursively processed the left and right subtrees.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

The `next` pointers established at one level can be leveraged to connect nodes across different subtrees without additional data structures.

---

### 2. Convert Sorted Array to Binary Search Tree

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Constructed the BST using divide and conquer.

- Selected the middle element as the root.
- Recursively built the left subtree from the left half.
- Recursively built the right subtree from the right half.
- Ensured the resulting BST remained height-balanced.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Choosing the middle element recursively guarantees a balanced Binary Search Tree.

---

### 3. Search in a Binary Search Tree

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Performed iterative BST search.

- Compared the target value with the current node.
- Moved left if the target was smaller.
- Moved right if the target was larger.
- Returned the node once the value was found.

### Complexity

- Time Complexity: O(H)
- Space Complexity: O(1)

Where:
- H = Height of the Binary Search Tree.

### Key Learning

The BST ordering property enables efficient searching without traversing the entire tree.

---

## Concepts Practiced

- Binary Trees
- Binary Search Trees
- DFS
- Divide and Conquer
- Tree Construction
- BST Search
- Next Pointer Connections
- Recursion

---

## Day Summary

Today's problems marked the transition from Binary Trees to Binary Search Trees.

- Connected adjacent nodes in a perfect binary tree using existing `next` pointers.
- Constructed a height-balanced BST from a sorted array.
- Implemented efficient iterative search in a Binary Search Tree.

These problems strengthened my understanding of BST properties, recursive tree construction, and pointer-based tree traversal techniques.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 132
- Days Completed: 41/45