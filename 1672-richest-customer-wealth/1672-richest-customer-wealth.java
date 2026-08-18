class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int currSum=0;
        for(int i = 0 ; i< accounts.length; i++)
        {
            int sum =0;
            for(int j=0; j< accounts[0].length; j++)    //To get column length use [0]
            {
                sum = sum + accounts[i][j];
            }
            currSum = Math.max(currSum, sum);
        }

        return currSum;
    }
}