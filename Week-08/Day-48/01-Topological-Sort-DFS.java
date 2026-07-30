class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
        }
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean[] visited = new boolean[V];
        
        for(int i = 0; i<V;i++){
            if(!visited[i]){
                DFS(adj,i,visited,stack);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        
        return res;
    }
    private void DFS(ArrayList<ArrayList<Integer>> adj,int node, boolean[] visited, ArrayDeque<Integer> stack){
        visited[node] = true;
        
        for(int v :adj.get(node)){
            if(!visited[v]){
                DFS(adj,v,visited,stack);
            }
        }
        stack.push(node);
    }
}