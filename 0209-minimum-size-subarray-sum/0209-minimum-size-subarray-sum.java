class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int left=0,right=0,minLength=nums.length+1,sum=0;

        while(right < nums.length)
        {
            sum = sum + nums[right];

            if(sum >= target)
            {

                while(sum >= target)
                {
                    minLength = Math.min(right - left + 1 , minLength); //find minumum length
                    sum = sum - nums[left];
                    left++;
                }

            }

            right++;
        }

        if(minLength == nums.length + 1)    //if length does not change which menas that no subarray found
            return 0;

        return minLength;
    }
}