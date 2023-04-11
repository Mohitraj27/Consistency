class Solution {
    public int arrayPairSum(int[] nums) {
        
        //First we'll sort the arrays
        Arrays.sort(nums);
        int sum=0;
        //Iterating through each elements and making a pair of two and taking the minimum among two
        for(int i=1;i<nums.length;i+=2)
        {
            sum+=Math.min(nums[i],nums[i-1]);
        }
        //returing the sum of pair elements
        return sum;
        
        
    }
}