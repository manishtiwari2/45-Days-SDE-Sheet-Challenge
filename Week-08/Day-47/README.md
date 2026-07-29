# Day 47

📅 Date: 17 July 2026

## Problems Solved

### 1. Detect Cycle in an Undirected Graph (BFS)

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used Breadth-First Search with parent tracking.

- Built the adjacency list.
- Performed BFS from every unvisited node.
- Stored both the current node and its parent in the queue.
- If a visited neighbor was not the parent, a cycle existed.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

### Key Learning

In an undirected graph, parent tracking is necessary to distinguish a valid back edge from the edge used to reach the current node.

---

### 2. Detect Cycle in an Undirected Graph (DFS)

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used recursive DFS.

- Visited every connected component.
- Passed the parent node during recursion.
- Ignored the parent edge.
- Returned true whenever a visited neighbor other than the parent was encountered.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

### Key Learning

DFS with parent tracking provides an elegant recursive solution for cycle detection in undirected graphs.

---

### 3. Detect Cycle in a Directed Graph (Kahn's Algorithm)

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Applied Kahn's Algorithm (BFS Topological Sort).

- Computed the indegree of every vertex.
- Added all zero-indegree nodes to the queue.
- Removed nodes while updating indegrees.
- If the processed node count was less than the total vertices, a cycle existed.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

### Key Learning

A directed graph contains a cycle if a complete topological ordering cannot be produced.

---

### 4. Detect Cycle in a Directed Graph (DFS)

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used DFS with a recursion stack.

- Maintained two arrays:
  - `visited`
  - `inRecursion`
- Marked nodes while entering recursion.
- If a node already existed in the recursion stack, a cycle was found.
- Removed nodes from the recursion stack while backtracking.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

### Key Learning

The recursion stack efficiently detects back edges, which uniquely identify cycles in directed graphs.

---

### 5. Topological Sort (BFS)

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Implemented Kahn's Algorithm.

- Built the adjacency list.
- Computed indegrees.
- Started BFS from all zero-indegree vertices.
- Processed vertices while updating indegrees.
- Generated a valid topological ordering.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

### Key Learning

Topological sorting is only possible for Directed Acyclic Graphs (DAGs) and forms the basis of many dependency-resolution problems.

---

## Concepts Practiced

- Graphs
- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Cycle Detection
- Undirected Graphs
- Directed Graphs
- Kahn's Algorithm
- Topological Sort
- Recursion
- Indegree

---

## Day Summary

Today's problems focused on graph traversal, cycle detection, and topological sorting.

- Detected cycles in undirected graphs using both BFS and DFS.
- Detected cycles in directed graphs using DFS recursion stack and Kahn's Algorithm.
- Implemented Topological Sort using BFS and indegree counting.

These problems strengthened my understanding of graph traversal techniques, dependency resolution, and fundamental graph algorithms frequently asked in coding interviews.

---

## Statistics

- Problems Solved Today: 5
- Total Problems Solved So Far: 154
- Days Completed: 47