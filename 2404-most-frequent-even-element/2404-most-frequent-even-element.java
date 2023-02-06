class Solution {
    public int mostFrequentEven(int[] nums) {
        
        //input constraint for nums[i] of the problem is 10^5 so i've incremented by one 
        int freq[]=new int[100001];
        //here map is used for iterating each input element to the array frequency
        for(int i:nums)
        {
            freq[i]++;
        }
        //this max_freq is intilaized to zero cause it will no of repeating element in the array
        int max_freq=0;
        //this ans will give the final result
        int ans=-1;
        for(int i=0;i<freq.length;i++)
        {
            //condition for even element and checking which appear the most
            if(i%2==0 && freq[i]>max_freq)
            {
                max_freq=freq[i];
                ans=i;
            }
        }return ans;
    }
}