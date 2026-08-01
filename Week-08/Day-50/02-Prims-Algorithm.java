class Pair {
    int node;
    int wt;
    Pair(int node, int wt) {
        this.node = node;
        this.wt = wt;
    }
    
}

class Solution {
    public int spanningTree(int V, int[][] edges) {
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.wt - b.wt);
        pq.offer(new Pair(0,0));
        
        int mstWt = 0;
        while(!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            int wt = curr.wt;
            
            if(visited[node]) {
                continue;
            }
            visited[node] = true;
            mstWt += wt;
            
            for(Pair nei : adj.get(node)) {
                if(!visited[nei.node]) {
                    pq.offer(new Pair(nei.node, nei.wt));
                }
            }
        }
        return mstWt;
    }
}
