class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
        }
        
        int[] in = new int[V];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        for(int u = 0; u < V; u++){
            for(int v : adj.get(u)){
                in[v]++;
            }
        }
    
        for(int i = 0; i < V; i++){
            if(in[i] == 0){
                queue.offer(i);
            }
        }
        
        int count = 0;
        while(!queue.isEmpty()){
            int u = queue.poll();
            count++;
            
            for(int v : adj.get(u)){
                in[v]--;
                if(in[v] == 0){
                    queue.offer(v);
                }
            }
        }
        if(count == V){
            return false;
        } else {
            return true;
        }
    }
}