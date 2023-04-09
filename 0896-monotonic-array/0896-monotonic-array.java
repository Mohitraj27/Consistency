class Solution {
    public boolean isMonotonic(int[] nums) {
      
        //Approach
        /*
        1. increasing and decreasing variables are intialized to false intially
        2. each element is iterated using for loop 
        3. condition for monotoncity is applied for both 
        4. boolean value returned using ternary operator if both increasing and decreasing monotonicty condition are true
        */
        boolean increasing = false, decreasing = false;
        
     for(int i = 1; i< nums.length; i++){
         if(nums[i] < nums[i-1]) decreasing = true;
         if(nums[i] > nums[i-1]) increasing = true;
     }
     return increasing && decreasing ? false: true;
    
        }
}