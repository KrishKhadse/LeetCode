class Solution {
    public int strStr(String haystack, String needle) {
        
        int i=0;

        while(i < haystack.length())
        {
            int k=i,j=0;
            
            while(true)
            {
                if(j == needle.length())
                    return i;
            
                if(k ==  haystack.length())
                    return -1;

                if(haystack.charAt(k) == needle.charAt(j))  
                {
                    k++;
                    j++;
                }
                else
                {
                    break;
                }
            }
            i++;
        }
        return -1;
    }
}