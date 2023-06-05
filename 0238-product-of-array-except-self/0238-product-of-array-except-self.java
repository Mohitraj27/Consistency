class Solution {
    public int[] productExceptSelf(int[] nums) {
         int len=nums.length;
        
        //Array to store the product of arrays element
        int res[]=new int[len];
        
        
        int productbeforeSelf=1;
        int productafterSelf=1;
        
        for(int i=0;i<len;i++)
        {
            res[i]=productbeforeSelf;
            productbeforeSelf*=nums[i];
        }
        for(int i=len-1;i>=0;i--)
        {
            res[i]*=productafterSelf;
            productafterSelf*=nums[i];
        }
        return res;
        
    }
}
