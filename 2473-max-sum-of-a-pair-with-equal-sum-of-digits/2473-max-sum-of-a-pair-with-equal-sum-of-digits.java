class Solution {
    public int maximumSum(int[] nums) {
        /**
        Below is the HashMap for Storing the sum of Digits of each numbers
        18 -> 9
        43 -> 7
        36 -> 9 
        13 -> 4
        7  -> 7 
        (18+36 ) res -> 54 (cause both has sum of digits as 9)
        (43 + 7) res -> 50 (cause both has sum of digits as 7)
        Max among two were 54
         */
        Map<Integer,Integer> map=new HashMap<>();
        int res = -1;
        for(int i = 0;i < nums.length;i++){
            int current_elem_Sum = sum(nums[i]);
            if(map.containsKey(current_elem_Sum)){
                res = Math.max(res,nums[i]+map.get(current_elem_Sum));
                if(nums[i]>map.get(current_elem_Sum)){
                    map.put(current_elem_Sum,nums[i]);
                }
            }else{
                map.put(current_elem_Sum,nums[i]);
            }

        }
        return res;
    }
    private int sum(int n){
        int sum =0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}