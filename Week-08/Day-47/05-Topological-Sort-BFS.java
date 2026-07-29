class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        int[] indegree = new int[V];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
        }
        
        for(int u = 0; u < V; u++){
            for(int v : adj.get(u)){
                indegree[v]++;
            }
        }
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int u = queue.poll();
            result.add(u);
            
            for(int v : adj.get(u)){
                indegree[v]--;
                
                if(indegree[v] == 0){
                    queue.offer(v);
                }
            }
        }
        return result;
        
        
    }
}