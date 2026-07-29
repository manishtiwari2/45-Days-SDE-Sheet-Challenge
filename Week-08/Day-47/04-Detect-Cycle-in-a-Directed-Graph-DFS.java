class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
        }
        
        boolean[] visited = new boolean[V];
        boolean[] inRecursion = new boolean[V];
        
        for(int node = 0; node < V; node++){
            if(!visited[node] && isCycleDFS(adj, node,visited, inRecursion)){
                return true;
            }
        }
        return false;
        
    }
    private boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int node, boolean[] visited, boolean[] inRecursion){
        visited[node] = true;
        inRecursion[node] = true;
        
        for(int v : adj.get(node)){
            if(visited[v] == false && isCycleDFS(adj, v,visited, inRecursion)){
                return true;
            } else if(inRecursion[v] == true){
                return true;
            }
        }
        inRecursion[node] = false;
        return false;
        
    }
}