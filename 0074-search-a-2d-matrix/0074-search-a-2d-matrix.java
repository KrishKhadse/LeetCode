class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int start = 0 , end = (matrix.length * matrix[0].length) -1;

        //To get columns length we can must take a single 
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            int row = mid /  matrix[0].length;  //  mid / n . where n is total no of columns
            int col = mid %  matrix[0].length;

            if(matrix[row][col] == target)
                return true;

            else if(target < matrix[row][col])
            {
               end = mid -1;
            }
            else    //if(target < matrix[row][col])
            {
                start = mid+1;
            }

        }
        return false;
    }
}