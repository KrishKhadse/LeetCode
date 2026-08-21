class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int start = 1, end = findMax(piles);

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            long hour = 0;
            for(int i=0; i<piles.length; i++)
            {
                hour = hour + (long)Math.ceil((double)piles[i] / mid);   //Dividing each pile with speed(mid) to check the time koko takes to finish each pile
            }

            if(hour <= h)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }

        return start;
    }

    static int findMax(int[] arr)
    {
        int max = 0;
        for(int i=0; i<arr.length; i++)
        {
            max = Math.max(max,arr[i]);
        }

         return max;
    }
}