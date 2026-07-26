# Day 43

📅 Date: 14 July 2026

## Problems Solved

### 1. Two Sum IV - Input is a BST

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Used inorder traversal followed by the two-pointer technique.

- Performed inorder traversal to obtain the BST elements in sorted order.
- Applied two pointers from both ends of the sorted list.
- Compared the current sum with the target and adjusted pointers accordingly.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Inorder traversal converts a BST into a sorted array, allowing classic two-pointer techniques to be applied efficiently.

---

### 2. Maximum Sum BST in Binary Tree

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Traversed every subtree.

- Checked whether each subtree satisfied BST properties.
- Calculated the sum of nodes if the subtree was a BST.
- Updated the maximum BST sum encountered.
- Continued recursively for all subtrees.

### Complexity

- Time Complexity: O(N²) *(Current implementation)*
- Space Complexity: O(H)

### Key Learning

A brute-force recursive solution repeatedly validates BST properties and subtree sums. This problem can be optimized to **O(N)** using postorder traversal that simultaneously computes validity, minimum, maximum, and subtree sum.

---

### 3. Binary Search Tree Iterator

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Implemented an iterator using a stack.

- Stored the leftmost path initially.
- Returned the next smallest element by popping the stack.
- Processed the right subtree by pushing its leftmost path.

### Complexity

- Time Complexity:
  - `next()` → O(1) amortized
  - `hasNext()` → O(1)
- Space Complexity: O(H)

### Key Learning

Maintaining the leftmost path in a stack efficiently simulates inorder traversal while supporting iterator operations.

---

### 4. Serialize and Deserialize Binary Tree

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Used level-order traversal.

- Serialized the tree using BFS.
- Represented null nodes with `#`.
- During deserialization, rebuilt the tree level by level using a queue.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Including null markers preserves the exact tree structure, enabling accurate reconstruction.

---

## Concepts Practiced

- Binary Search Trees
- Inorder Traversal
- Two Pointers
- BST Iterator
- Queue
- Stack
- Tree Serialization
- Tree Deserialization
- BFS
- DFS

---

## Day Summary

Today's problems combined Binary Search Tree operations with advanced tree design concepts.

- Solved the Two Sum problem in a BST using inorder traversal and two pointers.
- Explored finding the maximum-sum BST inside a binary tree.
- Implemented a BST iterator with amortized constant-time operations.
- Serialized and deserialized binary trees using level-order traversal.

These problems strengthened my understanding of BST traversal, iterator design, tree encoding, and advanced recursive algorithms.

---

## Statistics

- Problems Solved Today: 4
- Total Problems Solved So Far: 140
- Days Completed: 43/45