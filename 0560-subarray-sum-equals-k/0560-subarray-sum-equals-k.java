class Solution {
    /*
   In order to generate all the subarrays, we need two nested       loops. 
    First loop decides the starting index of the subarray.
   Second loop traverses from the starting index and generates all      possible subarrays from that.
  At each point we check whether we have reached the required sum.
  If so, i and j are the starting and ending indexes of the subarray, now we check whether the length of the current subarray is greater than the value we found so far.
Else, we move on to the next possible one
    */
    
    public static int subarraySum(int[] arr, int k) {
        int n=arr.length;
        int maxLength=0;
        for(int i=0;i<n;i++)
        {     
            int sum=0;
        for(int j=i;j<n;j++)
        {
            sum+=arr[j];
            if(sum == k)
            {
            maxLength++;    
        //maxLength=Math.max(maxLength,(j-i+1));
            } 
        }
    }
    return maxLength;
        
        
        
}
    
    
}