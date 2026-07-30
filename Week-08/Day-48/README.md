# Day 48

📅 Date: 18 July 2026

## Problems Solved

### 1. Topological Sort (DFS)

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Implemented Topological Sort using Depth-First Search.

- Built the adjacency list.
- Performed DFS from every unvisited node.
- Pushed each node onto a stack after visiting all its neighbors.
- Popped the stack to obtain the topological ordering.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

### Key Learning

In DFS-based Topological Sort, nodes are added to the ordering only after all their dependencies have been processed.

---

### 2. Number of Islands

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used Depth-First Search on the grid.

- Traversed every cell of the matrix.
- Started DFS whenever an unvisited land cell (`'L'`) was found.
- Explored all 8 possible directions.
- Marked visited land as water to avoid revisiting.

### Complexity

- Time Complexity: O(R × C)
- Space Complexity: O(R × C)

Where:
- **R** = Number of rows
- **C** = Number of columns

### Key Learning

Grid problems can be modeled as graph traversal problems, where each cell acts as a graph node.

---

### 3. Bipartite Graph (BFS)

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used Breadth-First Search with graph coloring.

- Initialized all vertices with an unassigned color.
- Assigned alternate colors while traversing level by level.
- If two adjacent vertices received the same color, the graph was not bipartite.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

### Key Learning

A graph is bipartite if it can be colored using two colors such that no adjacent vertices share the same color.

---

### 4. Bipartite Graph (DFS)

**Platform:** GeeksforGeeks

**Difficulty:** Medium

### Approach

Used recursive DFS with graph coloring.

- Assigned alternating colors recursively.
- Visited every connected component.
- Returned false whenever adjacent vertices had identical colors.

### Complexity

- Time Complexity: O(V + E)
- Space Complexity: O(V)

### Key Learning

Both DFS and BFS can efficiently determine whether a graph is bipartite using two-coloring.

---

## Concepts Practiced

- Graphs
- Depth-First Search (DFS)
- Breadth-First Search (BFS)
- Topological Sort
- Graph Coloring
- Bipartite Graph
- Matrix Traversal
- Connected Components

---

## Day Summary

Today's problems focused on graph traversal, graph coloring, and dependency ordering.

- Implemented Topological Sort using DFS and a stack.
- Solved the Number of Islands problem using DFS on a 2D grid.
- Determined whether a graph is bipartite using both BFS and DFS coloring techniques.

These problems strengthened my understanding of graph traversal patterns, connected components, graph coloring, and topological ordering.

---

## Statistics

- Problems Solved Today: 4
- Total Problems Solved So Far: 158
- Days Completed: 48