# Day 50

📅 Date: 20 July 2026

## Problems Solved

### 1. Floyd-Warshall Algorithm

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Implemented the Floyd-Warshall algorithm for All-Pairs Shortest Paths.

- Considered every vertex as an intermediate node.
- Updated the shortest distance between every pair of vertices.
- Skipped updates whenever no valid path existed.
- Computed the shortest distance between all vertex pairs.

### Complexity

- Time Complexity: O(V³)
- Space Complexity: O(1) *(excluding the input matrix)*

### Key Learning

Floyd-Warshall is a dynamic programming algorithm that computes shortest paths between every pair of vertices and naturally supports negative edge weights (without negative cycles).

---

### 2. Prim's Algorithm

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Constructed the Minimum Spanning Tree using a Priority Queue.

- Built an adjacency list for the weighted graph.
- Started from an arbitrary node.
- Always selected the minimum-weight edge leading to an unvisited vertex.
- Continued until all vertices became part of the MST.

### Complexity

- Time Complexity: O((V + E) log V)
- Space Complexity: O(V + E)

### Key Learning

Prim's Algorithm greedily expands the MST one vertex at a time using the lightest available edge.

---

### 3. Kruskal's Algorithm

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Built the Minimum Spanning Tree using Disjoint Set Union (DSU).

- Sorted all edges by weight.
- Processed edges in increasing order.
- Added an edge only if it connected two different components.
- Used Union-Find with Path Compression and Union by Rank to efficiently detect cycles.

### Complexity

- Time Complexity: O(E log E)
- Space Complexity: O(V)

### Key Learning

Kruskal's Algorithm builds the MST by repeatedly selecting the smallest valid edge while efficiently avoiding cycles using DSU.

---

## Concepts Practiced

- Graphs
- Dynamic Programming
- Floyd-Warshall Algorithm
- All-Pairs Shortest Path
- Minimum Spanning Tree (MST)
- Prim's Algorithm
- Kruskal's Algorithm
- Disjoint Set Union (DSU)
- Union by Rank
- Path Compression
- Priority Queue
- Greedy Algorithms

---

## Day Summary

Today's problems focused on advanced graph optimization algorithms.

- Computed shortest paths between every pair of vertices using Floyd-Warshall.
- Constructed a Minimum Spanning Tree using Prim's greedy approach.
- Built an MST using Kruskal's Algorithm with Disjoint Set Union.

These problems strengthened my understanding of graph optimization techniques, dynamic programming on graphs, greedy algorithms, and Union-Find data structures.

---

## Statistics

- Problems Solved Today: 3
- Total Problems Solved So Far: 164
- Days Completed: 50