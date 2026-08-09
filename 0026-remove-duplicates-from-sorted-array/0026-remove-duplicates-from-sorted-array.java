class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0;
        int j=i+1;
        while(i<nums.length)
        {
            while(j<nums.length)
            {
                if(nums[i] != nums[j])
                {
                    i++;

                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j++;
                }
                else
                    j++;
            }
            break;
        }
        return i+1;
    }
}