class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int minutes = 0;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(grid[row][col] == 1){
                    fresh++;
                }
                else if(grid[row][col] == 2){
                    queue.offer(new int[]{row,col});
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        
        int[][] dircs = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!queue.isEmpty() && fresh > 0){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] dir : dircs){
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if(nr >= 0 && nr < rows && nc >= 0 && nc < cols 
                        && grid[nr][nc] == 1){
                            grid[nr][nc] = 2;
                            queue.offer(new int[]{nr,nc});
                            fresh--;
                        }
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}