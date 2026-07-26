# Day 44

📅 Date: 14 July 2026

## Problems Solved

### 1. Binary Tree to Doubly Linked List

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Converted the binary tree into a doubly linked list using inorder traversal.

- Performed an inorder traversal to collect nodes.
- Stored nodes in an ArrayList.
- Linked consecutive nodes by updating their `left` and `right` pointers.
- Returned the head of the doubly linked list.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

An inorder traversal preserves the sorted order of nodes in a Binary Search Tree, making it suitable for DLL conversion.

---

### 2. Find Median from Data Stream

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Maintained two heaps.

- A max heap stored the smaller half of the numbers.
- A min heap stored the larger half.
- Balanced both heaps after every insertion.
- Computed the median using the heap tops.

### Complexity

- addNum(): O(log N)
- findMedian(): O(1)
- Space Complexity: O(N)

### Key Learning

Two heaps efficiently maintain a dynamically changing median with logarithmic insertion time.

---

### 3. Kth Largest Element in a Stream

**Platform:** LeetCode

**Difficulty:** Easy

### Approach

Maintained a min heap of size **k**.

- Inserted every incoming element.
- Removed the smallest element whenever the heap exceeded size **k**.
- The heap's root always represented the kth largest element.

### Complexity

- Constructor: O(N log K)
- add(): O(log K)
- Space Complexity: O(K)

### Key Learning

A fixed-size min heap is the optimal data structure for maintaining the kth largest element in a stream.

---

## Concepts Practiced

- Binary Trees
- Doubly Linked List
- Inorder Traversal
- Heap
- Priority Queue
- Data Stream
- Running Median
- Kth Largest Element

---

## Day Summary

Today's problems introduced heap-based streaming algorithms along with tree-to-linked-list conversion.

- Converted a binary tree into a doubly linked list using inorder traversal.
- Maintained the running median of a data stream using two balanced heaps.
- Efficiently tracked the kth largest element using a fixed-size min heap.

These problems strengthened my understanding of heaps, streaming algorithms, and inorder-based tree transformations.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 143
- Days Completed: 44/45