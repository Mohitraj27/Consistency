class Solution {
    
    public int maxProfit(int[] prices) {
      //initialise bought and sell as variables to store buy and sell price
        int bought = prices[0],sellprice = prices[0];
        int n = prices.length;
        int profit = 0;
        for(int i = 0; i< n ; i++){
            //if element has higher value than sell price the update sell price
            if(prices[i] > sellprice){
                sellprice = prices[i];
                if(i == n-1) profit += sellprice - bought;
            }
            //if element has lower or equal to value than sellprice increase the profit and update the buy and sell price 
            else if(prices[i] < sellprice || i == n-1){
                profit+= sellprice - bought;
                bought = prices[i];
                sellprice = prices[i];
            };
            //if element is the last element then we add the latest sold price to the sum profit and return it
        }
        return profit;
        
        
    }
}