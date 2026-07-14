# Day 25

📅 Date: 25 June 2026

## Problems Solved

### 1. LRU Cache

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Implemented an LRU (Least Recently Used) Cache using:

- HashMap for O(1) key lookup.
- Doubly Linked List for O(1) insertion and deletion.

Whenever a key is accessed, it is moved to the front of the list. If the cache reaches its capacity, the least recently used element (tail) is removed.

### Complexity

- Get: O(1)
- Put: O(1)
- Space Complexity: O(Capacity)

### Key Learning

Combining a HashMap with a Doubly Linked List enables constant-time cache operations.

---

### 2. LFU Cache

**Platform:** LeetCode

**Difficulty:** Hard

### Approach

Implemented an LFU (Least Frequently Used) Cache using:

- HashMap to store key → node mapping.
- Frequency Map to group nodes by access frequency.
- Doubly Linked Lists for maintaining LRU order within the same frequency.

Whenever a node is accessed:

- Remove it from its current frequency list.
- Increase its frequency.
- Insert it into the next frequency list.

When capacity is full:

- Remove the Least Frequently Used node.
- If multiple nodes share the same frequency, remove the Least Recently Used among them.

### Complexity

- Get: O(1)
- Put: O(1)
- Space Complexity: O(Capacity)

### Key Learning

LFU Cache combines multiple data structures to efficiently maintain both frequency and recency information.

---

### 3. Next Smaller Element

**Platform:** GeeksforGeeks

**Difficulty:** Easy

### Approach

Solved using a Monotonic Increasing Stack.

- Traverse the array from right to left.
- Remove all elements greater than or equal to the current element.
- The top of the stack becomes the next smaller element.
- Push the current element onto the stack.

### Complexity

- Time Complexity: O(N)
- Space Complexity: O(N)

### Key Learning

Monotonic stacks efficiently solve nearest smaller and greater element problems in linear time.

---

## Concepts Practiced

✔ LRU Cache

✔ LFU Cache

✔ Doubly Linked List

✔ HashMap

✔ Frequency Map

✔ Monotonic Stack

✔ Next Smaller Element

✔ O(1) Cache Design

---

## Day Summary

Today's session focused on advanced data structure design and stack applications.

Implemented two widely asked system design interview problems—LRU Cache and LFU Cache—using combinations of HashMaps and Doubly Linked Lists to achieve O(1) operations.

Also solved the Next Smaller Element problem using a Monotonic Stack, reinforcing efficient nearest-element techniques.

---

## Statistics

Problems Solved Today: 3

Total Problems Solved So Far: 81

Days Completed: 25/45