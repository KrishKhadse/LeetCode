class Solution {
    public boolean exist(char[][] board, String word) 
    {
        //Checking from each cell of the board
        for(int i=0 ; i<board.length ; i++)
        {
            for(int j=0 ; j< board[0].length; j++)
            {
                if(helper(board , word , i , j , 0))
                    return true;
            }
        }

        return false;
    }

    public static boolean helper(char[][] board , String word, int row , int col , int index)
    {
        if(index == word.length())
            return true;


        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col]!=word.charAt(index))
        {
            return false;
        }
        

        char temp = board[row][col];
        board[row][col] = '#';

        boolean res = helper(board , word, row+1 ,col,index + 1) /*down*/ || 
                        helper(board , word, row ,col+1,index + 1)  /*right*/|| 
                        helper(board , word, row-1 ,col,index + 1)   /*up*/ || 
                        helper(board , word, row ,col-1,index + 1);  /*left*/
        
        board[row][col] = temp; //Backtracking, restoring cell value;

        return res;
    }
}