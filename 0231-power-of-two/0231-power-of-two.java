class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        if(n <= 0) 
            return false;
        return (n & (n-1)) == 0;    //The number that is power of has has only one bit as 1 other are 0
        //AND the number with its previous number and if 0 then it is power of 2
        
    }
}