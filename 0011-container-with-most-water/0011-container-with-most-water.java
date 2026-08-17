class Solution {
    public int maxArea(int[] height) 
    {
        //Two pointer approach
        //Shift small height line to get max width 
        
        int maxWater = 0;   //To store container with most value

        int leftP = 0;
        int rightP = height.length-1; //two Pointers

        while(leftP < rightP)
        {
            int width = rightP - leftP; //width of container from lesft bar to right bar
            int ht = Math.min(height[leftP], height[rightP]); //height of the container upto the small pole after that the water will overflow

            int currArea = width * ht; //Total water to be stored in current container

            maxWater = Math.max(maxWater , currArea); //Get the container with the most water.
            
            if(height[leftP] < height[rightP])
                leftP++;
            else
                 rightP-- ;   
            //Update the pointer with small value so as to get max water level.
        }

        return maxWater;
    }
}