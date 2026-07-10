class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        List<Integer>[] graph = new ArrayList[v];
        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            int u = edge[0];
            int w = edge[1];
            graph[u].add(w);
            graph[w].add(u);
        }
        int[] colors = new int[v];
        
        return solve(0,m,colors,graph);
    }
    private boolean isSafe(int node, int color, int[] colors, List<Integer>[] graph){
        for(int v : graph[node]){
            if(colors[v] == color){
                return false;
            }
        }
        return true;
    }
    private boolean solve(int node, int m, int[] colors, List<Integer>[] graph){
        if(node == graph.length){
            return true;
        }
        for(int color=1; color <= m; color++){
            if(isSafe(node,color,colors,graph)){
                colors[node] = color;
                if(solve(node+1,m,colors,graph)){
                    return true;
                }
                colors[node] = 0;
            }
        }
        return false;
    }
}
