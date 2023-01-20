class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int result[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            result[i]=nums[i]*nums[i];
        }
         Arrays.sort(result);
        return result;
        
        
    }
}