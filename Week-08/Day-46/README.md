# Day 46

📅 Date: 16 July 2026

## Problems Solved

### 1. Clone Graph

**Platform:** LeetCode

**Difficulty:** Medium

### Approach

Cloned the graph using Breadth-First Search (BFS).

- Started BFS from the given node.
- Maintained a HashMap to map each original node to its cloned counterpart.
- Created new nodes when encountered for the first time.
- Connected cloned neighbors while traversing the graph.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

Where:
- V = Number of vertices
- E = Number of edges

### Key Learning

Using a HashMap prevents duplicate node creation and correctly preserves graph connections during cloning.

---

### 2. DFS of Graph

**Platform:** GeeksforGeeks

**Difficulty:** Easy

### Approach

Performed recursive Depth-First Search.

- Started DFS from the source vertex.
- Marked nodes as visited.
- Visited every unvisited neighbor recursively.
- Stored the traversal order.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

### Key Learning

DFS explores each path as deeply as possible before backtracking, making it useful for traversal and connectivity problems.

---

### 3. BFS of Graph

**Platform:** GeeksforGeeks

**Difficulty:** Easy

### Approach

Performed Breadth-First Search using a queue.

- Started from the source node.
- Used a queue to process vertices level by level.
- Marked nodes as visited before enqueueing.
- Visited all reachable vertices.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

### Key Learning

BFS guarantees level-order traversal in unweighted graphs and serves as the foundation for many shortest-path algorithms.

---

## Concepts Practiced

- Graphs
- Graph Traversal
- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Graph Cloning
- HashMap
- Queue
- Recursion

---

## Day Summary

Today's problems introduced the fundamentals of graph traversal and graph cloning.

- Cloned an undirected graph using BFS and a HashMap.
- Implemented recursive DFS traversal.
- Implemented iterative BFS traversal using a queue.

These problems strengthened my understanding of graph representations, traversal techniques, and graph-copying algorithms.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 149
- Days Completed: 46