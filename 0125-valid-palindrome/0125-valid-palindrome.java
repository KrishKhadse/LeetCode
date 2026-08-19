class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();

        int left=0, right=s.length()-1;

        while(left <= right)
        {
            while(left < s.length() && !Character.isLetterOrDigit(s.charAt(left)))
                left++;

            while(right >= 0 && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            
            if(left > right)
                return true;

            if(s.charAt(left) != s.charAt(right))
                return false;
            
            left++;
            right--;
            
        }
        return true;
    }
}