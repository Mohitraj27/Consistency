
class Solution {
     public List<List<Integer>> permuteUnique(int[] nums) {
    //algorihtm same as permutations I just sort the element and write a condition to remove duplicates
         List<List<Integer>> list = new ArrayList<>();
     
         Arrays.sort(nums);
    // to remove duplicates i've passed used array as boolean function
         backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] used){
    
    if(tempList.size() == nums.length){
    
        list.add(new ArrayList<>(tempList));
    
    }  
    else{
        for(int i = 0; i < nums.length; i++){
             // condition to remove duplicates
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
            used[i] = true; 
            //add the current element for possible permuataion
            tempList.add(nums[i]);
            // backtrack that element 
            backtrack(list, tempList, nums, used);
            used[i] = false; 
            //remove that element whose permutation is not possible
            tempList.remove(tempList.size() - 1);
        }
    }   
    }
}