
//Leetcode Problem Two sum

class Day_209
{
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                // if(nums[i]+nums[j]=target)
                // System.out.println(nums[i]+nums[j]);
if(nums[j]== target - nums[i])
                  return new int[]{i,j};
            }
            
        }
    return null;
}
}