class Solution {
     
     public int maxProfit(int[] prices) {
       //for selling at maximum profit
        int max_profit=0;
        
        //purchasing at mininum price 
       int  min_price=Integer.MAX_VALUE;//Math.max(prices[0]);
        //for iterating through each single  days 
        for(int i=0;i<prices.length;i++)
        { 
            // i represents the no of days
            
           //if(prices[i+1]-prices[i]>max_prof) 
            // max_prof=prices[i+1]-prices[i];
            // return max_prof;
            
        min_price=Math.min(prices[i],min_price);
            max_profit=Math.max(max_profit,prices[i]-min_price);
        
        }
        return max_profit;
    
    }
}