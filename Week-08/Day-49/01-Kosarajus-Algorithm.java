class Solution {
    // Function to find number of strongly connected components in the graph
    public int kosaraju(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
        ArrayDeque<Integer> st = new ArrayDeque<>();
        boolean[] visited = new boolean[V];
        
        for(int i=0; i<V; i++) {
            if(!visited[i]) {
                dfs1(i, adj, visited, st);
            }
        }
        ArrayList<ArrayList<Integer>> tp = new ArrayList<>();
        for(int i=0; i<V; i++){
            tp.add(new ArrayList<>());
        }
        for(int[] edge : edges) {
            tp.get(edge[1]).add(edge[0]);
        }
        Arrays.fill(visited, false);
        int scc = 0;
        
        while(!st.isEmpty()) {
            int node = st.pop();
            
            if(!visited[node]) {
                scc++;
                dfs2(node, tp, visited);
            }
        }
        return scc;
    }

    private void dfs1(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayDeque<Integer> st) {
        visited[node] = true;
        for(int nei : adj.get(node)) {
            if(!visited[nei]) {
                dfs1(nei, adj, visited, st);
            }
        }
        st.push(node);
    }
    private void dfs2(int node, ArrayList<ArrayList<Integer>> tp, boolean[] visited) {
        visited[node] = true;
        for(int nei : tp.get(node)) {
            if(!visited[nei]) {
                dfs2(nei, tp, visited);
            }
        }
    }
}