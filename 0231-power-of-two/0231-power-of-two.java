class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        if(n == 1)
            return true;
            
        if( n <= 0 || n % 2 != 0)   //If n is power of 2 then it will also get divided by two
            return false;

        return isPowerOfTwo(n/2);   
        
    }
}