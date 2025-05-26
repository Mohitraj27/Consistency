class Solution {
    public boolean containsDuplicate(int[] nums) {
      
        HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])){
                return true;
            }
            
                ans.add(nums[i]);
            
          
        }  
        return false;
    }

    
}
