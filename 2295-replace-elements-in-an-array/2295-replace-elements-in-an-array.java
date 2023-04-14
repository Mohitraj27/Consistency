class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
       
        
     HashMap<Integer,Integer> store= new HashMap<>();
    for(int i=0;i<nums.length;i++) store.put(nums[i],i);
    for(var i:operations){
        nums[store.get(i[0])]= i[1];              //replace value to its index
        store.put(i[1],store.get(i[0]));       //update new value with its index
    }
    return nums;
    }
}