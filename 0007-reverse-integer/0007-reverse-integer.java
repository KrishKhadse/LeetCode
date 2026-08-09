class Solution {
    public int reverse(int x) {
        long rev=0; //use long for rev so that we can detect if the reversed number goes outside the int range.

        while(x!=0)
        {
            int rem = x%10;
            rev = rev * 10 + rem;
            x =x/10;
        }

        //int ranges can be written as Integer.MIN_VALUE and Integer.MAX_VALUE
        
        if(rev < Math.pow(-2,31) || rev > Math.pow(2,31)-1 )
            return 0;
         
        return (int)rev;
    }
}