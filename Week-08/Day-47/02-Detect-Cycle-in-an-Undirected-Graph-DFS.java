class Solution {
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visited = new boolean[V];
        
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                if(isCycleDFS(adj, i, visited, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int node, boolean[] visited, int parent){
        visited[node] = true;
        
        for(int v : adj.get(node)){
            if(v == parent){
                continue;
            }
            if(visited[v] == true){
                return true;
            }
            if(isCycleDFS(adj, v, visited, node)){
                return true;
            }
        }
        return false;
    }
}