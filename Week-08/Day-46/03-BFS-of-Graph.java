class Solution {
    
    public List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        Deque<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[V];
        List<Integer> res = new ArrayList<>();

        queue.offer(0);
        visited[0] = true;
        

        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);

            for(int v : adj.get(node)){
                if(!visited[v]){
                    queue.offer(v);
                    visited[v] = true;
                }
            }
        }
        return res;
    }
}

