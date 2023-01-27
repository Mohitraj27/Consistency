class Solution {
    public void nextPermutation(int[] nums) {
        
        // Algorithm Used
        /*
        Step 1 Find the first decreasing sequence from end i.e the point of change
        
        Step 2  Find the number for substitution and swap 
        
        Step 3 Rearrange by reversing it.
        
        
        
        [1 1 5 4 6] >> [1 1 5 6 4] 
        So in the above 4 & 6 are the numbers starts changing from first decreases sequence from end
        
        
        */
        
        // Step 1 Find the first decreasing sequence from end i.e the point of change
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        
        // otherwise we have found the decreasing sequence and perform swap
        
        if(i>=0)
        {
            int j=nums.length-1;
            
            while(j>=0 && nums[j]<=nums[i])
                j--;
            //now we create and call the swap method
            swap(nums,i,j);
            
        }
        reverse(nums,i+1);
        
    }
    
    //swapping of elements 
    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void reverse(int[] nums, int start){
        int end=nums.length-1;
        while(start<end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}