class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int max = 0, s=0;
        //Find the minimum load of conveyor belt
        for(int i : weights)
        {
            max = Math.max(i,max);
            s = s+i;
        }
        int start = max, end = s,ans=0;;

        while(start <= end)
        {
            int mid = start + (end - start) / 2 ;

            int sum = 0, daycount = 1;
            for(int i = 0 ;i< weights.length; i++)
            {
        
                if(sum + weights[i] > mid)
                {
                    sum = weights[i];
                    daycount++;
                }
                else
                {
                    sum = sum + weights[i];
                }
            }
            if(daycount > days)
            {
                start = mid + 1;
            }
            else
            {
                ans = mid;
                end = mid - 1;
            }
               
        }
        return ans;
    }
}