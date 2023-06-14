class Solution {
    // approach same as that of subset on leetcode just add a extra condition for making combination 
    // for k subsets and not all subset
    /*
    implemnting a recursice backtracking approach
    we'll pick no from 1->n
    for each number 'x'
    after we've added 'x' to our current combination
    we'll continue our search from 'x+1'
    after accounting for 'x'
    we'll backtrack our steps to find the next combination
    means removing last element 'x'  from our current combination
    */
    public List<List<Integer>> combine(int n, int k) {
        
         List<List<Integer>> resultList=new ArrayList();
        
        
        //Start backtracking from the beginning
        backtrack(1,n,new ArrayList(),resultList,k);
        return resultList;
    }
      void backtrack(int start,int n,List<Integer> tempSet, List<List<Integer>> resultList,int k)
        
    {
          // condition as here only we need k size of combination from entire subset
            if(tempSet.size()==k)
            {
                resultList.add(new ArrayList(tempSet));
                return;
            }
            
        
        //Add the set to result set
       // resultList.add(new ArrayList(tempSet));
        for(int i=start;i<=n;i++)
        {
            
            //Case of including the number
            // case when you want to include the current element int that subset then add to the temp array list
            tempSet.add(i); 
            
            //Backtrack the new subset
            // now with that current element backtrack to the function for finding more subsets from that number 
            backtrack(i+1,n,tempSet,resultList,k);
            
            //Case of not-including the number
            // if you don't want to include that current element or that element is already presnt inside the arraylist
            tempSet.remove(tempSet.size()-1);
            
            
            
        }
}}