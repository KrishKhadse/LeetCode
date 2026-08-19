class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // if(m==0)
        // {
        //     nums1[0]=nums2[0];
        //     return;
        // }

        int j=n-1, i=m-1, k=nums1.length-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i] >= nums2[j])
            {
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }

        //Useful When Array 1 get exhausted but we are having elements in array2
        if(j>=0)
        {
           while(j>=0)
            {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }

    }
}