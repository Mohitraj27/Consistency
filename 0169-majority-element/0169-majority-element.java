class Solution {
    public int majorityElement(int[] nums) {
         
        //Brute-force Approach
//         Arrays.sort(nums);
//         return nums[nums.length/2];
        
        
        int count=0;
        int max=0;
        
        for(int ele: nums){
            if(count==0){
                max=ele;
            }
            
            if(ele==max){
                count=count+1;
            }else{
                count=count-1;
            }
        }
     return max;
    }
}