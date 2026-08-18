class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice=prices[0], maxProfit=0;

        //find the index of minimum element
        for(int i=0; i<prices.length; i++)
        {
            if( prices[i] < minPrice)
                minPrice = prices[i];

            //if current price i is not small than the min price we have (means bigger than min price), then find the profit between min and curr everytime we got the price bigger than min price

            else if(prices[i] - minPrice  > maxProfit)
            {
                maxProfit = prices[i] - minPrice ;
            }
        }
        return maxProfit;
        
    }
}