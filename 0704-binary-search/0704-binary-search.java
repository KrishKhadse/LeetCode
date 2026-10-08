class Solution {
    // public int search(int[] nums, int target) {
        
    //     int start = 0, end= nums.length-1;

    //     while(start<=end)
    //     {
    //         int mid = start + (end - start) /2;

    //         if(nums[mid] == target)
    //             return mid;

    //         else if(nums[mid] > target)
    //             end = mid -1;

    //         else
    //             start = mid + 1;
            
    //     }
    //     return -1;
    // }

    public int search(int[] nums,int target)
    {
        return helper(nums,0,nums.length-1,target);
    }
    public int helper(int[] nums,int start, int end, int target)
    {
        // int start = 0;
        // int end = nums.length - 1;

        if(start > end )
            return -1;
            
        int mid = start + (end - start) / 2;

        if(nums[mid] == target)
            return mid;

        if(nums[mid] < target)
            return helper(nums , mid + 1 , end ,target);

        return helper(nums,start,mid-1, target);

    }
}