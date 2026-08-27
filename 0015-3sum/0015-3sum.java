class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List <List<Integer>> list = new ArrayList();

        Arrays.sort(nums);

        int left = 0 , right = nums.length-1, sum=0;
        for(int i = 0; i<nums.length; i++)
        { 
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            left=i+1;
            right=nums.length-1;

            while(left < right)
            {
                sum = nums[i] + nums[left] + nums[right];

                if(sum < 0 )
                    left++;

                else if(sum > 0)
                    right--;

                else
                {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    //Skip left duplicates
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                }
            }    

        }

        return list;
    }

}