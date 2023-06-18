

class Solution{
    public boolean canPartition( int arr[])
    { // time - O(n*m) space -O(m)
        int N=arr.length;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%2!=0) return false;
        sum=sum/2;
        
        //logic
        boolean[] dp=new boolean[sum+1];
        dp[0]=true;
        
        for(int i:arr){
            for(int j=sum;j>=i;j--){
                dp[j]=dp[j] | dp[j-i];
            }
        }
        
        return dp[sum];
        
    }
}