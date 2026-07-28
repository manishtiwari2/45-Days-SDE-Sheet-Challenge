class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        
        for(int i = 0; i < adj.size(); i++){
            graph.put(i, new ArrayList<>(adj.get(i)));
            
        }
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];
        
        DFS(graph, 0, visited, result);
        return result;
        
    }
    void DFS(Map<Integer, ArrayList<Integer>> adj, int node, boolean[] visited, ArrayList<Integer> result){
        if(visited[node] == true){
            return;
        }
        result.add(node);
        visited[node] = true;
        for(int v : adj.get(node)){
            if(!visited[v]){
                DFS(adj, v, visited, result);
            }
        }
    }
}