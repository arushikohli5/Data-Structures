package Backtracking;

public class nQueens {
    final static int n=4;
    public static void main(String args[]) {
        SolveNQueens();
    }

    static void SolveNQueens(){
        int board[][]= {{0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}};
        
        if(SolveNQueensuntil(board,0)==false){
            System.out.println("No Solution");
            return;
        }

        printSolution(board);
        return;
    }

    static void printSolution(int[][] board){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static boolean SolveNQueensuntil(int[][] board,int col){
        if(col>=n){
            return true;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,i,col)){
                board[i][col]=1;
                if(SolveNQueensuntil(board, col+1)==true){
                    return true;
                }
                board[i][col]=0;
            }
        }

        return false;

    }

    static boolean isSafe(int[][] board,int row,int col){

        for(int i=0;i<col;i++){
            if(board[row][i]==1){
                return false;
            }
        }

        for(int i=row, j=col;j>=0&&i>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        for(int i=row,j=col;i<n&&j>=0;i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        return true;
    }
}
