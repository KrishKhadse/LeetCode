class Solution {
    public int mySqrt(int n) {
        
        if (n == 0 || n == 1)
            return n;
        //First apply Binary search

		int s = 0;
		int e = n;
    
		while(s <= e)
		{
			int m = s + (e - s) / 2;

			if((long)m * m == (long)n)
			{
				return m;
			}
			else if((long)m * m > (long)n)
			{
				e = m - 1;
			}
			else
				s = m + 1;

		}
        return e;

    }
}