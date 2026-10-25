class Solution {
    public long maximizeSum(int[] nums, int k) 
    {
        int n= nums.length; 
        long sum=0;
        int[] gain = new int[n];

        for(int i=0 ; i<n; i++)
        {
            int maxNum = rearrange(nums[i]);

            sum += nums[i];
            gain[i] = maxNum - nums[i];
        }

        Arrays.sort(gain);

        for(int i=n-1 ; i>=n-k; i--)
        {
            sum+= gain[i];
        }

        return sum;
    }

    static int rearrange(int num)
    {
        int[] digit = new int[10];
        int count =0; 
        
        while(num>0)
        {
            digit[count++] = num%10;;
            num = num/10;
        }


        Arrays.sort(digit,0,count);

        int res=0;
        for(int j=count-1 ; j>=0 ; j--)
        {
            res = res * 10 + digit[j];
        }
    
        return res;
    }
}