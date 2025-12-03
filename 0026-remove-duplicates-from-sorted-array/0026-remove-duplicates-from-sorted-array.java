class Solution {
    public int removeDuplicates(int[] nums) {
         Set<Integer> seen=new LinkedHashSet<>();
        
        for(int i:nums){
            seen.add(i);
        }
        // LinkedHashSet instead of HashSet cause it doesn't preseve the order
    // First inserted all the elements in Set and then iterated throughout the set and printed all the elements
        int k=0;
        for(int i:seen){
            nums[k++]=i;
        }

        return k;
    }
}