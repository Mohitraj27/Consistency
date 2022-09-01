class Day_74 {
    public int missingNumber(int[] nums) {
         int result = nums[0]^0;
		
        for(int i=1;i<nums.length;i++){
            result = result^i;
            result = result^nums[i];
        }
        result = result^nums.length;
        
        return result;
    }
}