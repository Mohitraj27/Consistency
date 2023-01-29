class Solution {
    public void sortColors(int[] nums) {
        
//         //Brute Force Approach
//         Arrays.sort(nums);
        
//         System.out.println(nums);
        
        //Optimized Solution >> Two Pointer approach
        
    //Using this Two pointer approach we can get O(N) complexity
        
        /*
        we are setting the left pointer for green balls i.e all the zeros at left side
        similary for right pointer all the blue balls at right most side
        remaining balls in the middle 
        
        and we swapping from the left most to right and gradually we are incrementing and decrementing the left and right pointer such that all the blue balls get set at right and green at left side
        This way all the balls will get sorted.
        
        */
    int left_pointer=0, middle_pointer=0, right_pointer=nums.length-1;
        
        while(middle_pointer<=right_pointer)
        {
            if(nums[middle_pointer]==0)
                swap(nums,left_pointer++, middle_pointer++);
            else if(nums[middle_pointer]==2)
                swap(nums,middle_pointer,right_pointer--);
            
            else
                middle_pointer++;
            
            
        }
    
    }
    
    //for swapping the elements 
    private void swap(int [] nums,int p1,int p2)
    {
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
    
    
}