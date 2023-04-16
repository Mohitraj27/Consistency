 class Solution
{
     
     //Problem is same as that of subset just here we've to remove the duplicates
     public List<List<Integer>> subsetsWithDup(int[] nums) {
     
         Arrays.sort(nums);
        List<List<Integer>> resultList=new ArrayList<>();
        
        
        //Start backtracking from the beginning
        backtrack(resultList,new ArrayList<>(),nums,0);
        return resultList;
        
        
    }
    
    
    
    private void backtrack(List<List<Integer>> resultSets,List<Integer> tempSet, int [] nums,int start)
        
    {
        
        //Add the set to result set
        resultSets.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i-1]==nums[i]) continue;
            //Case of including the number
            tempSet.add(nums[i]);
            
            //Backtrack the new subset
            backtrack(resultSets,tempSet,nums,i+1);
            
            //Case of not-including the number
            tempSet.remove(tempSet.size()-1);
            
            
            
        }
        
 }}