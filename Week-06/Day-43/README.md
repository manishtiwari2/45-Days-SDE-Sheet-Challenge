# Day 43

📅 Date: 13 July 2026

## Problems Solved

### 1. Floor in BST

**Platform:** GeeksforGeeks

**Difficulty:** Easy

### Approach

Used the Binary Search Tree property recursively.

- If the current node's value equals the key, it is the floor.
- If the current value is greater than the key, searched the left subtree.
- Otherwise, searched the right subtree for a better candidate.
- Returned the current node if no larger floor existed in the right subtree.

### Complexity

- Time Complexity: O(H)
- Space Complexity: O(H)

Where:
- H = Height of the BST

### Key Learning

The floor is the greatest value less than or equal to the target, making BST traversal highly efficient.

---

### 2. Ceil in BST

**Platform:** GeeksforGeeks

**Difficulty:** Easy

### Approach

Used an iterative BST traversal.

- Traversed left whenever the current value was greater than the target while storing it as a potential answer.
- Traversed right when the current value was smaller.
- Returned immediately if an exact match was found.

### Complexity

- Time Complexity: O(H)
- Space Complexity: O(1)

### Key Learning

Maintaining the current best candidate while traversing eliminates unnecessary exploration.

---

### 3. Kth Smallest Element in a BST

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Performed an inorder traversal.

- Visited nodes in sorted order.
- Maintained a counter.
- Returned the node value when the counter reached **k**.

### Complexity

- Time Complexity: O(H + K)
- Space Complexity: O(H)

### Key Learning

Inorder traversal of a BST always produces values in ascending order.

---

### 4. Kth Largest Element in a BST

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Performed a reverse inorder traversal.

- Visited the right subtree first.
- Counted visited nodes.
- Returned the value when the kth node was encountered.

### Complexity

- Time Complexity: O(H + K)
- Space Complexity: O(H)

### Key Learning

Reverse inorder traversal visits BST nodes in descending order.

---

## Concepts Practiced

- Binary Search Trees
- Floor in BST
- Ceil in BST
- Inorder Traversal
- Reverse Inorder Traversal
- BST Search
- Tree Traversal
- Recursion

---

## Day Summary

Today's problems focused on leveraging Binary Search Tree properties for efficient searching and ordered traversal.

- Found the floor and ceil of a given key using BST ordering.
- Retrieved the kth smallest element using inorder traversal.
- Retrieved the kth largest element using reverse inorder traversal.

These problems strengthened my understanding of ordered traversals and search-based operations in Binary Search Trees.

---

## Statistics

- Problems Solved Today: 4
- Total Problems Solved So Far: 140
- Days Completed: 43/45