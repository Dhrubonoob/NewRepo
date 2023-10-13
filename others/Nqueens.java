/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Nqueens{
    public static void main(String args[]){
        int n = 4;
        
        boolean[][] board = new boolean[n][n];
        nQueens(board, 0);
        
    }
    
    static int nQueens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int col = 0; col < board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = true; //this row queen is placed 
                count+=nQueens(board, row+1); //now see whether we can place the queen in the next row
                board[row][col] = false;  //coming out of the function call and changing back to the normal
            }
        }
        return count;
    }
    
    static boolean isSafe(boolean[][] board, int row, int col){
        //for the horizontal check
        for(int j=0; j<board.length;j++){
            if (board[row][j]){
                return false;
            } 
        }
        
        //for the vertical check
        for (int i=0;i<board.length;i++ ){
            if (board[i][col]){
                return false;
            } 
        } 
        
        //for the upper left diagonal
        int r = row;
        for(int c = col; c>=0 && r>=0;r--,c--){
            if(board[r][c]){
                return false;
            }
        }
        
        //for the upper right diagonal
        r = row;
        for(int c = col; c<board.length && r>=0;r--,c++){
            if(board[r][c]){
                return false;
            }
        }
        
        //for lower left diagonal
        r = row;
        for(int c = col; c>=0 && r<board.length; r++,c--){
            if(board[r][c]){
                return false;
            }
        }
        
        //for the lower right diagonal
        r = row;
        for(int c = col; c<board.length && r<board.length; r++,c++){
            if(board[r][c]){
                return false;
            }
        }
        return true;
    }
    
    static void display(boolean[][]board){
        for (boolean[] row : board ){
            for(boolean element : row){
                if(element){
                    System.out.print('Q');
                }else{
                    System.out.print('x');
                }
            }
            System.out.println();
        } 
    }
}