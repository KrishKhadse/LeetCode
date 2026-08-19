class Solution {
    public void rotate(int[] nums, int k) 
    {
        //rotating an array by its length brings it back to the original array.Ins uch case k becomes 0
        k = k % nums.length;
                    
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }

    static void rev(int[] arr, int st, int end)
    {
        while(st<=end)
        {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}