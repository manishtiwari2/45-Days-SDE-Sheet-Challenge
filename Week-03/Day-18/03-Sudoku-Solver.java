class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][] board){
        for(int row=0; row<9; row++){
            for(int col=0;col<9;col++){
                if(board[row][col] == '.'){
                    for(char c='1'; c<='9';c++){
                        if(valid(board,row,col,c)){
                            board[row][col]=c;
                            if(solve(board)){
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean valid(char[][] board, int row, int col, int c){
        for(int i=0; i<9; i++){
            if(board[row][i] == c){
                return false;
            }
            if(board[i][col] == c){
                return false;
            }
            int r = 3*(row/3)+i/3;
            int cc = 3*(col/3)+i%3;

            if(board[r][cc] == c){
                return false;
            }
        }
        return true;
    }
}