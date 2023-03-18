class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int i,n;
       List<Integer> duplicates =new ArrayList<Integer>();
        Arrays.sort(nums);
        //Algorithm Used
        /*
        1. Sort the Arrays first so that each dupliactes elements are next to each other 
        2. check for each duplicates by iterating through each element using for loop
        3. add that duplicates element in the decalred array list
        4. return the array list after closing the if statement and for loop such thatv
        all the duplicates must be added in the array list
        
        */
        for( i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            { 
                duplicates.add(nums[i]);
            }
            
        }
        
        return duplicates;
                
        
        
    }
}