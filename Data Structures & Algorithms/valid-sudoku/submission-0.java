class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!rowCheck(i,j,board[i][j],board) || !colCheck(i,j,board[i][j],board) || !blockCheck(i,j,board[i][j],board)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean rowCheck(int i, int j, char n, char[][] board) {
        for (int k = 0; k < 9; k++) {
            if (i != k) {
                if (board[k][j] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean colCheck(int i, int j, char n, char[][] board) {
        for (int k = 0; k < 9; k++) {
            if (j != k) {
                if (board[i][k] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean blockCheck(int i, int j, char n,char[][] board){
        int row = (i/3)*3;
        int col = (j/3)*3;
        for(int k = row;k<row+3;k++){
            for(int l = col; l<col+3;l++){
                if(i != k && j != l){
                if(board[k][l]==n)
                return false;
                }
            }
        }
        return true;
    }

}