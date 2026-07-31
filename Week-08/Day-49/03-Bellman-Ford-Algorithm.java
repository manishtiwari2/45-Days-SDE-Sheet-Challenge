class Solution {
    static final int INF = 100000000;

    public int[] bellmanFord(int V, int[][] edges, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist, INF);

        dist[src] = 0;

        for (int i = 1; i <= V - 1; i++) {
            boolean updated = false;

            for (int[] edge : edges) {

                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if (dist[u] != INF && dist[u] + w < dist[v]) {

                    dist[v] = dist[u] + w;
                    updated = true;
                }
            }
            if (!updated)
                break;
        }
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (dist[u] != INF && dist[u] + w < dist[v]) {

                return new int[]{-1};
            }
        }
        return dist;
    }
}