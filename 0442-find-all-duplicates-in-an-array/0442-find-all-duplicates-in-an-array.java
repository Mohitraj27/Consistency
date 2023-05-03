class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList duplicates=new ArrayList<Integer>();
        Arrays.sort(nums);
        int i=0;
        //for(int i=0;i<nums.length-1;i++)
        while( i<nums.length-1)
        {
            if(nums[i]==nums[i+1])
             duplicates.add(nums[i]);
          i++;
        }
         return duplicates;
    }
        
}