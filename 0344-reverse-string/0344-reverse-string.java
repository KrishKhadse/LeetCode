class Solution 
{
    //Normal Approach
    // public void reverseString(char[] s) {
        
    //     int left = 0, right=s.length-1;

    //     while(left < right)        
    //     {
    //         char temp = s[left];
    //         s[left] =   s[right];
    //         s[right] = temp ; 
    //         left++;
    //         right--;
    //     }
    // }


    //Recursion
    public void reverseString(char[] s) 
    {   
        helper(s , 0 , s.length - 1);
    }

    static char[] helper(char[] s , int left , int right)
    {
        if(left > right)
            return s;

        char temp = s[left];
        s[left] =   s[right];
        s[right] = temp ; 

        return helper(s , left + 1 , right - 1);
    }
}