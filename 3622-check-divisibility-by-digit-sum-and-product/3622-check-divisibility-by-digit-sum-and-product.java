class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum = 0, prod = 1;
        int cpy = n;

        while(n!=0)
        {
            int rem = n % 10;
            sum = sum + rem;
            prod = prod * rem;
            n = n / 10;
        }

        
        if(cpy % (sum + prod) == 0)
            return true;

        return false;
    }
}