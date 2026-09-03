class Solution {
    public int lengthOfLastWord(String s) 
    {

        int right=s.length()-1,count = 0;

        while(s.charAt(right) == ' ')
        {
            right--;
        }

        while(right >=0 && s.charAt(right) != ' ')
        {
            count++;
            right--;
        }

        return count;
    }
}