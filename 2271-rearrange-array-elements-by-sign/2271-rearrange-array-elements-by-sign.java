class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive_nums =new ArrayList<>();
        
        List<Integer> negative_nums =new ArrayList<>();
        

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negative_nums.add(nums[i]);
                
            }else{
                positive_nums.add(nums[i]);
                
            }
        }


        int[] result = new int[nums.length];
        int posIndex = 0, negIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = positive_nums.get(posIndex++);
            } else {
                result[i] = negative_nums.get(negIndex++);
            }
        }

        return result;
    }
}