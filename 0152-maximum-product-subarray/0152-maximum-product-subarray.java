class Solution {
    public int maxProduct(int[] nums) {
        
        int n=nums.length;
        //both pointer are intialized with 1
        int leftprod=1;
        int rightprod=1;
        int ans =nums[0];
        
        for(int i=0;i<n;i++)
        {
            //if any of the leftproduct or rightproduct becomes 0 then update it to 1
            leftprod = leftprod == 0 ? 1: leftprod;
            rightprod = rightprod==0 ? 1: rightprod;
            
            //keep on itertaing from leftmost element of array and storing it on 
            //leftProduct variable by taking the product
            
            //prefix product
            leftprod*=nums[i];
            
            
            //keep on itertaing from rightmost element of array i.e last element
            // and storing it on rightProduct variable by taking the product 
            //suffix product
            rightprod*=nums[n-1-i];
            
            //comparing the max among the two updated values i.e rightproduct subarray and leftproduct
            // subarray after each iteration this will keep on updating the max product subarray 
            // atlast when the iteration is completed final ans will be returned
            ans=Math.max(ans,Math.max(leftprod,rightprod));
            
        }
        return ans;
    }
}