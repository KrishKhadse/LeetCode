class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left=0,right=0,maxLength=0;
        // int len;

        HashSet<Character> set = new HashSet<>();   //As we are storing single characters declare set type as character

        while(right < s.length())
        {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                // maxLength = right - left + 1;
                maxLength = Math.max(right-left+1 , maxLength);
                right++;
            }
            else
            {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}