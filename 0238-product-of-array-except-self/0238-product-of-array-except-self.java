class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        //finding prefix sum(product)
        int product=1;
        for(int i=0 ;i<nums.length; i++)
        {
            answer[i] = product;
            product *= nums[i];
        }


        //finding sufix sum(product) for each element and concurrently multiplyinh with prefix sum to get answer array
        product=1;
        for(int j=nums.length-1; j>=0; j--)
        {
            answer[j] = answer[j] * product;
            product *= nums[j];
        }
        
        return answer;

    }
}