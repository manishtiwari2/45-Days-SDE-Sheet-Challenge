# Day 42

📅 Date: 12 July 2026

## Problems Solved

### 1. Construct Binary Search Tree from Preorder Traversal

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Constructed the BST recursively using an upper bound.

- Traversed the preorder array once.
- Maintained a global index.
- Created nodes while the current value remained within the allowed bound.
- Recursively built the left subtree with the current node's value as the new bound.
- Built the right subtree using the inherited bound.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Using value bounds eliminates the need to search for subtree boundaries, allowing linear-time BST construction.

---

### 2. Validate Binary Search Tree

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Validated the BST using recursion with value ranges.

- Maintained lower and upper bounds for every node.
- Ensured each node's value lay strictly within its valid range.
- Updated bounds recursively for left and right subtrees.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(H)

### Key Learning

Every node must satisfy constraints imposed by all its ancestors, not just its immediate parent.

---

### 3. Lowest Common Ancestor of a Binary Search Tree

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Leveraged the BST property.

- Traversed left if both target nodes were smaller.
- Traversed right if both target nodes were larger.
- Returned the current node when the targets diverged.

### Complexity

- Time Complexity: O(H)
- Space Complexity: O(H)

### Key Learning

BST ordering enables efficient Lowest Common Ancestor computation without exploring both subtrees.

---

### 4. Predecessor and Successor

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Traversed the BST iteratively.

- Maintained potential predecessor and successor while searching for the key.
- If the key existed:
  - Found predecessor as the maximum node in the left subtree.
  - Found successor as the minimum node in the right subtree.
- Returned both nodes after traversal.

### Complexity

- Time Complexity: O(H)
- Space Complexity: O(1)

### Key Learning

BST ordering allows predecessor and successor to be determined efficiently during a single search.

---

## Concepts Practiced

- Binary Search Trees
- BST Construction
- BST Validation
- Lowest Common Ancestor
- Predecessor and Successor
- Recursion
- Divide and Conquer
- Tree Traversal

---

## Day Summary

Today's problems focused on advanced Binary Search Tree operations.

- Constructed a BST directly from preorder traversal in linear time.
- Validated BST properties using recursive value constraints.
- Found the Lowest Common Ancestor by leveraging BST ordering.
- Computed predecessor and successor efficiently using iterative traversal.

These problems strengthened my understanding of BST invariants and how tree ordering simplifies many common operations.

---

## Statistics

- Problems Solved Today: 4
- Total Problems Solved So Far: 136
- Days Completed: 42/45