class Solution {
    public int sumOfUnique(int[] nums) {
        // Map<Integer,Integer> map=new HashMap();
        // int res = 0;
        // for(int i:nums){
        //     int f = map.getOrDefault(i,-1);
        //     if(f == -1){
        //         res += i;
        //         map.put(i,1);
        //     }else if(f !=-1 && f != 0){
        //         res -= i;
        //         map.put(i,0);
        //     }
        // }
        // return res;
         int res = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                res += nums[i];
            }
        }
        return res;
    }
}


/**
    Step 1: Intaialize one Hash Map and Iterate through each element
    Step 2: and check whether the element exist inside the Map if not then update the map with that element and add to sum
    Step 3. If any duplicates element found then remove that element from the map and also subtract the element from total sum
    Step 4: return the final sum after performing the operation of sum of unique elements
    time - O(N) Space O(N)

    can also be solved through brute force approach O(N^2) Space O(N) 
 */