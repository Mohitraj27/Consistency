class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // time - O(N^2) Space O(N)
        if(nums==null || nums.length<3 )
            return new ArrayList<>();
        Arrays.sort(nums);
       Set<List<Integer>> result=new HashSet<>();
        
        //now fix the first element and find the other two elements 
        for(int i=0;i<nums.length-2;i++){
            
            // find other two elements using two sum approach
            int left=i+1;
            int right=nums.length-1;
            
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                
                if(sum==0){
                    //add the set, and move to find other triplets
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0)
                    left++;
                
                else
                    right--;
                
            }
            
            
        }
     return new ArrayList<>(result);   
    }
}