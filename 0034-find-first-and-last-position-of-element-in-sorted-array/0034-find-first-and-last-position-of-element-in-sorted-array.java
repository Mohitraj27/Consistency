class Solution {
    public int[] searchRange(int[] nums, int target) {
     
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==target)
//                 return i;
//         }
//          return -1;
         int[] out=new int[2];
        int j=0;

        for(int i=0;i<nums.length;i++)
            if(nums[i]==target){
                 if(j==0)
                    out[0]=out[1]=i;
                else
                    out[1]=Math.max(out[1], i);
                j++;
            }
               
                   
        return j<1? new int[]{-1,-1}:out;

    }
}