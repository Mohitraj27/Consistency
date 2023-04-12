class Solution {
        public int findShortestSubArray(int[] nums) {
            
 HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int x=0;int min=Integer.MAX_VALUE;
        int maxMap = (Collections.max(hm.values()));
        for (Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(entry.getValue()==maxMap){
                 x=arr.lastIndexOf(entry.getKey())-arr.indexOf(entry.getKey())+1;
                 min=Math.min(x,min);
            }
        }
        return min;
    }
        
//   Below code doesn't work for 2nd test case
        // Arrays.sort(nums);
        
//         int max_freq=0;
        
//         int count_degree=0;
        
//         for(int i=0;i<nums.length;i++)
//         {
//             int count=1;
//             for(int j=i+1;j<nums.length;j++){
//             if(nums[i]==nums[j])
//             {  count++;
            
//         }
            
//         }
//         if(count>max_freq){
//             max_freq=count;
//             count_degree=nums[i];
//         }
//     }
//         return max_freq;
        
    
}