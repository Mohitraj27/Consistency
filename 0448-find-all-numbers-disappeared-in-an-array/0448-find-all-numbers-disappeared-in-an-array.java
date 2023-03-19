class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        
        List<Integer> result=new ArrayList<Integer>();
        
        
        /*Algorithm Used
        1. Extracting indx of each element of the array by iterating using for loop
        2. while extracting indx we'r making each element +ve using Math.abs function and 
        indx of every element is less than its element.
        3. after iteration -1 is multiplied to each element
        4. Using this way each element is tranversed and whichever element couldn't multiplied
        by -1 (i.e +ve element) is added to the array list and the array list containing duplicated is 
        returned.
            
        */
        //Step 1 to 3
        for(int i=0;i<nums.length;i++)
        {
            int indx=Math.abs(nums[i])-1;
            if(nums[indx]<0)
                continue;
            nums[indx]*=-1;
            }
        
        //Below code is step 4
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                result.add(i+1);
        }
        return result;
        
        
        
    }
}