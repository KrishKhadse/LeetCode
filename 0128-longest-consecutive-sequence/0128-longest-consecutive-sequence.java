class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }

        int maxSeq=0,start,seq;

        //Iterating through the set rather than the array to reduce the time complexity
        for(int num: set)
        {
            if(!set.contains(num - 1))
            {
                start = num;
                seq=1;
            }
            else
                continue;
                

            //increase the sequence counter until next number is present in the set
            while(set.contains(start+1))
            {
                seq++;
                start = start+1;
            }

            maxSeq = Math.max(maxSeq,seq);
        }   
        return maxSeq;  
        
    }
}