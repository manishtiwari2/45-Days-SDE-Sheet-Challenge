# Day 26

📅 Date: 26 June 2026

## Problems Solved

### 1. Merge K Sorted Arrays

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Merged K sorted arrays efficiently using a Min Heap.

- Inserted the first element of every array into the Min Heap.
- Extracted the smallest element and added it to the result.
- Inserted the next element from the same array into the heap.
- Continued until the heap became empty.

### Complexity

- Time Complexity: O(N × M × log K)
- Space Complexity: O(K)

### Key Learning

The Min Heap efficiently keeps track of the smallest available element across multiple sorted arrays.

---

### 2. Find Median from Data Stream

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Maintained two heaps:

- Max Heap stores the smaller half of elements.
- Min Heap stores the larger half.

Balanced both heaps after every insertion.

- If total elements are odd, the median is the top of the Max Heap.
- Otherwise, the median is the average of the two heap tops.

### Complexity

- Add Number: O(log N)
- Find Median: O(1)
- Space Complexity: O(N)

### Key Learning

Using two heaps allows efficient online median computation while maintaining balanced partitions.

---

### 3. Top K Frequent Elements

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

- Counted frequencies using a HashMap.
- Maintained a Min Heap of size K storing (element, frequency).
- Removed the least important element whenever the heap exceeded size K.
- Extracted the remaining elements to obtain the top K frequent values.

### Complexity

- Time Complexity: O(N log K)
- Space Complexity: O(N)

### Key Learning

Combining HashMaps with Priority Queues provides an efficient solution for Top-K frequency problems.

---

## Concepts Practiced

✔ Min Heap

✔ Max Heap

✔ Priority Queue

✔ Merge K Sorted Arrays

✔ Median from Data Stream

✔ Top K Elements

✔ Frequency Counting

✔ HashMap

✔ Heap Optimization

---

## Day Summary

Today's focus was on advanced Heap applications.

Solved three classic interview problems involving Priority Queues:

- Efficiently merging multiple sorted arrays.
- Maintaining the median of a continuously growing data stream.
- Finding the Top K frequent elements using a Min Heap.

These problems strengthened my understanding of heap-based optimization techniques commonly used in coding interviews.

---

## Statistics

Problems Solved Today: 3

Total Problems Solved So Far: 84

Days Completed: 26/45