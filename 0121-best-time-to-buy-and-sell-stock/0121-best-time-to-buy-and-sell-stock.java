class Solution {
    public int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int len = arr.length;
        int max_profit =0;
        for(int i=0;i<len;i++){
            if(arr[i]<min){
                min = arr[i];
            }else if(arr[i]-min >max_profit){
                max_profit = arr[i]-min;
            }
        }
        return max_profit;


        
    }
}

