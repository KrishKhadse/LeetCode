class Solution {
    public int firstStableIndex(int[] nums, int k) 
    {
        for(int i=0; i<nums.length; i++)
        {
            int max = maxFrom(nums,0,i);
            int min = minFrom(nums,i,nums.length-1);

            int insScore = max - min;

            if(insScore <= k)
            {
                return i;
            }

        }

        return -1;
    }

    static int maxFrom(int[] arr, int start, int end)
    {
        int maxNum=0;
        for(int i=start; i<=end; i++)
        {
            maxNum = Math.max(arr[i],maxNum);
        }

        return maxNum;
    }

    static int minFrom(int[] arr, int start, int end)
    {
        int minNum=arr[start];
        for(int i=start; i<=end; i++)
        {
            minNum = Math.min(arr[i],minNum);
        }

        return minNum;
    }
}