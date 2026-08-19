class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] arr= new int[nums.length];

        int left=0, right=nums.length-1;
        int k=arr.length-1;

        while(left<=right)
        {
            if(Math.pow(nums[left],2) > Math.pow(nums[right],2))
            {
                arr[k]=nums[left]*nums[left];
                left++;
                k--;
            }
            else
            {
                arr[k]=nums[right]*nums[right];
                right--;
                k--;
            }
        }
        return arr;
    }
}