class Solution 
{
    public void solveSudoku(char[][] board) 
    {
        mainSolverCode(board);
    }

    static boolean mainSolverCode(char[][] board) 
    {
        int row=-1;
        int col=-1;
        boolean emptyFound = false;

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j] == '.')
                {
                    row = i;
                    col = j;
                    emptyFound = true;
                    break;
                }
            }
            if(emptyFound)  //Exiting last loop also
                break;
        }

        //Base Case
        if(emptyFound == false)  //No empty cells left sudoko solved
            return true;

        
        //Placing numbers from 1-9
        for(int i=1; i<=9; i++)
        {
                char num = (char) ('0' + i);
                if(isSafe(board , row , col , num))
                {
                    board[row][col] = num;
                
                    //Place safe number and find another empty cell
                    if(mainSolverCode(board)) //Board is not empty sudoko solved return true
                    {
                        return true;
                    }   
                    board[row][col] = '.';  //Else backtrack and restore cell value 
                }
        }

        return false;
    }

    static boolean isSafe(char[][]board , int row , int col, char num)
    {

        //Checking the current column
        for(int i=0; i< board.length ; i++)
        {
            if(board[i][col] == num)
                return false;
        }

        //Checking the current row
        for(int j=0; j<board[0].length ; j++)
        {
            if(board[row][j] == num)
                return false;
        }


        //Checking the 3X3 box
        int squrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%squrt;
        int colStart = col - col%squrt;

        for(int i = rowStart ; i<rowStart+squrt ; i++)
        {
            for(int j = colStart ; j < colStart+squrt ; j++)
            {
                if(board[i][j] == num)
                {
                    return false;
                }
            }
        }
        return true;
    }
}