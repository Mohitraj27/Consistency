class Solution {
    public int countHillValley(int[] nums) {
        
        int count=0; 
        //Intiliaze with starting element of array
        int temp=nums[0];
        
        //Iterating through each element 
        for(int i=1;i<nums.length-1;i++)
        {
            //applied the condition given in the problem statement
         if (temp<nums[i] && nums[i]>nums[i+1] || temp>nums[i] && nums[i]<nums[i+1])
         {   
             //Adding all the elements which are making hills or valleys
             count++;
             //returning the intial element to temp
            temp=nums[i];
        } 
        }
        //finally returning the count variable after counting the hills and valleys
        return count;
        
    }
}