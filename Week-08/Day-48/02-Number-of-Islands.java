class Solution {
    
    int[] dr = {-1,-1,-1,0,0,1,1,1};
    int[] dc = {-1,0,1,-1,1,-1,0,1};
    
    public int countIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int ans = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 'L') {
                    ans++;
                    DFS(grid, row, col);
                }
            }
        }

        return ans;
    }

    private void DFS(char[][] grid, int row, int col) {

        if (row < 0 || col < 0 ||
            row >= grid.length || col >= grid[0].length ||
            grid[row][col] == 'W') {
            return;
        }

        grid[row][col] = 'W';

        for (int i = 0; i < 8; i++) {
            DFS(grid, row + dr[i], col + dc[i]);
        }
    }
}