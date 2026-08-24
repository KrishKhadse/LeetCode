class Solution 
{
    int[] prefix;
    public int pivotIndex(int[] nums) 
    {

        prefix = new int[nums.length];

        int sum = 0, leftSum=0;

        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
            prefix[i] = sum;
        }

        int rightSum=prefix[prefix.length-1];

        int j=0;
        while(j<prefix.length)
        {
            if(rightSum - prefix[j] == leftSum) //It naturally handles if index is on the right edge of the array
            {
                return j;
            }

            leftSum = prefix[j];
            j++;
        }
        return -1;
    }
}