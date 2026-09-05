class Solution {
    public int firstStableIndex(int[] nums, int k) 
    {
        int n = nums.length,max=0;
        int[] right = new int[nums.length];

        right[n-1] = nums[n-1]; //Minimum of last element is the element itself

        for(int i=n-2; i>=0; i--)   //Finding the minumum for each element
        {
            right[i] = Math.min(right[i+1], nums[i]);   //Initially comparing Last element of right with last 2nd element of nums (1 and 4 as per 1st test case)
        }


        for(int i=0; i<nums.length; i++)
        {
            max = Math.max(nums[i],max);     //Finding maximun for each element and at the same time checking it with k 

            if(max-right[i] <= k)
            {
                return i;
            }

        }

        return -1;
    }

    
}