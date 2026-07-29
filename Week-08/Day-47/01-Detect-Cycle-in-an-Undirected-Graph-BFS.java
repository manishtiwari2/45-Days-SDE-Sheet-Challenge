class Solution {
    public boolean isCycle(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visited = new boolean[V];
        for(int i=0; i<V; i++) {
            if(!visited[i] && isCycleBFS(adj, i, visited, -1)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCycleBFS(ArrayList<ArrayList<Integer>> adj,
                               int node, boolean[] visited, int parent){
        
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{node, parent});
        visited[node] = true;

        while(!queue.isEmpty()){
            int[] pair = queue.poll();
            int curr = pair[0];
            int currP = pair[1];

            for(int v : adj.get(curr)){ 
                
                if(v == currP) continue; 
                if(visited[v]) return true;
                visited[v] = true; 
                queue.offer(new int[]{v, curr}); 
            }
        }
        return false;
    }
}