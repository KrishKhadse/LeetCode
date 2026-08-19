class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int index=0; index < nums.length; index++)
        {
            if(set.contains(nums[index]))
                return true;
            else
                set.add(nums[index]);
        }
        return false;
    }
}