class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int n=nums.length;
        // majority element should be n/3
        int majoritycount=nums.length/3;
        
        // Using HashSet
        Set<Integer> result=new HashSet<>();
        //Nested for loop
        for(int i=0;i<n;i++)
        {
            //counting the elements which are more than one 
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {  count++;
            }
            }
        // if that element are more n/3 add it to the hashset
        if(count>majoritycount){
            result.add(nums[i]);
        }
        }
        //return the hashset in form of arraylist cause fucntion is in form of list
        return new ArrayList<>(result);
    }
}