class Pair {
    int node;
    int dist;
    
    Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        } 
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.dist - b.dist);
        
        pq.offer(new Pair(src, 0));
        
        while(!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            int d = curr.dist;
            
            if(d > dist[node]) {
                continue;
            }
            for(Pair nei : adj.get(node)) {
                int adjNode = nei.node;
                int wt = nei.dist;
                
                if(dist[node] + wt < dist[adjNode]) {
                    dist[adjNode] = dist[node] + wt;
                    pq.offer(new Pair(adjNode, dist[adjNode]));
                }
            }
        }
        return dist;
    }
}
