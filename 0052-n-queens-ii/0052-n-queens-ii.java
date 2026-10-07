class Solution 
{
    public int totalNQueens(int n) 
    {
        boolean[][] board = new boolean[n][n];
        int res = queens(board , 0);

        return res;
    }


    static int queens(boolean[][] board, int row)
    {
        if(row == board.length)
        {
            return 1;
        }

        int count = 0;

        for(int col=0 ; col<board.length ; col++)
        {
            if(isSafe(board, row, col))
            {
                board[row][col] = true; //Place the queen if it is safe at current cell
                count += queens(board, row+1);
                board[row][col] = false;    //If no queen can be placed in current row , then return back to previous queen and change its position and while returning restore the cell value
            }
            
        }

        return count;
    }



    //Checking All the conditions if the Queen can be placed
    private static boolean isSafe(boolean[][] board, int row , int col)
    {
        //Check vertically upside
        for(int i=0 ; i<row; i++)
        {
            if(board[i][col])   //If any of above vertical cell has queen then return false
            {
                return false;
            }
        }

        //Check diagonally Left
        int maxLeft = Math.min(row,col);   //Minimum No of checks to do diagonally left

        for(int i=1 ; i<=maxLeft; i++)
        {
            if(board[row-i][col-i])   //If any of above left diagonal cell has queen then return false
            {
                return false;
            }
        }

        //Check diagonally Right
        int maxRight = Math.min(row,board.length-col-1);   //Maximum No of checks to do diagonally left

        for(int i = 1 ; i<=maxRight; i++)
        {
            if(board[row-i][col+i])   //If any of above right diagonal cell has queen then return false
            {
                return false;
            }
        }

        return true;
    }

}