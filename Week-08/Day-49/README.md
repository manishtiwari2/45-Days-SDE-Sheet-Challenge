# Day 49

📅 Date: 19 July 2026

## Problems Solved

### 1. Kosaraju's Algorithm

**Platform:** GeeksforGeeks

**Difficulty:** Hard

### Approach

Implemented Kosaraju's Algorithm to find the number of Strongly Connected Components (SCCs).

- Performed DFS on the original graph to store vertices according to their finishing times.
- Constructed the transpose (reversed) graph.
- Processed vertices in reverse finishing order using DFS on the transpose graph.
- Counted each DFS traversal as one Strongly Connected Component.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V + E)

### Key Learning

Kosaraju's Algorithm uses two DFS traversals and graph transposition to efficiently identify strongly connected components in directed graphs.

---

### 2. Dijkstra's Algorithm

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used a Priority Queue (Min Heap) to compute shortest paths.

- Built an adjacency list with weighted edges.
- Initialized all distances to infinity except the source.
- Processed the closest unvisited node using a min heap.
- Relaxed adjacent edges whenever a shorter path was found.

### Complexity

- Time Complexity: O((V + E) log V)
- Space Complexity: O(V + E)

### Key Learning

Dijkstra's Algorithm efficiently computes shortest paths in graphs with non-negative edge weights.

---

### 3. Bellman-Ford Algorithm

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Applied edge relaxation repeatedly.

- Initialized distances from the source.
- Relaxed all edges exactly V−1 times.
- Performed one additional iteration to detect negative weight cycles.
- Returned `{-1}` if a negative cycle was detected.

### Complexity

- Time Complexity: O(V × E)
- Space Complexity: O(V)

### Key Learning

Bellman-Ford handles graphs containing negative edge weights and can detect negative weight cycles.

---

## Concepts Practiced

- Graphs
- Strongly Connected Components (SCC)
- Kosaraju's Algorithm
- Graph Transposition
- Depth-First Search (DFS)
- Dijkstra's Algorithm
- Bellman-Ford Algorithm
- Shortest Path
- Priority Queue
- Edge Relaxation

---

## Day Summary

Today's problems focused on advanced graph algorithms.

- Implemented Kosaraju's Algorithm to identify Strongly Connected Components.
- Solved the Single Source Shortest Path problem using Dijkstra's Algorithm.
- Applied Bellman-Ford Algorithm to handle graphs with negative edge weights and detect negative cycles.

These problems strengthened my understanding of graph connectivity and shortest path algorithms commonly asked in coding interviews.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 161
- Days Completed: 49